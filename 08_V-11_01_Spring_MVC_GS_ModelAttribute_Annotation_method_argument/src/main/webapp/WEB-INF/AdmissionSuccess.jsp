<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Current Date and Time : <%=new Date() %> </p>
	<h1>${headerMessage}</h1>
	<h3>Congratulations!!! Parihar University has Processed your application.</h3>
	<h2>Details Submitted : </h2>
	
	<table>
	<tr>
	<td>Student Name :</td>
	<td>${student.studentName}</td>
	</tr>
	
	<tr>
	<td>Student Hobby :</td>
	<td>${student.studentHobby}</td>
	</tr>
	</table>
</body>
</html>