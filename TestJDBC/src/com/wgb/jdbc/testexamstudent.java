package com.wgb.jdbc;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class testexamstudent {

	@Test
	public void test() throws SQLException {
//		String sql = "insert into tablename1 values('文国邦')";
//		Jdbc_Test.update(sql);
			String sql1 = "insert into examstudent(Type,IDCard,ExamCard,StudentName,Location,Grade) values('4','412824195263214584','200523164754000','张锋','郑州','85')";
			String sql2 = "insert into examstudent(Type,IDCard,ExamCard,StudentName,Location,Grade) values('4','222224195263214584','200523164754001','孙朋','大连','56')";
			String sql3 = "insert into examstudent(Type,IDCard,ExamCard,StudentName,Location,Grade) values('6','342824195263214584','200523164754002','刘明','沈阳','72')";
			String sql4 = "insert into examstudent(Type,IDCard,ExamCard,StudentName,Location,Grade) values('6','100824195263214584','200523164754003','赵虎','哈尔滨','95')";
			String sql5 = "insert into examstudent(Type,IDCard,ExamCard,StudentName,Location,Grade) values('4','454524195263214584','200523164754004','杨丽','北京','64')";
			String sql6 = "insert into examstudent(Type,IDCard,ExamCard,StudentName,Location,Grade) values('4','854524195263214584','200523164754005','王小红','太原','60')";

			Jdbc_Test.update(sql1);
			Jdbc_Test.update(sql2);
			Jdbc_Test.update(sql3);
			Jdbc_Test.update(sql4);
			Jdbc_Test.update(sql5);
			Jdbc_Test.update(sql6);
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		String sql7 = "select * from student where FlowID=1";
		try {
			//获取连接
			connection = JdbcTool.getConnection();
			//创建statement对象
			statement = connection.createStatement();
			//执行SQL，返回resultset
			
			resultSet = statement.executeQuery(sql7);
			
			while(resultSet.next()) {
				String name = resultSet.getString(5);
				String IDCard= resultSet.getString(3);
				System.out.println(name);
				System.out.println(IDCard);
			}
			
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcTool.release(resultSet, statement, connection);
		}		
}

}