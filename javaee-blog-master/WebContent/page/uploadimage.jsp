<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>上传图片</title>    
    <meta charset="utf-8"/>
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  </head>  
  <body style="background-color:WhiteSmoke">
      <div class="row">
          <div class="col-md-4"></div>
          <div class="col-md-4" style="margin-top: 15%;">
            <form class="form-horizontal" method="post"  action="/Blog/UploadImageServlet" enctype="multipart/form-data" >
            <div class="form-group"> 
            	<div class="col-sm-2">
            		<a href="/Blog/index.jsp" class="btn btn-default">首页</a> 
            	</div>       
                <div class="col-sm-8	">
                  <input type="file" class="form-control" name="fileName" placeholder="上传图片">
                </div>      
                <button class="btn btn-default" type="submit">上传</button>     
            </div>
            </form>
          </div>
          <div class="col-md-4"></div>
      </div>  
  </body>
</html>