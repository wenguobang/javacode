<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
		
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>写心情</title>


<!-- Bootstrap core CSS -->
<link	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="signin.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="./css/add.css" />

<link rel="stylesheet" href="./editormd/css/style.css" />
<link rel="stylesheet" href="./editormd/css/editormd.css" />
 
<script src="./editormd/js/zepto.min.js"></script>
<script src="./editormd/js/editormd.js"></script>  

<script src="./js/add.js"></script>
</head>
<body >
	<div class="head_line"></div>
	<div class="container" id="main">		
		<div id="title">
			<table border="0">
			<colgroup>
    			<col style="width:40px">
    			<col style="width:1100px">
    			<col style="width:80px">
  			</colgroup>
			<tr>
			<td><h4><a href="/Blog/index.jsp">首页</a></h4></td>
			<td></td>
			<td><h4><a href="/Blog/EssayServet?get=all">心情随笔</a></h4></td>
			</tr>
			</table>
		</div>						
		   <form action="/Blog/NewEassyServlet" method="post">
		   		
		   		<div class="info" >
		   		
		   		<!-- time -->
		   		<span class="help">时间</span>
		   		<input type="text"  class="form-control" name="time" value="${time}" >
		   		</div>   		
		   		
		   		<div class="foot_line"></div>
		   		<!-- content -->   
                <div class="editormd" id="mdView">                
                    <textarea name="content"></textarea>
                </div>
                <br/>
                <div id="st">
                	<input  class="btn btn-default"  type="submit"   value="提交" />
                </div>
            </form>
		
		<div class="foot_line"></div>
			<!-- container -->
		</div><!-- container -->
	
		<div id="footer">
		<h3 style="color:LimeGreen"><a href="#"><b><i>W.<span style="color:Black">Blog</span></i></b></a></h3>
		
	</div> <!-- footer -->		
		
	<script type="text/javascript">
			var testEditor;
			var jQuery = Zepto;
            $(function() {
					testEditor = editormd("mdView", {
						width  : "90%",
						height : 720,
						path   : './editormd/lib/',
                        codeFold : true,
                        searchReplace : true,
                        saveHTMLToTextarea : true,    // 保存 HTML 到 Textarea                   
                        htmlDecode : "style,script,iframe|on*", // 开启 HTML 标签解析，为了安全性，默认不开启
                        emoji : true,
                        taskList : true,
                        tocm: true,      
                        tex : true,  
                        flowChart : true,  
                        sequenceDiagram : true,   
                        imageUpload : true,
				        imageFormats : ["jpg", "jpeg", "gif", "png", "bmp", "webp"],				        
				        imageUploadURL : "/Blog/UploadPic",
				        //后台只需要返回一个 JSON 数据				      
						onload : function() {
							//console.log("onload =>", this, this.id, this.settings);
						}
					});				
					editor.setToolbarAutoFixed(false);//工具栏自动固定定位的开启与禁用               
            });
        </script>	
	
</body>
</html>