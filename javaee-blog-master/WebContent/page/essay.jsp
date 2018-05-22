<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>心情随笔</title>

<!-- Bootstrap core CSS -->
<link
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="signin.css" rel="stylesheet">

<!-- 引入页面公共样式 -->
<link type="text/css" rel="stylesheet" href="/Blog/css/public.css" />
<!-- 引入本页面的特殊样式 -->
<link type="text/css" rel="stylesheet" href="/Blog/css/eassy.css" />

</head>
<body >
	<div class="head_line"></div>

	<div class="container" id="main">

		<div class="row c_center">
			<div class="col-md-12 " id="axis_div" >
				<!-- 这里初始化时间轴 -->		
				<c:forEach var="axis" varStatus="status" items="${essay_list}">
					<c:choose>
						<c:when test="${axis.id==0}">
							<div class="longline_div">
								<div><a href="/Blog/index.jsp" title="首页">${axis.year}</a></div>
							</div>
						</c:when>
						<c:otherwise>
							<div class="line_div">
								<div>
									<a href="/Blog/index.jsp"><font size="3" color="black">&nbsp;&nbsp;<span style="color:CornflowerBlue">${axis.month}-${axis.day}</span>
									&nbsp;&nbsp;&nbsp;&nbsp;${axis.content}</font>
									</a>
								</div>
							</div>
						</c:otherwise>
					</c:choose>
				</c:forEach>
				<!-- 初始化结束 -->
			</div>
			
		</div>
		
		<div class="foot_line"></div>
	</div>	
	<!-- container -->
	<a href="#" id="toTop" class="scroll" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
	<div id="footer">
		<h3 style="color:LimeGreen"><a href="#"><b><i>W.<span style="color:Black">Blog</span></i></b></a></h3>
	</div>
	<!-- footer -->
</body>
</html>