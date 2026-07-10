<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<font color = "green"><b>Welcome <%= session.getAttribute("username") %></b></font>
	<% 
	Cookie[] cookies = request.getCookies();
	out.println("<font color = 'green'><p><b>Welcome " + cookies[1].getValue() + "</b></font></p>"); 
	%>
</body>
</html>