package com.wgb.java;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet{


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destory");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("getServletConfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("getServletInfo");
		return null;
	}

	@Override
	public  void init(ServletConfig servletconfig) throws ServletException {
		// TODO Auto-generated method stub
		/*
		String user = servletconfig.getInitParameter("user");
		System.out.println("user"+user);
		
		Enumeration<String> names = servletconfig.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = servletconfig.getInitParameter(name);
			System.out.println("name:"+" "+name+" "+"value:"+" "+value);
		}
		
		String servletname = servletconfig.getServletName();
		System.out.println(servletname);
		//获取ServletContext对象
		ServletContext servletContext = servletconfig.getServletContext();
		String name_value = servletContext.getInitParameter("diver");
		System.out.println(name_value);
		Enumeration<String> namess = servletContext.getInitParameterNames();
		while(namess.hasMoreElements()) {
			String namess_s = namess.nextElement();
			String namess_value = servletContext.getInitParameter(namess_s);
			System.out.println("namess_s:"+namess_s+""+"namess_value:"+namess_value);
		}
		
		//获取当前web应用的某个文件的绝对路径
		String realpath = servletContext.getRealPath("/hello.jsp");
		System.out.println(realpath);
		*/
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("service");
	}
	public HelloServlet() {
		System.out.println("HelloServlet constructer...");
	}

}
