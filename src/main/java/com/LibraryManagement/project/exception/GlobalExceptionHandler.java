package com.LibraryManagement.project.exception;

import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.LibraryManagement.project.admincontrollers.AdminLoginController;
import com.LibraryManagement.project.admincontrollers.DeleteLibrarianController;
import com.LibraryManagement.project.librariancontrollers.DeleteBookController;
import com.LibraryManagement.project.librariancontrollers.LibrarianLoginController;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	Logger l1=LoggerFactory.getLogger(AdminLoginController.class);
	Logger l2=LoggerFactory.getLogger(LibrarianLoginController.class);
	Logger l3=LoggerFactory.getLogger(DeleteLibrarianController.class);
	Logger l4=LoggerFactory.getLogger(DeleteBookController.class);
	
	@ExceptionHandler(AdminNotFoundException.class)
    public String handleEmptyInputExceptionException(HttpServletRequest request,AdminNotFoundException adminException){
		String msg = adminException.toString();
		request.setAttribute("a",msg);
		l1.error("AdminNotFoundException:"+msg);
		return "adminlogin.jsp";   
    }
	
	@ExceptionHandler(LibrarianNotFoundException.class)
    public String handleLibrarianNotFoundException(HttpServletRequest request,LibrarianNotFoundException lexception){
       
		String msg=lexception.toString();
		request.setAttribute("a",msg);
		l2.error("LibrarianNotFoundException:"+msg);
		return "librarianlogin.jsp";
	}
	
	@ExceptionHandler(DeleteLibrarianNotFoundException.class)
    public String handleDeleteLibrarianNotFoundException(HttpServletRequest request,DeleteLibrarianNotFoundException lexception){
		HttpSession session = request.getSession();
		String aname = (String) session.getAttribute("admin");
		String msg=lexception.toString();
		request.setAttribute("a",msg);
		l3.error("Admin Name :"+aname+" DeleteLibrarianNotFoundException:"+msg);
		return "dellib.jsp";
	}
	
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public String handleSQLIntegrityConstraintViolationException(HttpServletRequest request,SQLIntegrityConstraintViolationException sicvexception){
		HttpSession session = request.getSession();
		String aname = (String) session.getAttribute("admin");
		request.setAttribute("ex","exception");
		l3.error("Admin Name :"+aname+" SQLIntegrity Exception is handled when error has thrown in LibrarianService on line no.48");
		return "dellib.jsp";
	}
	
	//Exception for delete book
	@ExceptionHandler(BookNotFoundException.class)
    public String handleBookNotFoundException(HttpServletRequest request,BookNotFoundException dexception){
		HttpSession session = request.getSession();
		String libid = (String) session.getAttribute("librarian");
		String msg=dexception.toString();
		request.setAttribute("a",msg);
		l4.error("Librarian Id :"+libid+" BookNotFoundException:"+msg);
		return "delbook.jsp";
	}
	
}
