<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Insert title here</title>
</head>
<body>
	<center>
		<%
			session.invalidate();
			response.sendRedirect("index.jsp");
		%>
		<br>
		<br>
		正在注销
	</center>
	
</body>
</html>