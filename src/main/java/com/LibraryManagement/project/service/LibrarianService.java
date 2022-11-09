package com.LibraryManagement.project.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.LibraryManagement.project.dao.BookDao;
import com.LibraryManagement.project.dao.IssueBookDao;
import com.LibraryManagement.project.dao.LibrarianDao;
import com.LibraryManagement.project.dao.StudentDao;
import com.LibraryManagement.project.exception.LibrarianNotFoundException;
import com.LibraryManagement.project.model.Book;
import com.LibraryManagement.project.model.IssueBook;
import com.LibraryManagement.project.model.Librarian;
import com.LibraryManagement.project.model.Student;

@Service
public class LibrarianService implements LibrarianServiceInt {
	@Autowired
	private LibrarianDao ldao;
	@Autowired
	private BookDao bdao;
	@Autowired
	private StudentDao sdao;
	@Autowired
	private IssueBookDao ibdao;

	public boolean librarianLogin(Librarian librarian) {
		Librarian lib = ldao.findById(librarian.getLibrarianId()).orElse(null);
		if (lib != null) {
			if (librarian.getLibrarianPassword().equals(lib.getLibrarianPassword())) {
				return true;
			}
		}
		throw new LibrarianNotFoundException();
		// return false;
	}

	public boolean addBooks(HttpServletRequest request, Book book) {
		HttpSession session = request.getSession();
		String libId = (String) session.getAttribute("librarian");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String d1[] = dateFormat.format(date).split("-");
		String d[] = book.getBookAddDate().toString().split("-");
		if (!(d1[0].equals(d[0]) && d1[1].equals(d[1]) && d1[2].equals(d[2]))) {
			return false;
		}
		Librarian librarian = ldao.findById(libId).get();
		librarian.getBooks().add(book);
		book.setLibrarian(librarian);
		ldao.save(librarian);
		bdao.save(book);
		return true;
	}

	public List<Book> viewBooks() {
		return bdao.findByBookNameSorted();
	}

	public int deleteBookById(HttpServletRequest request, Book book) {
		int check = 0;
		try {

			Book b = bdao.findById(book.getBookId()).orElse(null);
			HttpSession session = request.getSession();
			String libid = (String) session.getAttribute("librarian");

			if (b != null) {
				if (b.getLibrarian().getLibrarianId().equals(libid)) {
					check = 1;
					bdao.delete(b);
					return check;
				} else {
					check = 2;
					return check;
				}
			}
		} catch (Exception e) {
			return check = 3;
		}
		return check;
	}

	public int issueBook(HttpServletRequest request, String bookId, String studentId, IssueBook ib, Model m) {
		int available = 0;
		
		List<IssueBook> issueBooks = ibdao.findAll();
		for(IssueBook ibook:issueBooks) {
			if(bookId.equals(ibook.getBook().getBookId()) && studentId.equals(ibook.getStudent().getStudentId())) {
				available=6;
				return available;
			}
		}
		
		HttpSession session = request.getSession();
		String libid = (String) session.getAttribute("librarian");

		Librarian lib = ldao.findById(libid).orElse(null);
		lib.getIssueBooks().add(ib);
		ib.setLibrarian(lib);
		Book b = bdao.findById(bookId).orElse(null);
		Student s = sdao.findById(studentId).orElse(null);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String d1[] = dateFormat.format(date).split("-");
		String d[] = ib.getIssuedDate().toString().split("-");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, +15);
		String afterDate = dateFormat.format(cal.getTime());
		ib.setDueDate(afterDate);
		if (!(d1[0].equals(d[0]) && d1[1].equals(d[1]) && d1[2].equals(d[2]))) {
			available = 5;
			return available;
		}
		if (b == null) {
			available = 1;
			return available;
		}
		if (s == null) {
			available = 2;
			return available;
		}
		if (b != null && s != null) {
			available = 3;
			if (b.getBookQuantity() >= 1) {
				b.getIssueBooks().add(ib);
				int q = b.getBookQuantity();
				q--;
				b.setBookQuantity(q);
				int i = b.getBookIssued();
				i++;
				b.setBookIssued(i);
				ib.setBook(b);

				s.getIssueBooks().add(ib);
				ib.setStudent(s);

				ldao.save(lib);
				bdao.save(b);
				ibdao.save(ib);
			} else {
				available = 4;
				return available;
			}
		}
		return available;
	}

	public List<IssueBook> viewIssuedBooks() {
		return ibdao.findAll();
	}

	public boolean returnBook(String bid, String sid) {
		List<IssueBook> ibl = ibdao.findAll();
		for (IssueBook ib : ibl) {
			if (ib.getBook().getBookId().equals(bid) && ib.getStudent().getStudentId().equals(sid)) {
				ibdao.delete(ib);
				Book b = bdao.findById(bid).orElse(null);
				int q = b.getBookQuantity();
				q++;
				b.setBookQuantity(q);
				int i = b.getBookIssued();
				i--;
				b.setBookIssued(i);
				bdao.save(b);
				return true;
			}
		}
		return false;
	}

	public IssueBook checkFine(String bid, String sid, String rdate) {
		List<IssueBook> ibl = ibdao.findAll();
		for (IssueBook ib : ibl) {
			if (ib.getBook().getBookId().equals(bid) && ib.getStudent().getStudentId().equals(sid)) {
				double fine = ib.getFine();

				if (fine != 0) {
					fine = 0.0;
				}
				final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				String dueDate = ib.getDueDate();
				final LocalDate firstDate = LocalDate.parse(dueDate, formatter);
				final LocalDate secondDate = LocalDate.parse(rdate, formatter);
				long days = ChronoUnit.DAYS.between(firstDate, secondDate);
				if (days > 0) {
					for (int i = 1; i <= days; i++) {
						fine = fine + 10;
					}
				}
				ib.setFine(fine);
				IssueBook issueBook = ibdao.save(ib);
				return issueBook;
			}
		}

		return null;
	}

}
