<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
	The student is confirmed : ${student.firstName}  ${student.lastName} - ${student.country} <br>
	Age : ${student.age}<br>
	Postal Code : ${student.postalCode}<br>
	Class Code : ${student.classCode}<br>
	Favorite Language : ${student.favoriteProgrammingLanguage}<br>
	Operating System : <br>
	<ul>
		<c:forEach var="temp" items="${student.operatingSystem}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>