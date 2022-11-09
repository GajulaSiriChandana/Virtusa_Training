package com.LibraryManagement.project.librariancontrollers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.LibraryManagement.project.model.IssueBook;
import com.LibraryManagement.project.service.LibrarianService;

@Controller
public class ReturnBookController {
	@Autowired
	private LibrarianService librarianService;
	
	@RequestMapping("returnBook")
	public String ReturnBook() {
		return "checkfine.jsp";
	}
	
	@RequestMapping("returnBookFormData")
	public String getReturnBookFormData(HttpServletRequest request,@RequestParam("bid") String bid,@RequestParam("sid") String sid) {
		if(librarianService.returnBook(bid,sid)) {
			request.setAttribute("j", "9");
			return "librariansection.jsp";
		}
		request.setAttribute("k", "10");
		return "returnbook.jsp";
	}
	
	@RequestMapping("checkFine")
	public String checkFine() {
		return "checkfine.jsp";
	}
	
	@RequestMapping("checkFineFormData")
	public String checkFine(HttpServletRequest request, @RequestParam("bid") String bookId, @RequestParam("sid") String studentId, @RequestParam("idate") String date,Model m) {
		IssueBook issueBook=librarianService.checkFine(bookId,studentId,date);
		if(librarianService.checkFine(bookId,studentId,date)!=null) {
			m.addAttribute("issueBook",issueBook);
			//request.setAttribute("j", "9");
			HttpSession session=request.getSession();
			session.setAttribute("first", "fine");
			return "checkfineList.jsp";
		}
		request.setAttribute("k", "10");
		return "checkfine.jsp";
	}
	
	@RequestMapping("payment")
	public String payPayment(HttpServletRequest request,IssueBook is) {
		return "returnbook.jsp";
		
	}
}
