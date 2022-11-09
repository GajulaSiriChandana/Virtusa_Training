package com.LibraryManagement.project.studentcontrollers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LibraryManagement.project.model.Student;
import com.LibraryManagement.project.service.StudentService;

@Controller
public class StudentLoginController {
	@Autowired
	private StudentService ss;
	
	@RequestMapping("studentLogin")
	public String getstudentLogin() {
		return "studentlogin.jsp";
	}
	
	@RequestMapping("studentLoginFormData")
	public String getlibrariansection(HttpServletRequest request, Student student) {
		if (ss.studentLogin(student)) {
			HttpSession session = request.getSession();
			session.setAttribute("student", student.getStudentId());
			return "studentsection.jsp";
		}
		return "studentlogin.jsp";
	}

}
