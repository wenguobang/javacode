package com.wgb.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//public class LoginServlet implements Servlet {
//public class LoginServlet extends MyGenericServlet{
//public class LoginServlet extends GenericServlet{
//public class LoginServlet extends MyHttpServlet{
public class LoginServlet extends HttpServlet{

//	@Override
//	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
		@Override
		public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
			// TODO Auto-generated method stub
			

		
//		//方法：
//		//1.根据参数名返回参数值
//		String mypassword = request.getParameter("user");
//		System.out.println(mypassword);
//		//2.根据参数名，返回参数对应的字符串数组
//		String[] checkbox = request.getParameterValues("interesting");
//		for(String c:checkbox) {
//			System.out.println(c);
//		}
		//3.
//		Map<String,String[]> nv = request.getParameterMap();
//		for(Map.Entry<String, String[]> entry:nv.entrySet()) {
//			System.out.println(entry.getKey()+":"+Arrays.asList(entry.getValue()));
//		}
		
		//respone:
		//设置响应的内容类型
//		response.setContentType("application/msword");
//		
//		PrintWriter out = response.getWriter();
//		out.println("hellowgb");
		//****************************
		//1.获取初始化参数
//		ServletContext servletContext =getServletContext();
//		String user_true = servletContext.getInitParameter("user");
//		String password_true = servletContext.getInitParameter("password"); 
		
		//2.获取请求参数
		String users = request.getParameter("user");
		String passwords = request.getParameter("password");
		
		System.out.println(users);
		System.out.println(passwords);
		
		//***************************
		//查询数据库
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/login";
			String user = "root";
			String password = "password";
			connection = DriverManager.getConnection(url);
			statement = connection.prepareStatement(sql);
			
			String sql = "select count(id) from userinfo where user="+users+" and password="+passwords;
			resultSet = statement.executeQuery(sql);

			
			//查看查询结果
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			if(resultSet.getInt(1)>0) {
				
				out.println("hello wgb");
			}else {
				out.println("erro");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcTool.release(resultSet, statement, connection);
		}
		
		
		
		
		
		//3.比较请求参数与初始化参数,并输出
//		response.setContentType("text/html");
//		
//		PrintWriter out = response.getWriter();
//		if(user.equals(user_true)&&password.equals(password_true)) {
//			
//			out.println("hello wgb");
//		}else {
//			out.println("erro");
//		}
	}

}
