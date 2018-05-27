package blog.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blog.service.PhotoService;
import blog.service.ReadDBImage;

@WebServlet("/PhotoServlet")
public class PhotoServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		PhotoService as =  PhotoService.getInstance();
		
//		int MaxCount = as.getCount();
//		int[] mylist = new int[MaxCount+1];
//		for(int i=1;i<=MaxCount;i++) {
//			mylist[i]=i;
//		}
		//初始化文章列表
		//request.setAttribute("name_list", mylist);
		//
		try {
			ReadDBImage rd = new ReadDBImage();
			rd.readDB2Image(as.getCount());
			//System.out.println(as.getCount());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//转发到 图片 界面
		request.getRequestDispatcher("/page/photo.jsp").forward(request, response);	
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
