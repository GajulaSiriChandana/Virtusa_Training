package com.LibraryManagement.project.librariancontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibrarianLogoutController {
	@RequestMapping("libLogout")
	public String logout() {
		return "index.jsp";
	}
}
