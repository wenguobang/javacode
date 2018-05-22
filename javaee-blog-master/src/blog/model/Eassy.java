package blog.model;

import java.text.ParseException;
import java.util.Date;

import blog.utils.DateUtils;
import blog.utils.StringUtils;

public class Eassy implements Comparable {

	private int id;
	private String time;
	private String content;

	public Eassy() {

	}

	public Eassy(int id,String time,String content) {
		super();
		this.id = id;
		this.time = time;
		this.content = content;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Article) {
			Eassy eassy = (Eassy) o;

			Date this_date = null;
			Date other_date = null;
			try {
				this_date = DateUtils.getDate(this.time);
				other_date = DateUtils.getDate(eassy.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return -this_date.compareTo(other_date);
		}
		return 0;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", time=" + time+ ", content=" + content + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
