package com.wgb.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectInfo extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
		//获取请求参数
		String teachername = request.getParameter("teachername");
		System.out.println("teacher:"+teachername);
	
		//连接数据库
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employee_exam?characterEncoding=utf8";
			String user = "root";
			String password2 = "407929";
			connection = DriverManager.getConnection(url, user, password2);
			String sql = "select tname,tsex,tbirthday,prof,depart from t_teacher where tname=? ";

			preparedStatement = connection.prepareStatement(sql); 
			preparedStatement.setString(1,teachername);
	
			
			
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				String name = resultSet.getString(2);
				String sex = resultSet.getString(3);
				String age = resultSet.getString(4);
				String prof = resultSet.getString(5);
				String part = resultSet.getString(6);
				
				out.println(name);
				out.println(sex);
				out.println(age);
				out.println(prof);
				out.println(part);
			}
		}catch (Exception e) {
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
			if(preparedStatement != null) {
				try {
					preparedStatement.close();
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

	}
}
