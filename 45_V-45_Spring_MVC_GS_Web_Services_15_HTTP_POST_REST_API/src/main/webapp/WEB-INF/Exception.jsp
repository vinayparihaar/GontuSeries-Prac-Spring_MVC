<%@page import="java.util.Date"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exception Page</title>
</head>
<body>
	<p>
		<spring:message code="label.currentDateTime" />
		<%=new Date()%>
	</p>
	<h1>
		<spring:message code="label.headerMessage" />
	</h1>

	<h2>
		<spring:message code="label.sorryMessage" />
	</h2>

	<h3>Application has encountered Error.Please contact support team
		by sending an email at support@parihar.com</h3>
</body>
</html>