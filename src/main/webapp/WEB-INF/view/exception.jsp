<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<title>The Department - Exception</title>
<body>

	<c:if test="${not empty errCode}">
		<h3>Error Code: ${errCode}</h3>
	</c:if>

	<c:if test="${empty errCode}">
		<h3>System Errors</h3>
	</c:if>

	<c:if test="${not empty errMsg}">
		<h3>Error Message: ${errMsg}</h3>
	</c:if>

</body>

</html>