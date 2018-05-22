package blog.servlet;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blog.db.C3P0Connection;

@WebServlet("/GetImage")
public class GetImage extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
     *  根据传入的图片名称获取数据库中的图片
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       // String data=URLDecoder.decode(request.getParameter("data"), "UTF-8");//获取传过来的文件名
        //System.out.println(data);       
        Connection con=null;
        String sql="select data from image ";//where name=?";
        try{
            con = C3P0Connection.getInstance().getConnection();
            PreparedStatement pre=con.prepareStatement(sql);
           // pre.setString(1, data);
            ResultSet re=pre.executeQuery();
            if(re.next()){
                Blob b=re.getBlob("data");
                response.setContentType("image/jpeg"); //设置返回的类型
                OutputStream out = response.getOutputStream();
                out.write(b.getBytes(1, (int) b.length()));//获取读取的数据写到返回中
                out.flush();
            }           
        }catch(Exception e){
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