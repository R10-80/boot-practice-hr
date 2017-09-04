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

	<table>
		<tr>
			<td>Enter Id: <input id="empId" type="text" /></td>
			<td><button id="check" value="check">Check</button></td>
			<td><div class="numero" style="display: none; color: red">Enter a numeric value</div></td>
		</tr>
	</table>

    <br><br><br>

	<div class = "departmento" style="display:none">
succc
	</div>

</body>
</html>