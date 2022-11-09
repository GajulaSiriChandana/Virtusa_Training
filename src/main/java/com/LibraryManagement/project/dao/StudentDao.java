package com.LibraryManagement.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LibraryManagement.project.model.Student;

public interface StudentDao extends JpaRepository<Student, String> {
	Student findByStudentId(String string);

}
