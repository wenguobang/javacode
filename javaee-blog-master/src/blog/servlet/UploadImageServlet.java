package blog.servlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
//import config.LocalMysql;

import blog.db.C3P0Connection;
import blog.service.DeleteFile;

//@SuppressWarnings("serial")
@WebServlet("/UploadImageServlet")
public class UploadImageServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	/**
     * 获取上传文件
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	//删除文件夹images
    	DeleteFile df = new DeleteFile();
    	String path = "E:/java_workplace/javaee-blog-master/WebContent/img/images/";
        //设置读取上传文件文件的缓存
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload sfu = new ServletFileUpload(factory);
        sfu.setHeaderEncoding("UTF-8");//设置字符
        sfu.setSizeMax(10*1024*1024);//上传文件最大10m
        Connection con=null;        
        try {

            con = C3P0Connection.getInstance().getConnection();
            List<FileItem> items = sfu.parseRequest(request);//获取上传的文件名
            //System.out.println(items.size());
            PreparedStatement pre=null;
            String sql="insert into image(name,data) value(?,?)";
            for(FileItem fileItem:items){//将上传的所有文件保存到mysql数据库          
                 String name = fileItem.getName();// name属性值 
                 //System.out.println(name); 
                 pre=con.prepareStatement(sql);
                 pre.setString(1, name);
                 pre.setBlob(2, fileItem.getInputStream());
                 pre.executeUpdate();
                 pre.close();
                 df.delFolder(path);
                 request.getRequestDispatcher("/page/uploadimage.jsp").forward(request, response);	
                 //response.sendRedirect("/Blog/GetImage?data="+URLEncoder.encode(name, "UTF-8"));//上传成功跳转到测试页面
            }           
        } catch (Exception e) {         
            //response.sendRedirect("http://yuyuan:8080/zzz/Image.jsp?data="+e.getMessage());//失败携带异常信息返回上传页面
        	request.getRequestDispatcher("/page/fail.jsp").forward(request, response);	
        	e.printStackTrace();
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }       
    }
}