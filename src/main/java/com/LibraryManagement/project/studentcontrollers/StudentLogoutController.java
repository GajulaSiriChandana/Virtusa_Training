package com.LibraryManagement.project.studentcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentLogoutController {
	@RequestMapping("studlogout")
	public String logout() {
		return "index.jsp";
	}

}
