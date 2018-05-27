package blog.service;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import blog.db.C3P0Connection;
import blog.utils.DBUtils;
import blog.utils.ImageUtil;


 public class ReadDBImage {
     // 读取数据库中图片
     public static void readDB2Image(int MaxCount) throws SQLException {
    	 int count = 1;
    	 while(count<=MaxCount) {
         String targetPath = "E:/java_workplace/javaee-blog-master/WebContent/img/images/"+count+".jpg";
        
         Connection conn = null;
         PreparedStatement ps = null;
         ResultSet rs = null;
         try {
             conn = C3P0Connection.getInstance().getConnection();
             String sql = "select * from image where id =?";
             ps = conn.prepareStatement(sql);
             ps.setInt(1, count);
             rs = ps.executeQuery();
             while (rs.next()) {
                 InputStream in = rs.getBinaryStream("data");
                 ImageUtil.readBin2Image(in, targetPath);
             }
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
        	 DBUtils.Close(conn, ps, rs);
         }
         count++;
    	 }
     }
 }