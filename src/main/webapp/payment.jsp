<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">

			<table border="2" bgcolor="white" style="border-color:black; border-width: 5px  ">
		<tr>
		<td style="color:red;border-width: 2px; padding: 5px; ">  Issue Id  </td>
		<td style="color:red;border-width: 2px; padding: 5px; ">  Book Id  </td>
		<td style="color:red;border-width: 2px; padding: 5px; ">  Student Id  </td>
		<td style="color:red;border-width: 2px; padding: 5px; ">  Student Name  </td>
		<td style="color:red;border-width: 2px; padding: 5px; ">  Student Contact  </td>
		<td style="color:red;border-width: 2px; padding: 5px; ">  Issued Date  </td>
		<td style="color:red;border-width: 2px; padding: 5px; ">  Due Date  </td>
		<td style="color:red;border-width: 2px; padding: 5px; ">  Amount  </td>

		</tr>
			<tr>
			<td>${issueBook.issueId}</td>
			<td>${issueBook.book.bookId}</td>
			<td>${issueBook.student.studentId}</td> 
			<td>${issueBook.student.studentName}</td>
			<td>${issueBook.student.studentContact}</td>
			<td>${issueBook.issuedDate}</td>
			<td>${issueBook.returnDate}</td>
			<td>${issueBook.fineAmount}</td>
			</tr>
		
		</table>
	
	</div>
</body>
</html>