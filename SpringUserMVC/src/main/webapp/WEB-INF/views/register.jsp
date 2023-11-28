<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
</head>
<body>

	<form:form modelAttribute="u" action="register"
		method="post">
		<label path="name">Name</label>
		<form:input path="name" />
		<label path="phone">Phone</label>
		<form:input path="phone" />
		<label path="email">Email</label>
		<form:input path="email" />
		<label path="age">Age</label>
		<form:input path="age" />
		<label path="password">Password</label>
		<form:input path="password" />
		<form:button>Register</form:button>
	</form:form>
</body>
</html>