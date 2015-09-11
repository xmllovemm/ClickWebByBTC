<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="cart" class="shop.Cart" scope="session"/>
<jsp:useBean id="products" class="shop.Cart" scope="session"/>

<html>
<head>
	<title>购物车</title>
</head>
<body>
	<%
		String action = request.getParameter("action");
	%>
</body>
</html>