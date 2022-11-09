<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Login</title>
        <link rel="stylesheet" type="text/css" href="style4.css">
    </head>
    <body>
    <%
    String ex=(String)request.getAttribute("ex");
    if(ex!=null){
    	out.println("<script>alert('Sorry! cannot delete book as it is issued to some student')</script>");
    }
	String m=(String)request.getAttribute("m");
	if(m!=null){
		out.println("<script>alert('Sorry cannot delete the book...only book added librarian can delete book')</script>");
	}
	%>
        <div class="adminloginbox">
            <img src="loginID.png" class="avatar">
            <h1>DELETE BOOK</h1>
            <form action="deleteBookFormData">
                <p>Book Id</p>
                <input type="text" name="bookId" placeholder="Enter Book Id" required>
                <div>
                  <input type="Submit" style="width: 100px;
	padding: 15px 0;
	text-align: center;
	margin: 20px 10px;
	border-radius: 25px;
	font-weight: bold;
	border: 2px solid rgb(0, 153, 148);
	background: transparent;
	color: rgb(222, 226, 230);
	cursor: pointer;
	position: relative;
	overflow: hidden;" value="Delete">
                    <a href="librariansection.jsp"><button type="button">back</button></a>
                 </div>
                

            </form>
<%
String a=(String)request.getAttribute("a");
if(a!=null){
	
	//out.println("<script>alert(a);</script>");
	out.println("<p style='color:red;font-size:15px'>"+a+"</p>");
}
%>
        </div>
    </body>
</html>