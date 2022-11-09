package com.LibraryManagement.project.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.LibraryManagement.project.sequenceGenerator.StringPrefixedSequenceIdGenerator;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "bookId_seq")
    @GenericGenerator(name="bookId_seq",
            strategy = "com.LibraryManagement.project.sequenceGenerator.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @Parameter(name=StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value="1"),
                    @Parameter(name=StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value="B_"),
                    @Parameter(name=StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value="%05d")
            }
            )
	private String bookId;
	@Pattern(regexp="[a-zA-Z ]{4,}",message="*must contain only alphabets with atleast size 4")
	private String bookName;
	@Pattern(regexp="[a-zA-Z ]{4,}",message="*must contain only alphabets with atleast size 4")
	private String bookAuthor;
	@Pattern(regexp="[a-zA-Z ]{4,}",message="*must contain only alphabets with atleast size 4")
	private String bookPublisher;
	//@Min(value=1)
	private int bookQuantity;
	private int bookIssued;
	private Date bookAddDate;
	
	public void setBookAddDate(Date bookAddDate) {
		this.bookAddDate = bookAddDate;
	}
	@ManyToOne
	private Librarian librarian;
	
	@OneToMany(mappedBy="book")
	List<IssueBook> issueBooks=new ArrayList<IssueBook>();
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public int getBookQuantity() {
		return bookQuantity;
	}
	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}
	public Date getBookAddDate() {
		return bookAddDate;
	}
	public int getBookIssued() {
		return bookIssued;
	}
	public void setBookIssued(int booksIssued) {
		this.bookIssued = booksIssued;
	}
	public Librarian getLibrarian() {
		return librarian;
	}
	public void setLibrarian(Librarian librarian) {
		this.librarian = librarian;
	}
	
	public List<IssueBook> getIssueBooks() {
		return issueBooks;
	}
	public void setIssueBooks(List<IssueBook> issueBooks) {
		this.issueBooks = issueBooks;
	}

}
