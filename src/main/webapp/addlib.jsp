<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Login</title>
        <link rel="stylesheet" type="text/css" href="style3.css">
    </head>
    <body>
        <div class="adminloginbox">
            <img src="loginID.png" class="avatar">
            <h1>ADD LIBRARIAN</h1>
            <form:form action="addLibrarianFormData" modelAttribute="lib">
			<table align="center">
				<tr>
					<td><p>UserName</p></td>
					<td><form:input path="librarianUserName"
							placeholder="Enter the username" /></td>
				</tr>
				<tr>
					<td colspan="3" style="font-size: 15px"><form:errors
							path="librarianUserName" cssClass="error" /></td>
				</tr>
				<tr>
					<td><p>Password</p></td>
					<td><form:password path="librarianPassword"
							placeholder="Enter Password" /></td>
				</tr>
				<tr>
					<td colspan="3" style="font-size: 15px"><form:errors
							path="librarianPassword" cssClass="error" /></td>
				</tr>
				<tr>
					<td><p>Gender:</p></td>
					<td><form:input path="librarianGender"
							placeholder="Enter Male Or Female" />
				</tr>
				<tr>
					<td colspan="3" style="font-size: 15px"><form:errors
							path="librarianGender" cssClass="error" /></td>
				</tr>
				<tr>
					<td><p>Address</p></td>
					<td><form:input path="librarianAddress"
							placeholder="Enter your address" /></td>
				</tr>
				<tr>
					<td colspan="3" style="font-size: 15px"><form:errors
							path="librarianAddress" cssClass="error" /></td>
					<td></td>
				</tr>
				<tr>
					<td><p>Contact NO</p></td>
					<td><form:input path="librarianContact"
							placeholder="Enter contactNo" /></td>
				</tr>
				<tr>
					<td colspan="3" style="font-size: 15px"><form:errors
							path="librarianContact" cssClass="error" /></td>
					<td></td>
				</tr>
				<tr>
					<td><p>Email</p></td>
					<td><form:input path="librarianEmail"
							placeholder="Enter Email" /></td>
				</tr>
				<tr>
					<td colspan="2" style="font-size: 15px"><form:errors
							path="librarianEmail" cssClass="error" /></td>
					<td></td>
				</tr>
				<tr>
					<td><input type="Submit"
						style="width: 100px; padding: 15px 0; text-align: center; margin: 20px 10px; border-radius: 25px; font-weight: bold; border: 2px solid rgb(0, 153, 148); background: transparent; color: rgb(222, 226, 230); cursor: pointer; position: relative; overflow: hidden;"
						value="Add"></td>
					<td><a href="adminsection.jsp"><button type="button">back</button></a></td>
				</tr>


			</table>
		</form:form>

        </div>
    </body>
</html>