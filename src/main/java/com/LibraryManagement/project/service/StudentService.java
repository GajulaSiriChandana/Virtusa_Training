package com.LibraryManagement.project.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LibraryManagement.project.dao.IssueBookDao;
import com.LibraryManagement.project.dao.StudentDao;
import com.LibraryManagement.project.model.IssueBook;
import com.LibraryManagement.project.model.Student;

@Service
public class StudentService implements StudentServiceInt{
	
	@Autowired
	private StudentDao sdao;
	@Autowired
	private IssueBookDao ibdao;
	
	public boolean studentLogin(Student student) {
		Student stud = sdao.findById(student.getStudentId()).orElse(null);
		if(stud != null) {
			if(stud.getStudentPassword().equals(stud.getStudentPassword()))
				return true;
		}
		return false;
	}
	
	public List<IssueBook> viewBooks(HttpServletRequest request){
		//IssueBook ib = ibdao.findAll(studentId).get();
		HttpSession session = request.getSession();
		String studId=(String)session.getAttribute("student");
		return ibdao.findAll();
	}
}
