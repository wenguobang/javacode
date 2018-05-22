<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<!-- Jsp的隐式对象 -->
	<!-- 隐式对象：不声明就可以访问 -->
	<!-- 9个隐式对象 -->
	<!-- 1.request:HttpServletRequest的对象 -->
	<%
		out.println(request.getParameter("user"));
	%>
	<br>
	<!-- 2.respone:HttpServletResponse的对象 -->
	<%
		
	%>
	<br>
	<!-- 3.out:JspWriter类的实例，用于把结果输出至网页上 -->
	<%
		out.println("hello login!");
	%>
	
	
</body>
</html>