<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String tenDN = request.getParameter("username");
String mk = request.getParameter("password");

if(tenDN.equals("ABC") && mk.equals("123"))
	response.sendRedirect("index.html");
else
	response.sendRedirect("login.html");
%>
</body>
</html>