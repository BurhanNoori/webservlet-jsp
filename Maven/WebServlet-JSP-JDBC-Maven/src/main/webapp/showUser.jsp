<%@ page import="com.burhan.servlets.model.User
"%>
<%@ page language="java"  %>

<html>
<body bgcolor="cyan">
<h2>Welcome Burhan to the World of Servlets JSP JDBC using MAVEN in IntelliJ</h2>

<%
    User user = (User)request.getAttribute("user");

    out.println(user);
%>
</body>
</html>
