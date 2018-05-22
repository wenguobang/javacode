<%@page import="com.wgb.jdbc.JdbcTool"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>用户注册</title>
		<!-- 新 Bootstrap 核心 CSS 文件 -->
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
		<!-- 可选的Bootstrap主题文件（一般不使用） -->
		<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
 
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
 
		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body style="background-image: url(images/register.jpg);">
		<div class="container-fluid">
	<div class="row-fluid" align="center" style="margin-top: 100px;">
		<div class="span12">
			<form actiom="register" class="form-horizontal" method="post">
				<div class="control-group">
					 <label class="control-label" for="inputEmail">用户名</label>
					<div class="controls">
						<input  type="text" name="user" placeholder="用户名" />
					</div>
				</div>
				<div class="control-group">
					 <label class="control-label" for="inputPassword">密码</label>
					<div class="controls">
						<input  type="text" name="password" placeholder="密码"/>
					</div>
				</div>

				<div class="control-group" style="margin-top: 20px;">
					<div class="controls">
						<!--  <button type="submit" class="btn btn-success btn-lg">提交</button>
					-->
					<input type="submit" value="提交" name="button1">
					</div>
				</div>
			</form>
		</div>
	</div>
</div>


	</body>
</html>
