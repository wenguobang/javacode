package com.wgb.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

public class JdbcUpdate {
	
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
					JdbcTool.release(resultSet, statement, connection);
				}

			}
	}

}
