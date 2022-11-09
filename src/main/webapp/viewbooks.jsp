<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style5.css">
</head>
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
<body>
	<header style="padding:50px; color: white">
			
			<h1 align="center">LIBRARY MANAGEMENT SYSTEM</h1>

			
		</header>
		<center>
		<table>
		<tr>
		<th style="color:black">Book Id</th>
		<th style="color:black">Book Name</th>
		<th style="color:black">Book Author</th>
		<th style="color:black">Book Publisher</th>
		<th style="color:black">Total Quantity</th>
		<th style="color:black">Book Quantity</th>
		<th style="color:black">Book Issued</th>
		<th style="color:black">Book AddDate</th>
		</tr>
		<c:forEach var="book" items="${viewbook}">
			<tr>
			<td>${book.bookId}</td>
			<td>${book.bookName}</td>
			<td>${book.bookAuthor}</td>
			<td>${book.bookPublisher}</td>
			<td>${(book.bookQuantity + book.bookIssued)}</td>
			<td>${book.bookQuantity}</td>
			<td>${book.bookIssued}</td>
			<td>${book.bookAddDate}</td>
			
			</tr>
		</c:forEach>
		</table><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
		
		<a href="librariansection.jsp"><input type="button" value="Back" class=button></a><br><br><br><br>
		<footer style="padding:5px">
			<center><h2 style="color:white">&copy;By SiriChandana</h2></center>
		</footer>		
</body>
</html>