<%@ page language="java" contentType="text/html; charset=utf-8" isErrorPage="true" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>出错啦!</title>
</head>
<body>
	有错误：<br>
	<hr>
	<font color="red">
		<%=exception.getMessage()%>
	</font>
</body>
</html>