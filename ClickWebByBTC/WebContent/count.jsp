<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
	<title>统计访问量</title>
</head>

<body>
	<%
	int count = 0;
	String counter_name = request.getParameter("counter_name");
	try {
		count = Integer.valueOf(application.getAttribute(counter_name).toString());
	}
	catch(Exception e)
	{
		//e.printStackTrace();
	}
	out.println("此页面已经被访问了[" + count + "]次");
	count++;
	application.setAttribute(counter_name, new Integer(count));	
	%>
</body>

</html>