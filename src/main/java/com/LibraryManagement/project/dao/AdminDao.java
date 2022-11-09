package com.LibraryManagement.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LibraryManagement.project.model.Admin;

public interface AdminDao extends JpaRepository<Admin, String> {
	Admin findByAdminUserName(String name);

}
