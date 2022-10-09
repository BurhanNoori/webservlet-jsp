<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet JSP Learning</title>
</head>
<body>
<% String action = request.getParameter("id"); %>

	<h1>Welcome to the World of JAVA WEB SERVLET AND JSP</h1>
	<form action=<%= action %> method="post">
	<label for="num1">Enter number 1</label>
	<input type="text"  name="num1"><br>
	<label for="num2">Enter number 2</label>
	<input type="text" name="num2"><br>
	<input type="submit" value=<%= action %>>
	</form>
	
	<a href="home.html">Home</a>
</body>
</html>