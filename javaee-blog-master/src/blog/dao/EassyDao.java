package blog.dao;


import java.util.List;
import java.util.Map;

import blog.model.Eassy;

public interface EassyDao {
	
	static final String SEARCH_ARTICLE = "article";

	static final int LESS = 1;
	static final int MORE = 2;
	/**
	 * 新的心情
	 * 
	 * @param a
	 * @return
	 */
	Eassy addEassy(Eassy a);

	/**
	 * 获取所有的心情
	 * 
	 * @return
	 */
	List getAllEassy();
}