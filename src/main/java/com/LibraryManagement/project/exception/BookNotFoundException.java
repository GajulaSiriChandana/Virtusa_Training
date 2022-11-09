package com.LibraryManagement.project.exception;

public class BookNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return "Book ID doesn't exit...Please enter valid details";
	}
}