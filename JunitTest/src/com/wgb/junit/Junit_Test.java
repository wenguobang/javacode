package com.wgb.junit;

import org.junit.Test;

/**
 * 
 * @author 文国邦
 *junit的使用：
 *1.当前工程右键->build path->Configure Build Path->Library-> add library->Junit
 *2.导入import org.junit.Test;
 *3.写一个无参无返回值的函数作为测试函数
 *4.在这个函数前面写@Test
 *5.3和4两步是紧挨着的，中间不能有空行
 *6.双击函数名->Run as ->Junit Test
 *
 */
public class Junit_Test {
	public static void main(String[] args) {
		System.out.println("main");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	@Test
	public void test() {
		System.out.println("hello!");
	}
	
	@Test
	public void testJunit() {
		System.out.println("Junit");
	}
}
