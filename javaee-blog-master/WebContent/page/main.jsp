<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>首页</title>
    <meta content="IE=edge" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <meta content="Bodo - Simple One Page Personal" name="description">
    <meta content="BdgPixel" name="author">
    
    <!--styles-->
    <link href="css/main_css/bootstrap.min.css" rel="stylesheet">
    <link href="css/main_css/owl.carousel.css" rel="stylesheet">
    <link href="css/main_css/owl.theme.css" rel="stylesheet">
    <link href="css/main_css/magnific-popup.css" rel="stylesheet">
    <link href="css/main_css/style.css" rel="stylesheet">
    <link href="css/main_css/responsive.css" rel="stylesheet">
    <link rel="stylesheet" href="css/login_css/lanrenzhijia.css" media="all">
    <script src="js/loginjs/jquery.min.js"></script>
    <script>
	jQuery(document).ready(function($) {
	$('.theme-login').click(function(){
		$('.theme-popover-mask').fadeIn(100);
		$('.theme-popover').slideDown(200);
	})
	$('.theme-poptit .close').click(function(){
		$('.theme-popover-mask').fadeOut(100);
		$('.theme-popover').slideUp(200);
	})
	})
	</script>
	<script>
	jQuery(document).ready(function($) {
	$('.theme-exit').click(function(){
		$('.theme-popover-maskexit').fadeIn(100);
		$('.theme-popover-exit').slideDown(200);
	})
	})
	</script>
    <!--fonts google-->
    <link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,700' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,300,500,700' rel='stylesheet' type='text/css'>
    
    <!--[if lt IE 9]>
       <script type="text/javascript" src="/Blog/js/main_js/html5shiv.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <!--PRELOADER-->
    <div id="preloader">
      <div id="status">
        <img alt="logo" src="/Blog/img/main_img/logo-big.png">
      </div>
    </div>
    <!--/.PRELOADER END-->

    <!--HEADER -->
    <div class="header">
      <div class="for-sticky">
        <!--LOGO-->
        <div class="col-md-2 col-xs-6 logo">
          <a href="#"><img alt="logo" class="logo-nav" src="/Blog/img/main_img/logo.png"></a>
        </div>
        <!--/.LOGO END-->
      </div>
      <div class="menu-wrap">
        <nav class="menu">
          <div class="menu-list">
            <a href="#">
              <span>首页</span>
            </a>
            <a href="/Blog/logServlet?get=all">
              <span>技术文章</span>
            </a>
            <a href="/Blog/EssayServet?get=all">
              <span>心情随笔</span>
            </a>
            <a href="/Blog/page/hobby.html">
              <span>爱好</span>
            </a>
            <a href="/Blog/PhotoServlet?get=all">
              <span>相册</span>
            </a>
            <a href="/Blog/page/about.html">
              <span>关于</span>
            </a>
            <c:if test="${sessionScope.user ==null}">
            <a class="theme-login" href="javascript:;">
              <span>登录</span>
            </a>
            </c:if>
            <c:if test="${sessionScope.user!=null}">
            	<a href="/Blog/AddServlet">
            	<span>写文章</span></a> 
            	<a href="/Blog/AddEssayServet">
            	<span>记录心情</span></a> 
            	<a href="/Blog/page/uploadimage.jsp">
            	<span>上传图片</span></a>
            	<a href="/Blog/AdminServlet">
            	<span>管理</span></a> 
            	<a href="/Blog/ExitServet?get=all">
            	<span>退出</span></a>                  	        	
            </a>
            </c:if>
          </div>
        </nav>
        <button class="close-button" id="close-button">Close Menu</button>
      </div>
      <button class="menu-button" id="open-button">
        <span></span>
        <span></span>
        <span></span>
      </button><!--/.for-sticky-->
    </div>
    <!--/.HEADER END-->
    
    <!--CONTENT WRAP-->
    <div class="content-wrap">
      <!--CONTENT-->
      <div class="content">
        <!--HOME-->
        <section id="home">
          <div class="container">
            <div class="row">
              <div class="wrap-hero-content">
                  <div class="hero-content">
                    <h1>Hello</h1>
                    <br>
                    <span class="typed"></span>
                  </div>
              </div>
              <div class="mouse-icon margin-20">
                <div class="scroll"></div>
              </div>
            </div>
          </div>
        </section>
        <!--/.HOME END-->
        
        
        <!--TESTIMONIAL-->
        <section id="testimonial">
          <div class="container">
            <div class="row wrap-testimonial">
              <div class="col-md-10 col-md-offset-1">
                <div class="owl-carousel">
                  <div class="list-testimonial">
                    <div class="content-testimonial">
                      <h3 class="testi">
                        “ Reza did a phenominal job setting up my a website for my product He performed the task very quickly and efficiently. We know we have the superior topical pain relief cream on the market and he has helped us communicate that message via the website he built from scratch. Thanks! ”
                      </h3>
                      <p class="people">
                        Darin Cohen - Active10
                      </p>
                    </div>
                  </div>
                  <div class="list-testimonial">
                    <div class="content-testimonial">
                      <h3 class="testi">
                        “ Another successful project working with Reza. He has great design skills, is very responsive and professional. Looking forward to the next opportunity to work together. ”
                      </h3>
                      <p class="people">
                        Marko Milicevic
                      </p>
                    </div>
                  </div>
                  <div class="list-testimonial">
                    <div class="content-testimonial">
                      <h3 class="testi">
                        “ Great designer! I like his sense of design, especially the color scheme. Quick turnaround. Look forward to work with him again. Thanks!! ”
                      </h3>
                      <p class="people">
                        JK Thang
                      </p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="mask-testimonial"></div>
        </section>
        <!--/.TESTMONIAL END-->
        
        <!--FOOTER-->
        <footer>
          <div class="footer-top">
            <ul class="socials">
              <li class="facebook">
                <a href="https://www.runoob.com/" data-hover="菜鸟教程" target="_blank">菜鸟教程</a>
              </li>
              <li class="twitter">
                <a href="https://www.nowcoder.com/" data-hover="牛客" target="_blank">牛客</a>
              </li>
              <li class="gplus">
                <a href="https://github.com/" data-hover="GitHub" target="_blank">GitHub</a>
              </li>
            </ul>
          </div>

          <div class="footer-bottom">
            <div class="container">
              <div class="row">
              	<p align="center">Copyright &copy;2018</p>
              </div>
            </div>
          </div>
        </footer>
        <!--/.FOOTER-END-->

      <!--/.CONTENT END-->
      </div>
    <!--/.CONTENT-WRAP END-->
    </div>
    
    <!-- 登录  -->
    <div class="theme-popover">
     <div class="theme-poptit">
          <a href="javascript:;" title="关闭" class="close">×</a>
          <h3>欢迎登录<i><b><span style="color:Green">W.</span><span style="color:Black">Blog</span></b></i></h3>
     </div>
     <div class="theme-popbod dform">
           <form class="theme-signin" id="form" action="/Blog/LoginServlet" method="post">
                <ol>
                     <li><strong>用户名：</strong><input class="ipt" type="text" id="input" name="username" value="用户名" size="20" required/></li>
                     <li><strong>密码：</strong><input class="ipt" type="password" id="inputPassword" name="password" value="密码" size="20" /></li>
                     <li><input class="btn btn-primary" type="submit" name="submit" value=" 登 录 " /></li>
                </ol>
           </form>
     	</div>
	</div>
	<div class="theme-popover-mask"></div>
	<!-- //登录  -->

    <script src="/Blog/js/main_js/jquery-1.9.1.min.js" type="text/javascript"></script>
    <script src="/Blog/js/main_js/jquery.appear.js" type="text/javascript"></script>
    <script src="/Blog/js/main_js/bootstrap.min.js" type="text/javascript"></script>
    <script src="/Blog/js/main_js/classie.js" type="text/javascript"></script>
    <script src="/Blog/js/main_js/owl.carousel.min.js" type="text/javascript"></script>
    <script src="/Blog/js/main_js/jquery.magnific-popup.min.js" type="text/javascript"></script>
    <script src="/Blog/js/main_js/masonry.pkgd.min.js" type="text/javascript"></script>
    <script src="/Blog/js/main_js/masonry.js" type="text/javascript"></script>
    <script src="/Blog/js/main_js/smooth-scroll.min.js" type="text/javascript"></script>
    <script src="/Blog/js/main_js/typed.js" type="text/javascript"></script>
    <script src="/Blog/js/main_js/main.js" type="text/javascript"></script>
  </body>
</html>