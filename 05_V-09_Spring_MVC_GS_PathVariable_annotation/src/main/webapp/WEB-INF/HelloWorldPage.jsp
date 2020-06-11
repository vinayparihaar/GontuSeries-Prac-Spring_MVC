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
	<h1>My first Spring MVC application Demo</h1>
	<h2>${messageHelloWorld}</h2>
</body>
</html>