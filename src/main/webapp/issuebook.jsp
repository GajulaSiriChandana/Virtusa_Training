<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>IssueBook</title>
        <link rel="stylesheet" type="text/css" href="style6.css">
    </head>
    <body>
    <%
String e=(String)request.getAttribute("e");
if(e!=null){
	out.println("<script>alert('Book does not exist in the library')</script>");
}

String f=(String)request.getAttribute("f");
if(f!=null){
	out.println("<script>alert('Please enter valid student id')</script>");
}

String h=(String)request.getAttribute("h");
if(h!=null){
	out.println("<script>alert('Sorry! unable to issue book the QUANTITY is 0')</script>");
}

String date=(String)request.getAttribute("date");
if(date!=null){
	out.println("<script>alert('Please enter correct date i.e, today date')</script>");
}

String t=(String)request.getAttribute("notallow");
if(t!=null){
	out.println("<script>alert('Sorry! Same book cannot be issued to student more than once')</script>");
}
%>
        <div class="adminloginbox">
            <img src="loginID.png" class="avatar">
            <h1>ISSUE BOOK</h1>
            <form action="issueBookFormData">
                <p>Book ID</p>
                <input type="text" name="bId" placeholder="Enter the bookId" required>
                <p>Student ID</p>
                <input type="text" name="sId" placeholder="Enter studentId" required><br>
                <p>Issuing Date</p>
                <input type="Date" name="iDate" placeholder="Enter Issuing Data" required><br>
                
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
	overflow: hidden;" value="Add">
                    <a href="librariansection.jsp"><button type="button">back</button></a>
                 </div>
                

            </form>

        </div>
    </body>
</html>