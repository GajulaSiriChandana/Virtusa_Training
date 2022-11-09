<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Librarian Login</title>
        <link rel="stylesheet" type="text/css" href="style1.css">
    </head>
    <body>
        <div class="adminloginbox">
            <img src="loginID.png" class="avatar">
            <h1>LIBRARIAN LOGIN</h1>
            <form action="librarianLoginFormData">
                <p>Librarian ID</p>
                <input type="text" name="librarianId" placeholder="Enter Id" required>
                <p>Password</p>
                <input type="password" name="librarianPassword" placeholder="Enter Password" required><br>
                <div >
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
	overflow: hidden;" value="Login">
                    <!-- <a href="checkLoginDetails"> <button type="button"><span></span>Login</button></a> -->
                    <a href="index.jsp"><button type="button">back</button></a>
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