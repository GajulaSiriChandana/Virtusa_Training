package com.LibraryManagement.project.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.LibraryManagement.project.sequenceGenerator.StringPrefixedSequenceIdGenerator;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "studentId_seq")
    @GenericGenerator(name="studentId_seq",
            strategy = "com.LibraryManagement.project.sequenceGenerator.StringPrefixedSequenceIdGenerator",
            parameters = {
                    @Parameter(name=StringPrefixedSequenceIdGenerator.INCREMENT_PARAM,value="1"),
                    @Parameter(name=StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER,value="STUD_"),
                    @Parameter(name=StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER,value="%05d")
            }
            )
	private String studentId;
	private String studentPassword;
	private String studentName;
	private String studentYear;
	private String studentBranch;
	private String studentSemester;
	private String studentContact;
	
	@OneToMany(mappedBy="student")
	List<IssueBook> issueBooks=new ArrayList<IssueBook>();
	
	public List<IssueBook> getIssueBooks() {
		return issueBooks;
	}
	public void setIssueBooks(List<IssueBook> issueBooks) {
		this.issueBooks = issueBooks;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentYear() {
		return studentYear;
	}
	public void setStudentYear(String studentYear) {
		this.studentYear = studentYear;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public String getStudentSemester() {
		return studentSemester;
	}
	public void setStudentSemester(String studentSemester) {
		this.studentSemester = studentSemester;
	}
	public String getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	

}
