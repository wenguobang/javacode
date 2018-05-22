<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>用户登录</title>
		<script LANGUAGE="JavaScript">
    		function openwin() {
				window.open ("registered.jsp", "newwindow", "top=200,left=400,height=400 width=800, toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no")
				}
    	</script>
		<!-- 新 Bootstrap 核心 CSS 文件 -->
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
 
		<!-- 可选的Bootstrap主题文件（一般不使用） -->
		<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
 
		<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
		<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
 
		<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
		<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body style="background-image: url(images/bg.jpg);">
			<div class="container">
	<div class="row clearfix">
		<div class="col-md-4 column">
		</div>
		<div class="col-md-4 column" align="center" style="margin-top: 100px;">
			<img src="images/re.jpg" class="img-circle" class="img-responsive" alt="Cinque Terre">
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-4 column">
		</div>
		<div class="col-md-4 column" ">
			<form action="" role="form">
				<div class="form-group">
					 <label for="exampleInputEmail1">用户名</label>
					 <input type="text" placeholder="用户名" class="form-control" id="exampleInputEmail1" />
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">密码</label>
					 <input type="password" placeholder="密码" class="form-control" id="exampleInputPassword1" />
				</div>
				<div align="center">
					<button type="submit" class="btn btn-success btn-lg" >登录</button>
					<a href="#" onclick="openwin()">注册</a>
				</div>
			</form>
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
</div>
	</body>
</html>
