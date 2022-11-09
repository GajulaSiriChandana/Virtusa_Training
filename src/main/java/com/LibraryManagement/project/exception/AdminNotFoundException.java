package com.LibraryManagement.project.exception;

import org.springframework.stereotype.Component;

@Component
public class AdminNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Admin does not exist with the details entered";
	}
}
