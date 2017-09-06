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
<script src="${pageContext.request.contextPath}/css/style.css"></script>
<title>Welcome To ${deptName} Department</title>
</head>
<body>
	<h3>${deptName} Department</h3>
	<form:form>
		<table>
			<tr>
				<td>Address:</td>
			</tr>
			<tr>
				<td>Street: <c:out value="${details.address}" />
				</td>
				<td>Postal Code: <c:out value="${details.postalCode}"/></td>
			</tr>
			<tr>
				<td>City: <c:out value="${details.city}" /></td>
				<td>State: <c:out value="${details.state}" /></td>
			</tr>
			<tr>
				<td><c:out value="${details.region}" /></td>
				<td><c:out value="${details.country}" /></td>
			</tr>
		</table>

	Click Here for Supervisor Details: <button type="submit"
			name="supervisor" value="Supervisor Details" class="btn-link">Supervisor
			Details</button>

	</form:form>
</body>

<style>

.btn-link{
  border:none;
  outline:none;
  background:none;
  cursor:pointer;
  color:#0000EE;
  padding:0;
  text-decoration:underline;
  font-family:inherit;
  font-size:inherit;
}
.btn-link:active{
  color:#FF0000;
}

</style>


</html>