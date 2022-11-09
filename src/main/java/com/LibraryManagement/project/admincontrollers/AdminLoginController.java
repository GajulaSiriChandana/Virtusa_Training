package com.LibraryManagement.project.admincontrollers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LibraryManagement.project.model.Admin;
import com.LibraryManagement.project.service.AdminService;

@Controller
public class AdminLoginController {
	@Autowired 
	private AdminService as;
	
	//Logger l=LoggerFactory.getLogger(AdminLoginController.class);
	
	@RequestMapping("adminLogin")
	public String getAdminLogin() {
		return "adminlogin.jsp";
	}
	
	@RequestMapping("adminLoginFormData")
	public String getAdminLoginFormData(HttpServletRequest request,Admin admin) {
		if(as.adminLogin(admin)) {
			HttpSession session=request.getSession();
			session.setAttribute("admin",admin.getAdminUserName());
			return "adminsection.jsp";
		}
		//request.setAttribute("a","1");
		return "adminlogin.jsp";
	}


}
