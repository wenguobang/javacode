package blog.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import blog.dao.EassyDao;
import blog.db.C3P0Connection;
import blog.model.Comment;
import blog.model.Eassy;
import blog.utils.DBUtils;

/*
 * 文章服务类
 *
 */
public class EassyDaoImpl implements EassyDao {

	private Connection conn;	
	private static EassyDao instance;

	private EassyDaoImpl() {
		conn = C3P0Connection.getInstance().getConnection();
	}

	public static final EassyDao getInstance() {
		if (instance == null) {
			try {
				instance = new EassyDaoImpl();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return instance;

	}

	/* (non-Javadoc)
	 * @see blog.daoImpl.ArticleDao#addArticle(blog.model.Article)
	 */
	@Override
	public Eassy addEassy(Eassy a) {

		String sql = "insert into t_essay values(null,?,?)";
		PreparedStatement ps;
		int result = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, a.getTime());
			ps.setString(2, a.getContent());
			result = ps.executeUpdate();
			DBUtils.Close(ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this.getLastEassy();

	}

	/**
	 * 获取最新的文章
	 * 
	 * @return
	 */
	private Eassy getLastEassy() {

		String sql = "SELECT * FROM t_essay ORDER BY TIME DESC LIMIT 1";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Eassy eassy = new Eassy(rs.getInt("id"), rs.getString("time"), rs.getString("content"));
				DBUtils.Close(ps, rs);
				return eassy;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return null;
	}


	/* (non-Javadoc)
	 * @see blog.daoImpl.ArticleDao#getAllArticle()
	 */
	@Override
	public List getAllEassy() {
		List<Eassy> list = new ArrayList();

		String sql = "select * from t_essay";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			// bean实例化
			while (rs.next()) {
				Eassy eassy = new Eassy(rs.getInt("id"),rs.getString("time"),rs.getString("content"));
				list.add(eassy);
			}
			// 关闭连接
			DBUtils.Close(ps, rs);
			// 排序 article compareTo();
			Collections.sort(list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
