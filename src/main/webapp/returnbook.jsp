<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>ReturnBook</title>
        <link rel="stylesheet" type="text/css" href="style11.css">
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
  box-shadow: 0px 0px 2px 2px rgb(0,0,0);
  min-height:20px; 
  min-width: 100px;
  cursor: pointer;
}
.button:hover {
      background-color:#002ead;
      transition: 0.7s;
  }
</style>
    <body>
   <%
String k=(String)request.getAttribute("k");
if(k!=null){
	out.println("<script>alert('Please enter valid  credentials')</script>");
}
String go=(String)request.getAttribute("go");
if(go!=null){
	out.println("<script>alert('Kindly first check fine and then return')</script>");
}
%>
        <div class="adminloginbox">
            <img src="book.png" class="avatar">
            <h1>RETURN BOOK</h1>
            <form action="returnBookFormData">
                <p>Book ID</p>
                <input type="text" name="bid" placeholder="Enter the BookID">
                <p>Student ID</p>
                <input type="text" name="sid" placeholder="Enter the StudentID"><br>
				<!-- <p>Return Date</p>
				<input type="Date" name="rdate" placeholder="Enter Date(YYYY-MM-DD)" required><br>
				<input type="submit" value="Return Book"><br>
				<p>Want to check fine?</p> -->
				<input type="submit" value="Return" class=button><br>
                <tr>
					<td></td>
					<td align="center"><a href="librariansection.jsp"><input
							type="button" value="Back" class=button></a></td>
				</tr>
                

            </form>

        </div>
    </body>
</html>