<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Online Library Management System</title>
<link rel="stylesheet" type="text/css" href="style.css">
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


<body>
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
					<li><a href="#contactUs"><i class="fa fa-phone"></i>CONTACT US</a></li>
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
			<div class="sec_img"></div>
			<div class="content">
				<h1>LIBRARY MANAGEMENT SYSTEM</h1>
			</div>
		</section>
		<footer>
		<div id = "contactUs">
			<p style="color: white; text-align: center;">
				<br>
				<br> Email: Online.library@gmail.com <br> Mobile:
				+88018********
			</p>
		</div>
		</footer>
	</div>
</body>

</html>