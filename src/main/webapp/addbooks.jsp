<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="e" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Login</title>
        <link rel="stylesheet" type="text/css" href="style2.css">
    </head>
    <body>
    <%
String date=(String)request.getAttribute("date");
if(date!=null){
	out.println("<script>alert('Please enter correct date i.e, today date')</script>");
}
String q=(String)request.getAttribute("q");
if(q!=null){
	out.println("<script>alert('Sorry! Quantity cannot be zero')</script>");
} 

%>
        <div class="adminloginbox">
            <img src="book.png" class="avatar">
            <h1>ADD BOOKS</h1>
            <e:form action="addBookFormData" modelAttribute="book">
            <table align="center">
                <tr>
                <td><p>Book Name :</p></td>
                <td><e:input path="bookName" placeholder="Enter bookName"/></td></tr>
                <tr><td colspan="3" ><e:errors path ="bookName" cssClass="error"/></td></tr>
                <tr>
                <td><p>Book Author :</p></td>
                <td><e:input path="bookAuthor" placeholder="Enter Author"/></td></tr>
                <tr><td colspan="3"><e:errors path ="bookAuthor" cssClass="error"/></td></tr>
                <tr>
                <td><p>Book Publisher :</p></td>
                <td><e:input path="bookPublisher" placeholder="Enter Publisher"/></td></tr>
                <tr><td colspan="3"><e:errors path="bookPublisher" cssClass="error"/></td></tr>
                <tr>
				<td><p>Book Quantity:</p></td>
				<td><e:input path="bookQuantity"/></td></tr>
				<tr><td colspan="2"><e:errors path="bookQuantity" cssClass="error"/></td></tr>
                <tr>
                <td><p>Book Add Date :</p></td>
                <td><input type="date" name="bookAddDate" placeholder="Enter date(DD/MM/YYYY)" required></td></tr>
                
                
                <tr><td><input type="Submit" style="width: 100px;
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
	overflow: hidden;" value="Add"></td>
                    <td><a href="librariansection.jsp"><button type="button" style="position:relative;left:60px">back</button></a></td></tr>
                 
                
			</table>
            </e:form>

        </div>
    </body>
</html>