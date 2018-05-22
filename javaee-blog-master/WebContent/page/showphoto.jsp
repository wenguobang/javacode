<%@ page contentType="text/html; charset=gbk" %> 
<%@ page import="java.io.*"%> 
<%@ page import="java.sql.*, javax.sql.*" %> 
<%@ page import="java.util.*"%> 
<%@ page import="java.math.*"%> 
<%@ page import="blog.db.C3P0Connection"%> 
<% 
String id = request.getParameter("id"); 
Connection con = C3P0Connection.getInstance().getConnection(); 

try{ 
// 准备语句执行对象 
Statement stmt = con.createStatement(); 
String sql = "select * from image where id = "+id; 
ResultSet rs = stmt.executeQuery(sql); 
if (rs.next()) { 
Blob b = rs.getBlob("data"); 
long size = b.length(); 
//out.print(size); 
byte[] bs = b.getBytes(1, (int)size); 
response.setContentType("image/jpeg"); 
OutputStream outs = response.getOutputStream(); 
outs.write(bs); 
outs.flush(); 
rs.close(); 
} 
else { 
rs.close(); 
response.sendRedirect("./images/error.gif"); 
} 
} 
finally{ 
con.close(); 
} 
%> 