<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
Hello, Nguyen Tan Lap
</h1>
<%= "Chao JSP"%>
<%! Date d = new Date();%>
<% out.append(d.toString()); %>
</body>
</html>