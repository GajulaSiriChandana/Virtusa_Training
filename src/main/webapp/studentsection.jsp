<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <html>
    <head>
    <title>Librarian Page</title>
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
    <link rel="stylesheet" href="libloginstyle.css">
    </head>
    <body>
    <%
	String e=(String)request.getAttribute("b");
	if(e!=null){
		out.println("<script>alert('Book added successfully')</script>");
	}
	String f=(String)request.getAttribute("f");
	if(f!=null){
		out.println("<script>alert('Book deleted successfully')</script>");
	}
	String g=(String)request.getAttribute("g");
	if(g!=null){
		out.println("<script>alert('Book issued successfully')</script>");
	}

	String j=(String)request.getAttribute("j");
	if(j!=null){
		out.println("<script>alert('Book returned successfully')</script>");
	}

	String k=(String)request.getAttribute("k");
	if(k!=null){
		out.println("<script>alert('Please enter valid credentials')</script>");
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
					<li><a href="#"><i class="fa fa-user"></i>LOGIN</a>
						<div class="sub-menu-1">
							<ul>
								<li><a href="adminlogin.jsp">ADMIN LOGIN</a></li>
								<li><a href="librarianlogin.jsp">LIBRARIAN LOGIN</a></li>
							</ul>
						</div>
					</li>
					<li><a href="#"><i class="fa fa-user"></i>ABOUT US</a></li>
					<li><a href="#"><i class="fa fa-phone"></i>CONTACT US</a></li>
				</ul>
			</div>
		</header>
		<section>
			<div class="libsec_img"></div>
			<div class="content"><br><br><br><br><br><br><br><br><br><br>
				<h2>WELCOME TO THE STUDENT PAGE</h2>
				<div>
					<a href="studviewbooks"> <button type="button"><span></span>VIEW BOOKS</button></a><br>
                   	<a href="duedatebooks"><button type="button"><span></span>DUE DATE BOOKS</button></a><br>
                   	<a href="studlogout"><button type="button"><span></span>LOG OUT</button></a>
				</div>
			</div>
		</section>
	</div>
    </body>
 </html>