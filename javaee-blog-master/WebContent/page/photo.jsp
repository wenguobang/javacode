<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ page import = "blog.service.PhotoService" %>

<%
	int id = 1 ;
	PhotoService as =  PhotoService.getInstance();
	int MaxCount = as.getCount();
	String path = null;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>相册</title>
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		
		<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
		<link rel="stylesheet" href="/Blog/assets/css/main.css" />
		<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
	</head>
	<body>

		<!-- Wrapper -->
			<div id="wrapper">

				<!-- Header -->
					<header id="header">
					<nav>
						<ul>
							<li><a href="/Blog/index.jsp">首页</a></li>
						</ul>
					</nav>
					</header>
				<!-- Main -->
					<div id="main">
						<% for(id=1;id<= MaxCount;id++) { %>
							<article class="thumb">
							<img src= <%="/Blog/img/images/"+id+".jpg" %> />
							</article>
						<% } %>
					</div>  
			</div>

		<!-- Scripts -->
			<script src="/Blog/assets/js/jquery.min.js"></script>
			<script src="/Blog/assets/js/jquery.poptrox.min.js"></script>
			<script src="/Blog/assets/js/skel.min.js"></script>
			<script src="/Blog/assets/js/util.js"></script>
			<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
			<script src="/Blog/assets/js/main.js"></script>
	</body>
</html>