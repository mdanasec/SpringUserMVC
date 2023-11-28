<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>verifyByPhone</title>
</head>
<body>
	<form action="findByPhone" method="post">
		<input type="number" name="phone" placeholder="Enter your number">
		<input type="text" name="password" placeholder="Enter your password">
		<input type="submit" value="Find">
	</form>
</body>
</html>