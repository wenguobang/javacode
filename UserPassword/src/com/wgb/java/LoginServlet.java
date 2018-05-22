package com.wgb.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		//获取请求参数
		String username = req.getParameter("user");
		String password = req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		//resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {
			Class.forName("com.mysql.jdbc,Driver");
			String url = "jdbc:mysql://localhost:3306/login";
			String user = "root";
			String password2 = "407929";
			connection = DriverManager.getConnection(url, user, password2);
			String sql = "select count(id) from userinfo where username=? and password=?";
			statement = connection.prepareStatement(sql); 
			statement.setString(1,username);
			statement.setString(2,password);
			
			resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				int count = resultSet.getInt(1);
				if(count>0) {
					out.println("用户存在");
				}else {
					out.println("用户不存在");
				}
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		//
	}

}
