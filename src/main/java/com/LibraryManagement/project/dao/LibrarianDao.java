package com.LibraryManagement.project.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LibraryManagement.project.model.Librarian;

public interface LibrarianDao extends JpaRepository<Librarian, String> {
	Librarian findByLibrarianId(String string);


}
