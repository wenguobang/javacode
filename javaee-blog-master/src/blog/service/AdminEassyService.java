package blog.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import blog.dao.EassyDao;
import blog.daoImpl.EassyDaoImpl;
import blog.db.C3P0Connection;
import blog.model.Eassy;
import blog.utils.FailException;
import blog.utils.Form2Bean;

public class AdminEassyService {

	private EassyDao edao;
	private static AdminEassyService instance;

	private AdminEassyService() {
		edao = EassyDaoImpl.getInstance();
	}

	/**
	 * 获取实例
	 * 
	 * @return
	 */
	public static final AdminEassyService getInstance() {
		if (instance == null) {
			try {
				instance = new AdminEassyService();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
	
	public Eassy addEassy(HttpServletRequest request){
		//新建文章
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}		
		Eassy eassy=null ;
		try {
			eassy = Form2Bean.EassyForm2Bean(request);
		} catch (FailException e) {
			e.printStackTrace();
		}		
		if(eassy==null) 
			return null;
		Eassy a = edao.addEassy(eassy);			
		if(a==null) return null;				
		return a;			
	}
}
