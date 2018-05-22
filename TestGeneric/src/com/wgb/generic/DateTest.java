package com.wgb.generic;

import java.util.Date;

import org.junit.Test;

public class DateTest {
	
	@Test
	public void test1() {
		//Date的构造函数
		Date d1 = new Date();
		//getTime():返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数
		System.out.println(d1.getTime());
		//toString:把此 Date 对象转换为以下形式的 String： dow mon dd hh:mm:ss zzz yyyy 
		System.out.println(d1.toString());
		//equals:比较两个日期的相等性
		System.out.println(d1.equals(new Date()));
		//
		Date d2 = new Date(20000000);
		System.out.println(d1.after(d2));
		System.out.println(d1.before(d2));
		System.out.println(d2.clone());
		//compareTo: 比较两个日期的顺序。
		System.out.println(d1.compareTo(d2));
	}
}
