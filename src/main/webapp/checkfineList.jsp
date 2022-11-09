<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style5.css">
<style> 
input[type=button], input[type=submit], input[type=reset] {
  background-color: #04AA6D;
  border: none;
/*   color: white; */
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  border-radius:10px;
  color: #fff;
  background-color:#0a0a23;
  min-height:30px; 
  min-width: 120px;
  box-shadow: 0px 0px 2px 2px rgb(0,0,0);
  cursor: pointer;
}
.button:hover {
      background-color:#002ead;
      transition: 0.7s;
  }
</style>
</head>
<body>
<header style="padding: 50px; color: white">

		<h1 align="center">LIBRARY MANAGEMENT SYSTEM</h1>


	</header>

		<center>
		<table>
		<tr>
		<th style="color:black">Issue Id</th>
		<th style="color:black">Book Id</th>
		<th style="color:black">Student Id</th>
		<th style="color:black">Student Name</th>
		<th style="color:black">Student Contact</th>
		<th style="color:black">Issued Date</th>
		<th style="color:black">Due Date</th>
		<th style="color:black">Fine</th>
		<th style="color:black">Librarian Id</th>
		<th style="color:black">Payment</th>
		</tr>
		
			<tr>
			<td>${issueBook.issueId}</td>
			<td>${issueBook.book.bookId}</td>
			<td>${issueBook.student.studentId}</td> 
			<td>${issueBook.student.studentName}</td>
			<td>${issueBook.student.studentContact}</td>
			<td>${issueBook.issuedDate}</td>
			<td>${issueBook.dueDate}</td>
			<td>${issueBook.fine}</td>
			<td>${issueBook.librarian.librarianId}</td>
			<td style="padding: 5px;"><a href="payment"><input type="button" value="Pay"></a><a href="librariansection.jsp"><input type="button" value="back"></a></td>
			</tr>
		
		</table>
</body>
</html>