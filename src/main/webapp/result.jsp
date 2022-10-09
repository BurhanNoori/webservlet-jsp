<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% double result = (double)request.getAttribute("result"); %>
	<div>
	
		<%= result %>
	</div>
	<a href="home.html">Home</a>

</body>
</html>