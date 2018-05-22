package blog.dao;

import java.util.List;


public interface PhotoDao {

	/**
	 * 获取所有的图片
	 * 
	 * @return
	 */
	List getAllPhoto();
	/**
	 * 获取图片格式
	 */
	int getCount();
	/**
	 * 获取图片name
	 */
	List getName();
}