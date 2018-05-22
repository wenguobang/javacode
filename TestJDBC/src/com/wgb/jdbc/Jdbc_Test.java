package com.wgb.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.junit.Test;



public class Jdbc_Test {
//*******************数据库查询***********************
	/**
	 * 查询数据库内容select
	 * 
	 */

	@Test 
	public void testResultset() throws Exception {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		
		try {
			//获取连接
			connection = JdbcTool.getConnection();
			
			//创建statement对象
			statement = connection.createStatement();
			//sql语句
			String sql = "select * from name";
			//执行SQL，返回resultset
			resultSet = statement.executeQuery(sql);
			
			//查看查询结果
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				System.out.println("id:"+id+" "+"name:"+name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
//			resultSet.close();
//			statement.close();
//			connection.close();
			JdbcTool.release(resultSet, statement, connection);
		}

	}
	
	
	
//*******************数据库更新*************************
	/**
	 * 对数据库执行update、insert、drop
	 * 
	 */
	//通用的更新方法
	public static void update(String sql) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			connection = JdbcTool.getConnection();
			statement = connection.createStatement();
			statement.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcTool.release(statement, connection);
		}
		
	}
	
	@Test
	public void testStatement() throws Exception {
		//1.获取连接
		Connection connection = getConnection2();
		//2.创建statement
		Statement statement = connection.createStatement();
		//3.准备SQL语句
		//String sql = "insert into xs values ('4','wgbln','hello','2','2018-01-01','121')";
		//String sql = "UPDATE xs SET 总学分=100 WHERE 学号=1";
		String sql = null;
		//sql = "insert into name values ('2','tom')";
		//sql = "delete from name where id=1";
		sql = "update name set name='wgb' where id=2";
		//4.执行更新语句
		statement.executeUpdate(sql);
		//5.关闭
		statement.close();
		connection.close();
	}
	
	
	
	//****************数据连接测试**********************
	@Test
	public void testgc2() throws Exception {
		System.out.println(getConnection2());
	}
	
	public Connection getConnection2() throws Exception {
		Properties properties = new Properties();
		//读取类路径下的jdbc.properties文件
		InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");

		properties.load(in);
		String driverclass = properties.getProperty("driver");
		String jdbcurl = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		
		Class.forName(driverclass);
		return DriverManager.getConnection(jdbcurl, user, password);
	}
	@Test
	public void testDriverManager() throws SQLException, IOException, ClassNotFoundException {
		//
		String driverclass = null;//驱动全类名
		String jdbcurl = null;
		String user = null;
		String password = null;
		//读取类路径下的jdbc.properties文件
		InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		Properties properties = new Properties();
		properties.load(in);
		
		driverclass = properties.getProperty("driver");
		jdbcurl = properties.getProperty("url");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
		//加载数据库驱动程序
		Class.forName(driverclass);
		//
		Connection connection = DriverManager.getConnection(jdbcurl, user, password);
		System.out.println(connection);
	}
	
	@Test
	public void testJdbc() throws SQLException {
		Driver driver = new com.mysql.jdbc.Driver();
		
		String url = "jdbc:mysql://localhost:3306/test";
		Properties info = new Properties();
		info.put("user", "root");
		info.put("password","wgb407");
		Connection connection = driver.connect(url, info);
		System.out.println(connection);
	}
	
	
	public Connection getConnection() throws Exception {
		String driverclass = null;
		String jdbcurl = null;
		String user = null;
		String password = null;
		//读取类路径下的jdbc.properties文件
		InputStream in = getClass().getClassLoader().getResourceAsStream("jdbc.properties");
		Properties properties = new Properties();
		properties.load(in);
		driverclass = properties.getProperty("driver");
		jdbcurl = properties.getProperty("url");
		user = properties.getProperty("user");
		password = properties.getProperty("password");
		
		Driver driver =  (Driver) Class.forName(driverclass).newInstance();//反射
		Properties info = new Properties();
		info.put("user", user);
		info.put("password", password);
		Connection connection = driver.connect(jdbcurl, info);
		return connection;
	}
	
	@Test
	public void testConnection() throws Exception {
		System.out.println(getConnection());
	}

}
