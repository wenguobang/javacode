package com.wgb.java;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class InsertTeacher extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
		
		String teachername = request.getParameter("teachername");
		String teachersex = request.getParameter("teachersex");
		String teacherbirty = request.getParameter("teacherbirty");
		String teacherwork = request.getParameter("teacherwork");
		String teacherclass = request.getParameter("teacherclass");
		
		System.out.println(teachername);
		System.out.println(teachersex);
		System.out.println(teacherbirty);
		System.out.println(teacherwork);
		System.out.println(teacherclass);
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employee_exam?characterEncoding=utf8";
			String user = "root";
			String password2 = "407929";
			connection = DriverManager.getConnection(url, user, password2);
			String sql = "insert into t_teacher values (?,?,?,?,?)";
		
			preparedStatement = connection.prepareStatement(sql); 
			preparedStatement.setString(1,teachername);
			preparedStatement.setString(2,teachersex);
			preparedStatement.setString(3,teacherbirty);
			preparedStatement.setString(4,teacherwork);
			preparedStatement.setString(5,teacherclass);
			
			preparedStatement.executeUpdate();
			//preparedStatement.executeLargeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
