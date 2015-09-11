<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="user" class="shop.User" scope="session"/>
<jsp:setProperty name="user" property="*" />

<html>
<head>
	<title>untitled Document</title>
</head>

<body>
	<%
		
		// verify in database
		if(user.getName().equals("xml"))	// login success
		{
			session.setAttribute("isLogin", new String("1"));
			session.setAttribute("userName", user.getName());
			session.setAttribute("userId", new String("1"));
			session.setAttribute("logCounter", new String("1"));
			session.setAttribute("lastLoginTime", new String("2015-9-9 16:09:14"));
			response.sendRedirect("shopping.jsp");
		}
		else	// login failed
		{
			session.setAttribute("isLogin", new String("0"));
			response.sendRedirect("index.jsp");
		}
		
	%>
	
</body>
</html>