package com.LibraryManagement.project.admincontrollers;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LibraryManagement.project.model.Librarian;
import com.LibraryManagement.project.service.AdminService;

@Controller
public class DeleteLibrarianController {
	@Autowired 
	private AdminService as;
	
	Logger l=LoggerFactory.getLogger(DeleteLibrarianController.class);
	
	@RequestMapping("deleteLibrarian")
	public String getDeleteLibrarian() {
		return "dellib.jsp";
	}
	
	@RequestMapping("deleteLibrarianFormData")
	public String getDeleteLibrarianFormData(HttpServletRequest request,Librarian librarian) {
		if(as.deleteLibrarianById(librarian)) {
			request.setAttribute("c", "3");
			return "adminsection.jsp";
		}
//		request.setAttribute("d", "4");
		return "dellib.jsp";
	}
}
