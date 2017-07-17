<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HR Login Form</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.min.css">

<link rel='stylesheet prefetch'	href='https://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900|RobotoDraft:400,100,300,500,700,900'>
<link rel='stylesheet prefetch'	href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

<script	src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
<script src="${pageContext.request.contextPath}/js/index.js"></script>


</head>

<body>

	<div class="pen-title">
		<h1>HR App Login</h1>
		<span>Pen <i class='fa fa-code'></i> by <a
			href='http://andytran.me'>Andy Tran</a></span>
	</div>
	<div class="rerun">
		<a href="">Rerun Pen</a>
	</div>
	<div class="container">
		<div class="card"></div>
		<div class="card">
			<h1 class="title">Login</h1>
			<form:form action="/bootHR/homePage" method="post" commandName="user">
				<div class="input-container">
					<form:input type="text" id="username" required="required" path="username" /> <label
						for="username">Username</label>
					<div class="bar"></div>
				</div>
				<div class="input-container">
					<form:input type="password" id="password" required="required" path="password"/> <label
						for="password">Password</label>
					<div class="bar"></div>
				</div>
				<div class="button-container">
					<button type="submit">
						<span>Go</span>
					</button>
				</div>
				<div class="footer">
					<a href="#">Forgot your password?</a>
				</div>
			</form:form>
		</div>
	</div>
	<a id="portfolio" href="http://andytran.me/" title="View my portfolio!"><i
		class="fa fa-link"></i></a>
	<a id="codepen" href="https://codepen.io/andytran/" title="Follow me!"><i
		class="fa fa-codepen"></i></a>


</body>
</html>
