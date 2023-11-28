<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
	<h1>welcome to update.jsp</h1>

	<form:form modelAttribute="u" action="update" method="post">
		<label path="id">User ID</label>
		<form:input path="id" />
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
		<form:button>Update User</form:button>
	</form:form>
</body>
</html>