package blog.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blog.model.Article;
import blog.model.Eassy;
import blog.service.AdminEassyService;
import blog.service.AdminService;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateEassyServlet")
public class UpdateEassyServlet extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		AdminEassyService as = AdminEassyService.getInstance();
		Eassy result = as.updateEassy(request);
		request.setAttribute("eassy", result);
		
		request.getRequestDispatcher("/admin/resulteassy.jsp").forward(request, response);
*/
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
