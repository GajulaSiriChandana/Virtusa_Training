<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style9.css">
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
<%
String k=(String)request.getAttribute("k");
if(k!=null){
	out.println("<script>alert('Please enter valid  credentials')</script>");
}
%>
	<br>
	<!-- <div>
	<h2 align="center">Check Book Fine</h2>
	<center>
		<form action="checkFineFormData" method="post">
			<table align="center">

				<tr>
					<td>Book Id:</td>
					<td><input type="text" name="bid" required></td>
				</tr>
				<tr>
					<td>Student Id:</td>
					<td><input type="text" name="sid" required></td>
				</tr>
				<tr>
					<td>Return Date:</td>
					<td><input type="date" name="rdate" required></td>
				</tr>

				<tr>
					<td></td>
					<td align="center"><input type="submit" value="Check"
						style="width: 132px" class=button></td>
		
				</tr>
				<tr>
					<td></td>

					<td align="center"><a href="returnbook.jsp"><input
							type="button" value="Back" class=button></a></td>
				</tr>

			</table>

		</form> -->
		<div class="adminloginbox">
            <img src="book.png" class="avatar">
            <h1>CHECK FINE</h1>
            <form action="checkFineFormData" method="post">
                <p>Book ID</p>
                <input type="text" name="bid" placeholder="Enter the BookID" required>
                 <p>Student ID</p>
                <input type="text" name="sid" placeholder="Enter the StudentID" required>
				<p>Return Date</p>
				<input type="Date" name="idate" placeholder="Enter Date(YYYY-MM-DD)" required><br>
				<input type="submit" value="Check" class=button><br>
                <a href="librariansection.jsp"><input type="button" value="Back" class=button></a>
                

            </form>

        </div><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <br><br>
	
	<%-- <center>
		<table border="1" bgcolor="black" style="border-color:white" border-width: 5px>
		<tr>
		<td style="color:pink">Issue Id</td>
		<td style="color:pink">Book Id</td>
		<td style="color:pink">Student Id</td>
		<td style="color:pink">Student Name</td>
		<td style="color:pink">Student Contact</td>
		<td style="color:pink">Issued Date</td>
		<td style="color:pink">Due Date</td>
		<td style="color:pink">Fine</td>
		<td style="color:pink">Librarian Id</td>
		</tr>
		
			<tr>
			<td style="color:white">${issueBook.issueId}</td>
			<td style="color:white">${issueBook.book.bookId}</td>
			<td style="color:white">${issueBook.student.studentId}</td> 
			<td style="color:white">${issueBook.student.studentName}</td>
			<td style="color:white">${issueBook.student.studentContact}</td>
			<td style="color:white">${issueBook.issuedDate}</td>
			<td style="color:white">${issueBook.dueDate}</td>
			<td style="color:white">${issueBook.fine}</td>
			<td style="color:white">${issueBook.librarian.librarianId}</td>
			</tr>
		
		</table><br><br><br><br><br><br><br><br><br><br> --%>
		
</body>
</html>