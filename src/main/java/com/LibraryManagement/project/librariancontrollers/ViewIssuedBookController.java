package com.LibraryManagement.project.librariancontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LibraryManagement.project.model.IssueBook;
import com.LibraryManagement.project.service.LibrarianService;

@Controller
public class ViewIssuedBookController {
	@Autowired
	private LibrarianService librarianService;
	@RequestMapping("viewissuedbooks")
	public String getViewIssuedBooks(Model m) {
		List<IssueBook> issuebooklist=librarianService.viewIssuedBooks();
		m.addAttribute("viewissuedbooks", issuebooklist);
		return "viewissuedbooks.jsp";
	}
}
