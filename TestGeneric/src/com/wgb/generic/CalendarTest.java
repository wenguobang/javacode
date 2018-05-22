package com.wgb.generic;

import java.util.Calendar;

import org.junit.Test;

/**
 * 
 * Calendar是一个抽象类(抽象类不能实例化对象)
 *
 */
public class CalendarTest {
	@Test
	public void test1() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
//		System.out.println(c.toString());
		
	}

}
