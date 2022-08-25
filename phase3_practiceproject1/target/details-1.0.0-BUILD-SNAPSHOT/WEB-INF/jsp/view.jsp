<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view page</title>
</head>
<body style="text-align:center">
<h2>User details</h2>
<table border="2" align="center">
<tr>
<th>UserId</th>
<th>Name</th>  
<th>Age</th>
<th>Country</th>
</tr>
<c:forEach var="us" items="${userList}">
<tr>
<td>${us.userId}</td>
<td>${us.name}</td>
<td>${us.age}</td>
<td>${us.country}</td>
</tr>
</c:forEach>
</table>
</body>
</html>