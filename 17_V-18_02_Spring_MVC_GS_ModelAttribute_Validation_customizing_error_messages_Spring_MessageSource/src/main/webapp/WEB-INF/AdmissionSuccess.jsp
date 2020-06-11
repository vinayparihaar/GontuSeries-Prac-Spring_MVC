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
	<h1>${headerMessage}</h1>
	<h3>Congratulations!!! Parihar University has Processed your
		application.</h3>
	<h2>Details Submitted :</h2>

	<table>

		<tr>
			<td>Student Details :</td>
		</tr>
		<tr>
			<td>Student Name :</td>
			<td>${student.studentName}</td>
		</tr>

		<tr>
			<td>Student Hobby :</td>
			<td>${student.studentHobby}</td>
		</tr>

		<tr>
			<td>Student Mobile :</td>
			<td>${student.studentMobile}</td>
		</tr>

		<tr>
			<td>Student DOB :</td>
			<td>${student.dob}</td>
		</tr>

		<tr>
			<td>Student SkillSet :</td>
			<td>${student.studentSkills}</td>
		</tr>

		<tr>
			<td>Address :</td>
		</tr>

		<tr>
			<td>Line 1 :</td>
			<td>${student.studentAddress.addLineOne}</td>
		</tr>

		<tr>
			<td>Line 2 :</td>
			<td>${student.studentAddress.addLineTwo}</td>
		</tr>

		<tr>
			<td>City :</td>
			<td>${student.studentAddress.city}</td>
		</tr>

		<tr>
			<td>State :</td>
			<td>${student.studentAddress.state}</td>
		</tr>

		<tr>
			<td>Zipcode :</td>
			<td>${student.studentAddress.zipcode}</td>
		</tr>

		<tr>
			<td>Country :</td>
			<td>${student.studentAddress.country}</td>
		</tr>


	</table>
</body>
</html>