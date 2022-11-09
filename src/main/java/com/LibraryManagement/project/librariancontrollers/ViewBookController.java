package com.LibraryManagement.project.librariancontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LibraryManagement.project.model.Book;
import com.LibraryManagement.project.service.LibrarianService;

@Controller
public class ViewBookController {
	@Autowired 
	private LibrarianService ls;
	@RequestMapping("viewbooks")
	public String getViewLibrarian(Model m) {
		List<Book> booklist=ls.viewBooks();
		m.addAttribute("viewbook", booklist);
		return "viewbooks.jsp";
	}


}
