package com.wgb.exception;

import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

public class ExceptionTest {
	//常见运行时异常
	//1.数组下标越界(ArrayIndexOutOfBoundsException)
	@Test
	public void test1() {
		int[] a = new int[10];
		System.out.println(a[10]);
		System.out.println(a[-1]);
	}
	
	//2.算术异常(ArithmeticException)
	@Test
	public void test2() {
		try {
			int i = 10;
			System.out.println(i/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	//3.类型转换异常(ClassCastException)
	@Test
	public void test3() { 
		Object obj = new Date();
		String str = (String)obj;
		
		//String s = (String)new Date();编译时异常
	}
	
	//4.空指针异常(NullPointerException)
	@Test
	public void test4() {
		Person p = new Person();
		p = null;
		System.out.println(p.toString());
		//前面出现异常，后面代码不在执行
		System.out.println("hello");
	}
	
	@Test
	public void Test() {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		System.out.println(i);
	}

}

class Person{
}
