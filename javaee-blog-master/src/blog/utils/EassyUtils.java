package blog.utils;


import java.util.List;

import blog.model.AxisEassy;
import blog.model.Eassy;

/**
 * 文章处理工具
 *	
 */
public class EassyUtils {

	/**
	 * 处理下时间
	 * 
	 * @param list
	 * @return
	 */
	public static List cutTime(List<Eassy> list) {

		for (Eassy a : list) {
			a.setTime(a.getTime().substring(0, 11));
		}

		return list;
	}

	
	/**
	 * 处理下时间
	 * 
	 * @param Article
	 * @return
	 */
	public static Eassy cutTime(Eassy a) {	
		a.setTime(a.getTime().substring(0, 11));
		return a;
	}
	
	
	
	
	/**
	 * 处理下文章内容
	 * 
	 * @param list
	 * @return
	 */
	public static List cutContent(List<Eassy> list) {
		
		for (Eassy a : list) {
			if (a.getContent() != null && a.getContent().length() > 351) {
				a.setContent(a.getContent().substring(0, 349) + "...");
			}
		}
		return list;
	}
	
	
	
	/**
	 * 获取时间轴文章类型 Article的一个简化版类
	 * @param article
	 * @return
	 */
	public static AxisEassy getAxisEassy(Eassy eassy) {

		AxisEassy axisEassy = new AxisEassy();
		
		axisEassy.setcontent(eassy.getContent());
		axisEassy.setId(eassy.getId());
		
		//2017-09-20 21:27:14
		String year=StringUtils.cutString(eassy.getTime(),0,4);
		String month=StringUtils.cutString(eassy.getTime(),5,7);
		String day=StringUtils.cutString(eassy.getTime(),8,10);
		
		
		
		axisEassy.setYear(Integer.valueOf(year)) ;
		axisEassy.setMonth(Integer.valueOf(month)) ;
		axisEassy.setDay(Integer.valueOf(day)) ;
		
		
		return axisEassy;
	}
}
