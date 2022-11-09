package com.LibraryManagement.project.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.LibraryManagement.project.model.Book;
import com.LibraryManagement.project.model.IssueBook;

public interface LibrarianServiceInt {
	public boolean addBooks(HttpServletRequest request,Book book);
	public List<Book> viewBooks();
	public int deleteBookById(HttpServletRequest request,Book book);
	public int issueBook(HttpServletRequest request,String bookId,String studentId,IssueBook ib,Model m);
	public List<IssueBook> viewIssuedBooks();
	public boolean returnBook(String bid,String sid);
	public IssueBook checkFine(String bid,String sid,String rdate);

}
