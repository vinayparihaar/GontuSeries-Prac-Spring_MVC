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
	<h1>Congratulations!!! University has Processed your application.</h1>
	<h2>${message}</h2>
</body>
</html>