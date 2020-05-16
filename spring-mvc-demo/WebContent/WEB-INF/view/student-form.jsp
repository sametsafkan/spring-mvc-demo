<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
<style>
	.error {color:red}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name : <form:input path="firstName" />
		<br>
		<br>
		Last Name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
		Class Code : <form:input path="classCode" />
		<form:errors path="classCode" cssClass="error" />
		<br>
		<br>
		Age : <form:input path="age"/>
		<form:errors path="age" cssClass="error" />
		<br><br>
		Postal Code : <form:input path="postalCode"/>
		<form:errors path="postalCode" cssClass="error" />
		<br><br>
		Country : <form:select path="country">
			<form:options items="${student.countries}" />
		</form:select>
		<br>
		<br>
		Favorite Programming Language <br><br>
		<form:radiobuttons path="favoriteProgrammingLanguage" items="${student.programmingLanguages}" />
		<br><br>
		Operating System : <br><br>
		<form:checkboxes path="operatingSystem" items="${student.operatingSystems}" />
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>