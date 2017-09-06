<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/login.js"></script>
<title>The Department</title>
</head>
<body>
	<form:form commandName="department" method="post" action="checkLogin.html">
		<table>
			<tr>
				<td>Enter Id: <form:input id="empId" type="text" path="id" /></td>
				<td><input type="submit" id="check" value="Check" name="checkLogin"/></td>
				<td><div class="numero" style="display: none; color: red">Enter a numeric value</div></td>
			</tr>
			<tr></tr>
			<c:if test="${not empty departments}">
				<tr>
					<td>Department: &nbsp;&nbsp;&nbsp;&nbsp; <form:select path="deptId">
							<form:option value="" label="Select" />
							<form:options items="${departments}" />
						</form:select>
					<td>
				</tr>
				<tr><td><input type="submit" id="submit" value="Home" name="home"/><td></tr>
			</c:if>

		</table>
	</form:form>
	<br>
	<br>
	<br>

</body>
</html>