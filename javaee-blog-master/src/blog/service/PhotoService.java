package blog.service;

import java.util.List;

import blog.dao.PhotoDao;
import blog.daoImpl.PhotoDaoImpl;
import blog.model.Photo;


public class PhotoService {

	private PhotoDao dao;

	private static PhotoService instance;
	
	private  PhotoService() {
		dao =  PhotoDaoImpl.getInstance();
	}

	/**
	 * 获取实例
	 * 
	 * @return
	 */
	public static final PhotoService getInstance() {
		if (instance == null) {
			try {
				instance = new PhotoService();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
	/**
	 * 获取所有图片
	 * @return
	 */
	
	public List<Photo> getPhoto() {
		@SuppressWarnings("unchecked")
		List<Photo> list = dao.getAllPhoto();
		return list;
	}
	/**
	 * 获取所有图片名称
	 * @return
	 */
	
	public List<String> getName() {
		@SuppressWarnings("unchecked")
		List<String> list = dao.getName();
		return list;
	}
	
	/**
	 * 获取图片数量
	 * @return
	 */
	
	public int getCount() {
		@SuppressWarnings("unchecked")
		int count = dao.getCount();
		return count;
	}
}