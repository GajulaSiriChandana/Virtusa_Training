package com.LibraryManagement.project.service;

import javax.servlet.http.HttpServletRequest;

import com.LibraryManagement.project.model.Admin;
import com.LibraryManagement.project.model.Librarian;

public interface AdminServiceInt {
	public boolean adminLogin(Admin admin);
	public boolean addLibrarian(HttpServletRequest request,Librarian librarian);
	public boolean deleteLibrarianById(Librarian librarian)throws Exception;

}
