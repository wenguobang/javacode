package com.wgb.classbase;
/**
 * 
 * @author 文国邦
 *参数传递：
 *	Java中只有一种参数传递方式：值传递(即将实际参数值的副本（复制品）传入方法内，而参数本身不受影响)	
 *
 */
public class TransferParameter {
	public static void swap(int a , int b){
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap方法里，a的值是" 
			+ a + "；b的值是" + b);
	}

	public static void main(String[] args) {
		//TransferParameter t = new TransferParameter();
		int a = 6;
		int b = 9;
		swap(a , b);
		System.out.println("交换结束后，变量a的值是" 
			+ a + "；变量b的值是" + b);
		}
}
