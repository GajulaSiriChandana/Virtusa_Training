package com.LibraryManagement.project.librariancontrollers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LibraryManagement.project.exception.BookNotFoundException;
import com.LibraryManagement.project.model.Book;
import com.LibraryManagement.project.service.LibrarianService;

@Controller
public class DeleteBookController {
	@Autowired
	private LibrarianService ls;
	
	//Logger l=LoggerFactory.getLogger(DeleteBookController.class);
	
	@RequestMapping("deletebook")
	public String getdeletebook() {
		return "delbook.jsp";
	}
	
	@RequestMapping("deleteBookFormData")
	public String getDeleteBookFormData(HttpServletRequest request,Book book) {
		int check=ls.deleteBookById(request,book);
		if(check==1) {
			request.setAttribute("c", "3");
			return "librariansection.jsp";
		}
		if(check==2) {
			request.setAttribute("m", "9");
			return "delbook.jsp";
		}
		
		
		if(check==3) {
			request.setAttribute("ex", "10");
			return "delbook.jsp";
		}
		throw new BookNotFoundException();
		
	}
}
