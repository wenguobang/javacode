package com.wgb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wgb.jdbc.JdbcUpdate;


public class InfoServlet extends HttpServlet{


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		
		//获取请求参数值
		String Type = req.getParameter("Type");
		String IDCard = req.getParameter("IDCard");
		String ExamCard = req.getParameter("ExamCard");
		String StudentName = req.getParameter("StudentName");
		String Location = req.getParameter("Location");
		String Grade = req.getParameter("Grade");
		System.out.println(Type);
		System.out.println(IDCard);
		System.out.println(ExamCard);
		System.out.println(StudentName);
		System.out.println(Location);
		System.out.println(Grade);
		//
		//String sql = "insert into examstudent(Type,IDCard,ExamCard,StudentName,Location,Grade)values(Type,IDCard,ExamCard,StudentName,Location,Grade)";
		//插入数据库
		
		//JdbcUpdate.update(sql);
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("信息录入成功!");
		
	}
}
