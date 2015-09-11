<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
<head>
	<title>测试访问量</title>
</head>
<body>
	<jsp:include page="count.jsp">
		<jsp:param name="counter_name1" value="test_count"/>
	</jsp:include>
</body>
</html>