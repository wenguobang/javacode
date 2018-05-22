package blog.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import blog.dao.EassyDao;
import blog.daoImpl.EassyDaoImpl;
import blog.model.Article;
import blog.model.AxisEassy;
import blog.model.Eassy;
import blog.utils.ArticleUtils;
import blog.utils.EassyUtils;
import blog.utils.StringUtils;

public class EassyService {

	private EassyDao dao;

	private static EassyService instance;
	
	private  EassyService() {
		dao =  EassyDaoImpl.getInstance();
	}

	/**
	 * 获取实例
	 * 
	 * @return
	 */
	public static final EassyService getInstance() {
		if (instance == null) {
			try {
				instance = new EassyService();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}

	/**
	 * 获取所有心情
	 */
	public List getEassy(){
		return dao.getAllEassy();
	}
	
	/**
	 * 获取时间轴显示的文章
	 *  Todo: 重写这段垃圾代码 算法不行
	 * @return
	 */
	public List getAxisList() {
		//获取数据库中的所有文章
		List<Eassy> eassys = dao.getAllEassy();
		//用来存 时间轴文章 (一种比Article类更简单适用的对象)
		List<AxisEassy> essay_list = new ArrayList();		
		//Article->AxisArticle
		for (Eassy a : eassys) {
			AxisEassy at = EassyUtils.getAxisEassy(a);			
			essay_list.add(at);
		}
		//这里开始处理数据  文章排序是 2018-2017-2016 时间降序
		//因为要实现 文章+文章+year 文章+文章+year的效果 这里把year封装成一个特殊的AxisArticle对象 id=0 year = 文章截至日期
		//然后全部存入 result 中 
		//在jsp判断id==0   
		// true: year输出
		// false: 输出AxisArticle对象的
		AxisEassy tmp = null;
		List result =  new LinkedList();			
		//塞进去最新的一个年份 并且塞入第一个AxisArticle
		if( ! essay_list.isEmpty()) {
			tmp = new AxisEassy();
			tmp.setId(0);
			tmp.setYear( essay_list.get(0).getYear());
			result.add(tmp);	
			result.add(essay_list.get(0));
		}
		//判断文章年份是不是不一样 不一样则塞一个year		
		for( int i=1;i<essay_list.size();i++){
			int present_year = essay_list.get(i).getYear();
			int past_year = essay_list.get(i-1).getYear();
			
			if( present_year < past_year){				
				tmp = new AxisEassy();
				tmp.setId(0);
				tmp.setYear(present_year);
				result.add(tmp);		
			}
			result.add(essay_list.get(i));			
		}					
		// 注意: 在list遍历里面动态修改了数组长度会出现内存溢出的情况		
		return result;
	}

	

	/**
	 * 获取 所有文章 截取文章长度 截取一下时间 去掉时 分钟 秒
	 * 
	 * @return
	 */
	public List getArticle() {
		List<Eassy> list = dao.getAllEassy();
		for (Eassy a : list) {
			EassyUtils.cutContent(list);
			EassyUtils.cutTime(list);
		}
		return list;
	}
}