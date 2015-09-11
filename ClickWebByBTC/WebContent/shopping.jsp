<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="java.util.Iterator"%>
<%@page import="shop.*"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:useBean id="products" class="shop.Products" scope="session"/>

<html>
<head>
	<title>欢迎光临,请随意挑选!</title>
</head>
<body>
	<%@ include file="title.jsp" %>
	
	<div align="center">
	<form action="" method="get">
		<table width="75%" border="1" bordercolor="#006633">
			<tr bgcolor="#999999">
				<td>商品编号</td>
				<td>商品名称</td>
				<td>商品描述</td>
				<td>制造商</td>
				<td>剩余数量</td>
				<td>选择</td>
			</tr>
			
			<%
				List<Item> items = products.getItemList();
				Iterator<Item> it = items.iterator();
				
				while(it.hasNext())
				{
					Item item = it.next();				
			%>
			<tr>
				<td><%=item.getId() %></td>
				<td><%=item.getName() %></td>
				<td><%=item.getDescription() %></td>
				<td><%=item.getProducer() %></td>
				<td><%=item.getCount() %></td>
				<td><input type="checkbox" name="id"></td>
			</tr>
			
			<%
				}
			%>
			
			<tr align="right">
				<td colspan="6"><input type="submit" value="添加到购物车" name="action"></td>
			</tr>
			<tr align="right">
				<td colspan="6"><a href="cart.jsp">购物车</a>
			</tr>
		</table>
	</form>
	</div>
	
	
	
</body>
</html>