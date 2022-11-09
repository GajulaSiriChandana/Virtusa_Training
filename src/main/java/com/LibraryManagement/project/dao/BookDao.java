package com.LibraryManagement.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.LibraryManagement.project.model.Book;

public interface BookDao extends JpaRepository<Book, String> {
	Book findByBookId(String string);
	
	@Query("from Book order by bookName")
	List<Book> findByBookNameSorted();
}
