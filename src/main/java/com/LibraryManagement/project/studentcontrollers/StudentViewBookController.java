package com.LibraryManagement.project.studentcontrollers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LibraryManagement.project.model.IssueBook;
import com.LibraryManagement.project.service.StudentService;

@Controller
public class StudentViewBookController {
	@Autowired 
	private StudentService ss;
	@RequestMapping("studviewbooks")
	public String getViewLibrarian(HttpServletRequest request,Model m) {
		List<IssueBook> booklist=ss.viewBooks(request);
		m.addAttribute("studviewissuedbooks", booklist);
		return "studentviewbooks.jsp";
	}

}
