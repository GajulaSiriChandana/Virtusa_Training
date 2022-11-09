package com.LibraryManagement.project;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.boot.test.context.SpringBootTest;

import com.LibraryManagement.project.dao.AdminDao;
import com.LibraryManagement.project.dao.BookDao;
import com.LibraryManagement.project.dao.IssueBookDao;
import com.LibraryManagement.project.dao.LibrarianDao;
import com.LibraryManagement.project.model.Admin;
import com.LibraryManagement.project.model.Book;
import com.LibraryManagement.project.model.IssueBook;
import com.LibraryManagement.project.model.Librarian;
import com.LibraryManagement.project.service.AdminService;
import com.LibraryManagement.project.service.LibrarianService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Date;
import java.util.List;

@TestMethodOrder(OrderAnnotation.class)
@SpringBootTest
class LibraryManagementApplicationTests {
	
	@Autowired
	AdminDao ad;
	
	@Autowired
	LibrarianDao ld;
	
	@Autowired
	BookDao bd;
	
	@Autowired
	IssueBookDao id;

	@Autowired
	AdminService as;
	
	@Autowired
	LibrarianService ls;
	
	@Test
	@Order(1)
	public void testAddLibrarian() {
		Librarian lib=new Librarian();
		Admin adm=new Admin();
		lib.setLibrarianUserName("Prasanna");
		lib.setLibrarianPassword("prasu_777");
		lib.setLibrarianEmail("prasu@gmail.com");			//Add Librarian
		lib.setLibrarianAddress("Banglore");
		lib.setLibrarianGender("Female");
		lib.setLibrarianContact("6399984182");
		lib.setAdmin(adm);
		lib.getAdmin().setAdminId("A101");
		ld.save(lib);
		assertNotNull(ld.findById(lib.getLibrarianId()).get());
	}
	
	@Test
	@Order(2)
	public void testadminLogin() {
		Admin admin = ad.findByAdminUserName("Siri");
		if(admin.getAdminPassword().equals("siri")) {
			assertNotNull(admin);
		}
	}
	
	@Test
	@Order(3)
	public void testlibrarianLogin() {
		Librarian librarian = ld.findByLibrarianId("Lib_0001");
		if(librarian.getLibrarianPassword().equals("karthik")) {
			assertNotNull(librarian);
		}
	}

	@Test
	@Order(4)
	public void testDeleteLibrarian() {
		Librarian lib=ld.findById("Lib_0004").get();
		as.deleteLibrarianById(lib);					//Delete Librarian 										
        assertThat(ld.existsById(lib.getLibrarianId())).isFalse();
    }
	
	@Test
	@Order(5)
	public void testViewLibrarians() {					
        List<Librarian> librarians = ld.findAll();			//View Librarian
        assertThat(librarians).size().isGreaterThan(0);
    }
	

	@Test
	@Order(6)
	public void testAddBook() {
		Book b=new Book();
		Librarian lib=new Librarian();
		b.setBookName("Machine Learning");
		b.setBookAuthor("Harsha");
		b.setBookPublisher("Rahul");
		b.setBookQuantity(1);
		String date="2022-10-14";						 //Add Book
		Date d=Date.valueOf(date);
		b.setBookAddDate(d);
		b.setLibrarian(lib);
		b.getLibrarian().setLibrarianId("Lib_0002");
		bd.save(b);
		assertNotNull(bd.findById(b.getBookId()).get());
	}
		
	@Test
	@Order(7)
	public void testDeleteBook() {
		bd.deleteById("B_00003");
		assertThat(bd.existsById("B_00003")).isFalse();
    }
	
	@Test
	@Order(8)
	public void testViewBooks() {					
        List<Book> books = bd.findAll();			//View Books
        assertThat(books).size().isGreaterThan(0);
    }
	
	@Test
	@Order(9)
	public void testCheckFine() {					//Check Fine
		IssueBook ibook=ls.checkFine("B_00002", "STUD_00002","2022-11-01");
		assertNotEquals(ibook.getFine(),0.0);	
	}
	
	@Test
	@Order(10)
	public void testReturnBook() {
		boolean result=ls.returnBook("B_00002", "STUD_00002");
		assertEquals(true,result);
	}
	
}