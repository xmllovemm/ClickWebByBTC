<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>untitled Document</title>
</head>
<link href="" type="text/css rel=stylesheet">
<body>
	<%
		boolean isLogin = false;
		try {
			isLogin = session.getAttribute("isLogin").toString().equals("1");
		}
		catch(Exception e)
		{
			//out.println(e);
		}
	%>
	<table width="842" align="center" cellpadding=3 cellspacing=1 class=tableborder1>
		<tr>
			<td width="832" class=tablebody2>: :
				<a href="index.jsp target="_top">首页</a>
				<a href="index.jsp" target="_top">邮件</a>
				<a href="index.jsp" target="_top">商品搜索</a>
				<a href="index.jsp" target="_top">论坛</a>
				<%if(isLogin) { %><a href="logout.jsp" target="_top">注销</a><%} %>: :
			</td>
		</tr>
		
		<tr>
			<td width="832" class=tablebody2>
				<%
					if(isLogin)
					{
				%>	
				<%=session.getAttribute("userName") %>,您是第
				<%=session.getAttribute("logCounter") %>次登录，上次登录时间:
				<%=session.getAttribute("lastLoginTime") %>
				<%
					}
					else
					{
				%>
				<form action="login.jsp" method="post" name="loginForm">
					&nbsp;&nbsp;&nbsp;用户名
					<input type="text" name="name" size="15">
					密码
					<input type="password" name="passWord" size="15">
					<input type="submit" value="确定">
				</form>
				<%
					}
				%>
			</td>
		</tr>
	</table>
</body>
</html>