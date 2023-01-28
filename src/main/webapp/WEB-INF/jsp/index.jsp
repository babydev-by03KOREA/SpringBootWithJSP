<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp index</title>
</head>
<body>
	<%
		/* String hello = "springBoot + JSP"; */
		String hello = (String)request.getAttribute("hello");
	%>
	<h1><%=hello%></h1>
</body>
</html>