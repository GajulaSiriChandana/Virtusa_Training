<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <html>
    <head>
    <title>Admin Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<style type="text/css">
nav {
	float: right;
	word-spacing: 30px;
	padding: 20px;
}

nav li {
	display: inline-block;
	line-height: 80px;
}
</style>
</head>
    <link rel="stylesheet" href="adminloginstyle.css">
    </head>
    <body>
    <%
	String b=(String)request.getAttribute("b");
	if(b!=null){
		out.println("<script>alert('Librarian added successfully')</script>");
	}
	String c=(String)request.getAttribute("c");
	if(c!=null){
		out.println("<script>alert('Librarian deleted successfully')</script>");
	}
	%>
    <div class="wrapper">
		<header>
			<div class="logo">
				<img src="9.png">
				<h1 style="color: white;">ONLINE LIBRARY MANAGEMENT SYSTEM</h1>
			</div>
			<div class="menu-bar">
				<ul>
					<li><a href="index.jsp"><i class="fa fa-home"></i>HOME</a></li>
					<li><a href="#"><i class="fa fa-user"></i>ABOUT US</a></li>
					<li><a href="#"><i class="fa fa-phone"></i>CONTACT US</a></li>
					<li><a href="#"><i class="fa fa-user"></i>LOGIN</a>
						<div class="sub-menu-1">
							<ul>
								<li><a href="adminLogin">ADMIN LOGIN</a></li>
								<li><a href="librarianLogin">LIBRARIAN LOGIN</a></li>
								<li><a href="studentLogin">STUDENT LOGIN</a></li>
							</ul>
						</div>
					</li>
				</ul>
			</div>
		</header>
		<section>
			<div class="adminsec_img"></div>
			<div class="content"><br><br>
				<h2>WELCOME TO THE ADMIN PAGE</h2>
				<a href="addLibrarian"> <button type="button"><span></span>ADD LIBRARIAN</button></a><br><br>
                <a href="viewLibrarian"><button type="button"><span></span>VIEW LIBRARIAN</button></a><br><br>
                <a href="deleteLibrarian"> <button type="button"><span></span>DELETE LIBRARIAN</button></a><br><br>
				<a href="logout"><button type="button"><span></span>LOG OUT</button></a>
			</div>
		</section>
	</div>
    </body>
 </html>