package com.wgb.classbase;
/**
 * 
 * @author 文国邦
 *可变参数：
 *1.方法参数的指定类型的参数可变多个
 *2.语法结构：修饰符 返回值 方法名（参数类型...参数名）
 *3.可变参数方法的使用与方法参数部分使用数组是一致的
 *4.方法的参数部分有可变形参，需要放在形参声明的最后
 *5.方法内部用数组访问的形式获取可变参数值
 */
public class VariableParameter {
	//数组形式
	public  void test(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	//可变参数
	//public  void test1(String s,int...array,char c) 
	//方法的参数部分有可变形参，需要放在形参声明的最后
	public  void test1(String s,int...array) {
		System.out.println(s);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public void test2(String...s) {
		//foreach循环的应用
		for(String x:s) {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		VariableParameter v = new VariableParameter();
		int[] a = new int[] {1,2,3,4,5,6};
		v.test(a);
		v.test1("hello",a);
		v.test2("文国邦","李楠","刘新中","王兴瑞");
		
	}
	

}
