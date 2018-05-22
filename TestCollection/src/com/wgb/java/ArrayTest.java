package com.wgb.java;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {
	//工具类Arrays的使用
	@Test
	public void test3() {
		int[] a= new int[] {12,2,4,12,555,3434,0,-1};
		Arrays.sort(a);
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println(a[8]);
		System.out.println(Arrays.binarySearch(a, 2));
	}
	
	@Test
	public void test2() {
		int[][] arr = new int[3][4];
		int[][] arr1 = new int[][] {{1,2,3},{1,2}};
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		
	}
	
	@Test
	public void test1() {
		//int[] i = new int[4] {1,2,3};//错误创建方式
		//静态初始化
		int[] scores = new int[] {1,2,3,4};
		//动态初始化
		int[] scores1 = new int[5];
		scores1[0] = 12;
		//获取数组的长度
		System.out.println(scores.length);
		System.out.println(scores1.length);
		System.out.println();
		//遍历数组
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
		for(int i=0;i<scores1.length;i++) {
			System.out.println(scores1[i]);
		}
		//数组元素的默认初始化值
		byte[] array1 = new byte[4];
		short[] array2 = new short[4];
		int[] array3  = new int[4];
		long[] array4 = new long[4];
		float[] array5 = new float[4];
		double[] array6 = new double[4];
		char[] array7= new char[4];
		boolean[] array8 = new boolean[4];
		Person[] array9 = new Person[4];
		for(byte i=0;i<array1.length;i++) {
			System.out.print(array1[i]);
		}
		System.out.println();
		for(short i=0;i<array2.length;i++) {
			System.out.print(array2[i]);
		}
		System.out.println();
		for(int i=0;i<array3.length;i++) {
			System.out.print(array3[i]);
		}
		System.out.println();
		for(long i:array4) {
			System.out.print(i);
		}
		System.out.println();
		for(float i:array5) {
			System.out.print(i);
		}
		System.out.println();
		for(double i:array6) {
			System.out.print(i);
		}
		System.out.println();
		for(char i=0;i<array7.length;i++) {
			System.out.print(array7[i]);
		}
		System.out.println();
		for(boolean i:array8) {
			System.out.print(i);
		}
		System.out.println();
		for(Person i:array9) {
			System.out.print(i);
		}
		System.out.println();
	}

}
class Person{}
