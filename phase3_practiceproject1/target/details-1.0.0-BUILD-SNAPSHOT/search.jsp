<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String f = request.getParameter("id");
	session.setAttribute("id", f);
%>
<html>
<head>
<title>User details page</title>
</head>
<body style="text-align:center">
	<h3>User Details:</h3>
	<sql:setDataSource var="data" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/db_world" user="root" password="root" />

	<sql:query dataSource="${data}" var="result">
            SELECT * from userdetails where userId='<%=session.getAttribute("id")%>';
    </sql:query>

<table border="2" align="center">
<tr>
<th>UserId</th>
<th>Name</th>  
<th>Age</th>
<th>Country</th>
</tr>
<c:forEach var="show" items="${result.rows}">
<tr>
<td>${show.userId}</td>
<td>${show.name}</td>
<td>${show.age}</td>
<td>${show.country}</td>
<td><a href="editform/${show.userId}">Edit</a></td>
</tr>
</c:forEach>
</table>
<c:choose>
<c:when test="${result.rowCount==0}">
	Sorry! Not Available for that ID
</c:when>
</c:choose>
</body>
</html>
