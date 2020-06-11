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
	<p>
		Current Date and Time :
		<%=new Date()%>
	</p>
	<h1>Student Admission form</h1>
	<form
		action="/07_10_Spring_MVC_GS_RequestParam_annotation/submitAdmissionForm.html" method="post">
		<p>
			Student's Name : <input type="text" name="studentName">
		</p>
		<p>
			Student's Hobby : <input type="text" name="studentHobby">
		</p>
		<input type="submit" value="Submit this form by clicking here">
	</form>
</body>
</html>