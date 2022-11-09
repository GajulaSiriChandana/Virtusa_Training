package com.LibraryManagement.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LibraryManagement.project.model.IssueBook;

public interface IssueBookDao extends JpaRepository<IssueBook, String> {
	IssueBook findByIssueId(Integer Integer);

}
