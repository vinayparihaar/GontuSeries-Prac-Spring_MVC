<%@page import="java.util.Date"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admission Form</title>
</head>
<body>

<a href="/07_10_Spring_MVC_GS_RequestParam_annotation/admissionform.html?siteLanguage=en">English</a>
<a href="/07_10_Spring_MVC_GS_RequestParam_annotation/admissionform.html?siteLanguage=fr">French</a>
		<p>
		<spring:message code="label.currentDateTime"/>
		<%=new Date()%>
		</p>
	
	<h1>${headerMessage}</h1>
	
	<h2><spring:message code="label.admissionform"/></h2>
	
	<br>
	<p>
	<form:errors path="student.*" />
	</p>
	<br>
	
	<form
		action="/07_10_Spring_MVC_GS_RequestParam_annotation/submitAdmissionForm.html"
		method="post">
		
		<table>
		
			<tr>
				<td><spring:message code="label.studentName"/></td>
				<td><input type="text" name="studentName"></td>
			</tr>

			<tr>
				<td><spring:message code="label.studentHobby"/></td>
				<td><input type="text" name="studentHobby"></td>
			</tr>

			<tr>
				<td><spring:message code="label.studentMobile"/></td>
				<td><input type="text" name="studentMobile"></td>
			</tr>

			<tr>
				<td><spring:message code="label.dob"/></td>
				<td><input type="text" name="dob"></td>
			</tr>

			<tr>
				<td><spring:message code="label.studentSkills"/></td>
				<td>
				<select name="studentSkills" multiple="multiple">

						<option value="Core Java">Core Java</option>
						<option value="Adv Java">Adv Java</option>
						<option value="Spring IOC">Spring IOC</option>
						<option value="Spring AOP">Spring AOP</option>
						<option value="Spring MVC">Spring MVC</option>

				</select>
				</td>
			</tr>
			
			<tr>
				<td><spring:message code="label.studentaddress"/></td>
			</tr>
			
			<tr>
				<td><spring:message code="label.line1"/></td>
				<td><input type="text" name="studentAddress.addLineOne"></td>
			</tr>

			<tr>
				<td><spring:message code="label.line2"/></td>
				<td><input type="text" name="studentAddress.addLineTwo"></td>
			</tr>
			
			<tr>
				<td><spring:message code="label.city"/></td>
				<td><input type="text" name="studentAddress.city"></td>
			</tr>

			<tr>
				<td><spring:message code="label.state"/></td>
				<td><input type="text" name="studentAddress.state"></td>
			</tr>

			<tr>
				<td><spring:message code="label.zipcode"/></td>
				<td><input type="text" name="studentAddress.zipcode"></td>
			</tr>

			<tr>
				<td><spring:message code="label.country"/></td>
				<td><input type="text" name="studentAddress.country"></td>
			</tr>

			<tr>
				<td></td>
				
				<td><spring:message code="label.submit.admissionform" var="labelSubmitAdmissionForm"/></td>
				<td><input type="submit" value="${labelSubmitAdmissionForm}"></td>
					
				<td></td>
			</tr>
			
		</table>

	</form>
	
</body>

</html>