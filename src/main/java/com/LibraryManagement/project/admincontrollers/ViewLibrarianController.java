package com.LibraryManagement.project.admincontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LibraryManagement.project.model.Librarian;
import com.LibraryManagement.project.service.AdminService;


@Controller
public class ViewLibrarianController {
	@Autowired 
	private AdminService as;
	@RequestMapping("viewLibrarian")
	public String getViewLibrarian(Model m) {
		List<Librarian> librarianlist=as.viewLibrarian();
		m.addAttribute("viewlib", librarianlist);
		return "viewlibrarian.jsp";
	}

}
