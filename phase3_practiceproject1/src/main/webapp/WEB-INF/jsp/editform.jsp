<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit form</title>
</head>
<body  style="text-align:center">
	<h2>Edit User Details!</h2>

	<form:form method="POST" action="/details/editsave" modelAttribute="user">
User ID: <form:input path="userId"/>
		<br><br>
Name: <form:input path="name"/>
		<br><br>
Age: <form:input path="age"/>
		<br><br>
Country: <form:input  path="country"/>
		<br><br>
		<input type="submit" value="Save"/>
	</form:form>
</body>
</html>
