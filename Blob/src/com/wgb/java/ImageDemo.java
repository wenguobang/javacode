package com.wgb.java;


import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 /**
  * @author Administrator 测试写入数据库以及从数据库中读取
  */
 public class ImageDemo {
 
     // 将图片插入数据库
     public static void readImage2DB() {
         String path = "E:/1.jpg";
         Connection conn = null;
         PreparedStatement ps = null;
         FileInputStream in = null;
         try {
             in = ImageUtil.readImage(path);
             conn = DBUtil.getConn();
             String sql = "insert into image (id,name,photo)values(?,?,?)";
             ps = conn.prepareStatement(sql);
             ps.setInt(1, 1);
             ps.setString(2, "Tom");
             ps.setBinaryStream(3, in, in.available());
             int count = ps.executeUpdate();
             if (count > 0) {
                 System.out.println("插入成功！");
             } else {
                 System.out.println("插入失败！");
             }
         } catch (Exception e) {
             e.printStackTrace();
         } finally {
             DBUtil.closeConn(conn);
             if (null != ps) {
                 try {
                     ps.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
         }
 
     }
 
     // 读取数据库中图片
     public static void readDB2Image() {
    	 int count = 1;
    	 while(count<12) {
         String targetPath = "F:/image/"+count+".png";
        
         Connection conn = null;
         PreparedStatement ps = null;
         ResultSet rs = null;
         try {
             conn = DBUtil.getConn();
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
             DBUtil.closeConn(conn);
             if (rs != null) {
                 try {
                     rs.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
             if (ps != null) {
                 try {
                     ps.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
 
         }
         count++;
    	 }
     }
     //测试
     public static void main(String[] args) {
       // readImage2DB();
        readDB2Image();
     }
 }