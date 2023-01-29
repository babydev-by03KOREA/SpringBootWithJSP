<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp index</title>
</head>
<body>
	<%
		/* String hello = "springBoot + JSP"; */
		String hello = (String) request.getAttribute("hello");
	%>
	<h1><%=hello%></h1>
	<div>
		<a href="jsp/jspUrl?param1=파라미터 1 JSP&param2=파라미터 2 JSP">파라미터 전달</a>
	</div>
</body>
</html>