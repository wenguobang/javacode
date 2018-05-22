<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>	
<!-- jsp动作元素： -->
<!-- 在页面得到请求是动态包含一个文件：各自生成一份字节码文件 -->
<jsp:include page="a.jsp">
<jsp:param value="wgb" name="user"/>
<jsp:param value="123" name="password"/>
</jsp:include>

<!-- 引导请求进入新的页面 :请求转发-->
<!--<jsp:forward page="login.html"></jsp:forward>-->
<!-- jsp:param:和jsp:include或jsp:forward配合使用，传递参数 -->


</body>
</html>