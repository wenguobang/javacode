package com.wgb.string;

import org.junit.Test;

public class StringTest {
	@Test
	public void test2() {
		String s1 = new String("wgb");
		System.out.println(s1.equals("w"));
	}

	
	@Test
	public void test1() {
		boolean b = true;
		System.out.println(String.valueOf(b).substring(0, 4));
		String s = "wgb";
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.codePointAt(0));
		System.out.println(s.codePointBefore(1));
		System.out.println(s.compareTo(""));
		System.out.println(s.concat("ln"));
	}

}



