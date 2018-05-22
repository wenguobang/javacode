package blog.daoImpl;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import blog.dao.PhotoDao;
import blog.db.C3P0Connection;
import blog.model.Photo;
import blog.utils.DBUtils;
import blog.utils.ImageUtil;

/*
 * 文章服务类
 *
 */
public class PhotoDaoImpl implements PhotoDao{

	private Connection conn;	
	private static PhotoDao instance;

	private PhotoDaoImpl() {
		conn = C3P0Connection.getInstance().getConnection();
	}

	public static final PhotoDao getInstance() {
		if (instance == null) {
			try {
				instance = new PhotoDaoImpl();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;

	}



	/* (non-Javadoc)
	 * @see blog.daoImpl.ArticleDao#getAllArticle()
	 */
	@Override
	public List<Photo> getAllPhoto() {
		List<Photo> list = new ArrayList<Photo>();

		String sql = "select * from image";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			// bean实例化
			while (rs.next()){
				Photo photo = new Photo(rs.getInt("id"),rs.getString("name"), rs.getBlob("data"));
				list.add(photo);
			}
			// 关闭连接
			DBUtils.Close(ps, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		int count = 0;

		String sql = "select id from image";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				count++;
			}
			// 关闭连接
			DBUtils.Close(ps, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public List<String> getName() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();

		String sql = "select name from image";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				String name = rs.getString("name");
				list.add(name);
			}
			// 关闭连接
			DBUtils.Close(ps, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}

