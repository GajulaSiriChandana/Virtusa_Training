package com.LibraryManagement.project.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LibraryManagement.project.dao.AdminDao;
import com.LibraryManagement.project.dao.LibrarianDao;
import com.LibraryManagement.project.exception.AdminNotFoundException;
import com.LibraryManagement.project.exception.DeleteLibrarianNotFoundException;
import com.LibraryManagement.project.model.Admin;
import com.LibraryManagement.project.model.Librarian;

@Service
public class AdminService implements AdminServiceInt{
	@Autowired
	private AdminDao adao;
	@Autowired
	private LibrarianDao ldao;
	public boolean adminLogin(Admin admin) {

		Admin ad=adao.findByAdminUserName(admin.getAdminUserName());
		if(ad!=null) {
			if(admin.getAdminPassword().equals(ad.getAdminPassword())) {
				return true;
			}
		}
		throw new AdminNotFoundException();
		//return false;
	}
	
	public boolean addLibrarian(HttpServletRequest request,Librarian librarian) {
		HttpSession session=request.getSession();
		String aname=(String)session.getAttribute("admin");
		Admin admin=adao.findByAdminUserName(aname);
		admin.getLibrarians().add(librarian);
		librarian.setAdmin(admin);
		adao.save(admin);
		ldao.save(librarian);
		return true;
	}
	
	public List<Librarian> viewLibrarian(){
		return ldao.findAll();
	}
	
	public boolean deleteLibrarianById(Librarian librarian){
		Librarian lib=ldao.findById(librarian.getLibrarianId()).orElse(null);
		 if(lib!=null) {
			 ldao.delete(lib);
			 return true;
		 }
		 throw new DeleteLibrarianNotFoundException();
		//return false;
	}

}
