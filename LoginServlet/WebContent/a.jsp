<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- page:定义整个页面的属性 -->
	
	<%
		Date d = new Date();
		out.println(d.getTime());
	%>
	<br>
	year:<%=d.getYear() %>
	<!-- include:文件加载，将其他文件加载到jsp文件,格式如下：-->
	<%@ include file="b.jsp"%><!-- 静态包含 :生成一份字节码文件-->
	<p>wgb</p>
	
	<!-- taglib:引入自定义标签或第三方标签库 -->
	
	
	<!-- 隐式对象 -->
	<%
	String user = request.getParameter("user");
	String password = request.getParameter("password");
	out.println(user);
	out.println(password);
	%>
</body>
</html>