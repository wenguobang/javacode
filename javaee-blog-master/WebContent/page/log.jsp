<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
		
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>技术文章</title>
<!-- Bootstrap core CSS -->
<link	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="signin.css" rel="stylesheet">

<link type="text/css" rel="stylesheet" href="./css/main.css" />

<script type="text/javascript" src="./js/move-top.js"></script>
</head>
<body>
	<div class="head_line"></div>

	<div class="container" id="main">
	
		<div id="header"></div>

		<div class="row c_center">
			<div class="col-md-3" id="left_content">

				<div id="title">
					<h1 style="color:LimeGreen;font-size:50px"><b><i>W.<span style="color:Black">Blog</span></i></b></h1>
				</div>	
				<div class="c_center">
					<!-- 这里初始化侧边栏的4个标签 -->
					<div class="inline ">
						<a href="#">${article_number}<br/>日志</a>
					</div>
					<div class="inline ">
						<a href="/Blog/SortServlet?get=all"><span> ${sort_number} </span><br/>分类</a>
					</div>
					<div class="inline " >
						<a href="/Blog/TagsServlet?get=all"><span>${tags_number}</span><br/>标签</a>
					</div>
					
				</div>
		
				<!-- list -->
					<br/><br/><br/><br/><br/><br/>
					
				<div class="sort">
					<div class="list-group">
						<span class="list-group-item active">分类</span>						
						<!-- 这里初始化分类 -->
						<c:forEach var="entity"  items="${sort_count_map}">
						 <a href="/Blog/SortServlet?get=${entity.key}" class="list-group-item">${entity.key}&nbsp;&nbsp;&nbsp;&nbsp; (${entity.value})</a>						
						</c:forEach>									
						<!-- 初始化结束 -->						
					</div>
				</div><!-- sort -->

				
				<div class="visit">
					<div class="list-group">
						<span class="list-group-item active">阅读排行</span>						
						<!-- 这里初始化阅读排行 -->
						<c:forEach var="a"  items="${visit_rank}">
						 <a href="/Blog/ArticleServlet?id=${a.id}" class="list-group-item">${a.title}&nbsp;&nbsp; <span class="c_right">(${a.visit})</span></a>						
						</c:forEach>									
						<!-- 初始化结束 -->						
					</div>
				</div><!-- visit-->				
				
			
			</div>
			<div class="col-md-1" id="center_content"></div>

			
			<div  class="col-md-8" id="right_Content">
				<div id="list">
					<table class="table table-hover c_center">
						<tr class="active">
							<th><a href="/Blog/index.jsp"><span class="glyphicon glyphicon-home"></span>
								&nbsp;&nbsp;首页</a>	</th>
							<th><a href="/Blog/SortServlet?get=all"><span class="glyphicon glyphicon-list"></span>
								&nbsp;&nbsp;分类</a></th>
							<th><a href="/Blog/TagsServlet?get=all"><span class="glyphicon glyphicon-tags"></span>
								&nbsp;&nbsp;标签</a></th>
							<th><a href="/Blog/AxisServlet"><span class="glyphicon glyphicon-book"></span>
								&nbsp;&nbsp;时间轴</a></th>
							<!-- 
							<c:if test="${sessionScope.user!=null}">
							<th>
							<a href="/Blog/AddServlet">
							<span class="glyphicon glyphicon-plus">&nbsp;&nbsp;写文章</span>
							</a>
							</th>
							<th>
							<a href="/Blog/AdminServlet">
							<span class="glyphicon glyphicon-user">&nbsp;&nbsp;管理</span>
							</a>
							</th>
							</c:if>
							 -->	
						</tr>
					</table>
				</div>
				<br />
				<br />
				<div class="list-group">							
					<a href="#" class="list-group-item active">文章列表</a>
					<!-- 这里初始化文章列表 -->
					<c:forEach var="article"   items="${article_list}" >	
					<div  class="list-group-item">									
					<h4><a href="/Blog/ArticleServlet?id=${article.id}">${article.title}</a></h4>
					<br/>
					<span>${article.time}&nbsp;&nbsp;|</span>
					<a href="/Blog/SortServlet?get=${article.sort}">${article.sort}</a>&nbsp;&nbsp;|
					<span>阅读次数: ${article.visit}</span>				
					<br/>			
					</div>
					</c:forEach>
					<!-- 初始化文章列表完成 -->			
				</div>
			</div>	
		</div>				
		<div class="foot_line"></div>
	</div><!-- container -->
	<a href="#" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
</body>
</html>