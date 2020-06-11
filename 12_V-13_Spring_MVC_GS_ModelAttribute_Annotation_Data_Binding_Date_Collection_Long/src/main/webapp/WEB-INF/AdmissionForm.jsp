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
	<h2>Student Admission form</h2>
	<form
		action="/07_10_Spring_MVC_GS_RequestParam_annotation/submitAdmissionForm.html"
		method="post">
		<table>
			<tr>
				<td>Student's Name :</td>
				<td><input type="text" name="studentName"></td>
			</tr>

			<tr>
				<td>Student's Hobby :</td>
				<td><input type="text" name="studentHobby"></td>
			</tr>

			<tr>
				<td>Student's Mobile :</td>
				<td><input type="text" name="studentMobile"></td>
			</tr>

			<tr>
				<td>Student's DOB :</td>
				<td><input type="text" name="dob"></td>
			</tr>

			<tr>
				<td>Student's SkillSet :</td>
				<td><select name="studentSkills" multiple="multiple">

						<option value="Core Java">Core Java</option>
						<option value="Adv Java">Adv Java</option>
						<option value="Spring IOC">Spring IOC</option>
						<option value="Spring AOP">Spring AOP</option>
						<option value="Spring MVC">Spring MVC</option>

				</select></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit"
					value="Submit this form by clicking here"></td>
				<td></td>
			</tr>
		</table>

	</form>
</body>
</html>