package com.wgb.classbase;
/**
 * 
 * @author 文国邦
 *方法重载
 *关键点：1.同一个类中  2.方法名相同 3.参数列表必须不同(参数类型或参数个数不同) 4.与返回值类型无关
 *
 */
public class Overload {
	//1.求和方法
//	public int add(int x,int y) {
//		System.out.println("两个int型相加");
//		return x+y;
//	}
	//与返回值类型无关
//	public double add(int x,int y) {
//		System.out.println("两个int型相加");
//		return x+y;
//	}
	//参数名字不同是错误的
//	public int add(int m,int n) {
//		System.out.println("两个int型相加");
//		return x+y;
//	}
//	
//	public int add(int x,int y,int z) {
//		System.out.println("三个int型相加");
//		return x+y+z;
//	}
//	public double add(double x,double y) {
//		System.out.println("两个double型相加");
//		return x+y;
//	}
	
	/**
	 * 2.编写程序，定义三个重载方法并调用。方法名为mOL。
	 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
	 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
	 * 
	 */
	
	public void mOL(int i) {
		System.out.println(i*i);
	}
	public void mOL(int i,int j) {
		System.out.println(i*j);
	}
	public void mOL(String c) {
		System.out.println(c);
	}
	
	/**
	 * 3.定义三个重载方法max()，
	 * 第一个方法求两个int值中的最大值，
	 * 第二个方法求两个double值中的最大值，
	 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
	 */
	
	public int max(int x,int y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	public double max(double x,double y) {
		if(x>y) {
			return x;
		}else {
			return y;
		}
	}
	public double max(double x,double y,double z) {
		return x>y?(x>z?x:z):(y>z?y:z);
//		if(x>y) {
//			return x>z?x:z;
//		}else {
//			return y>z?y:z;
//		}
	}
	public static void main(String[] args) {
		Overload o = new Overload();
//		System.out.println(o.add(1, 2));
//		System.out.println(o.add(1.0, 2.0));
//		System.out.println(o.add(1, 2, 3));
//		o.mOL(2);
//		o.mOL(1, 2);
//		o.mOL("hello worls!");
		System.out.println(o.max(12, 3));
		System.out.println(o.max(3.14, 2.0));
		System.out.println(o.max(1.2, 2.1, 0.2));
	}
}
