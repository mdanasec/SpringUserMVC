<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>print page</title>

<style type="text/css">
body {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: Arial, Helvetica, sans-serif;
}

section {
	background-color: #f2f2f2;
	padding: 20px;
	border: 1px solid #ccc;
	border-radius: 5px;
	margin: 20px;
}

section div {
	text-align: left;
}

h1 {
	font-size: 18px;
	margin: 0;
	padding: 5px 0;
}

span {
	font-weight: bold;
	margin-left: 10px;
	color: rgb(0, 136, 255);
}
</style>
</head>
<body>
	<section>
		<div>
			<h1>
				user id : <span>${data.getId()}</span>
			</h1>
			<h1>
				User Name : <span>${data.getName()}</span>
			</h1>
			<h1>
				User Phone :<span>${data.getPhone()}</span>
			</h1>
			<h1>
				User Email : <span>${data.getEmail()}</span>
			</h1>
		</div>
	</section>
</body>
</html>