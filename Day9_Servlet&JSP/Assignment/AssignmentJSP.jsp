<%@ page language="java" import="java.util.Date" %>

<%!
    int number = 5;

    public int square(int n){
        return n * n;
    }
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Demo</title>
</head>
<body>

<h1>Welcome to JSP</h1>

<hr>

<h2>Current Date and Time</h2>

<%= new Date() %>

<hr>

<h2>JSP Scripting Elements</h2>

<%
int a = 10;
int b = 20;
int sum = a + b;
%>

Declaration Variable :
<%= number %>

<br><br>

Declaration Method (Square):
<%= square(number) %>

<br><br>

Expression (Sum):
<%= sum %>

<hr>

<h2>Multiplication Table of 5</h2>

<%
for(int i = 1; i <= 10; i++){
%>

<%= number %> x <%= i %> = <%= number * i %><br>

<%
}
%>

</body>
</html>