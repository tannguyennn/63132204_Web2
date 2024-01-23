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
String mk = request.getParameter("pass");

if(tenDN.equals("ABC") && mk.equals("MNK"))
	response.sendRedirect("upr.html");
else
	response.sendRedirect("login.html");
%>
</body>
</html>