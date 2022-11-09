<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Login</title>
        <link rel="stylesheet" type="text/css" href="style10.css">
    </head>
    <body>
        <div class="adminloginbox">
            <img src="studentlogo.png" class="avatar">
            <h1>STUDENT LOGIN</h1>
            <form action="studentLoginFormData">
                <p>Student ID</p>
                <input type="text" name="studentId" placeholder="Enter Id" required>
                <p>Password</p>
                <input type="password" name="studentPassword" placeholder="Enter Password" required><br>
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

        </div>
    </body>
</html>