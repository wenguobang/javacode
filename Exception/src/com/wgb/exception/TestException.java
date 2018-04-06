package com.wgb.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;

/**
 * 
 * java异常处理的抓抛模型
 * 
 * 处理方式1：
 * try{
 *    可能出现异常的区域
 * }catch(异常类型){
 *    处理符合的异常
 *    	getMessage()
 *      printStackTrace()
 *      可以有多个catch语句
 * }catch(){
 * 		一旦有匹配的catch语句，执行完catch语句，跳过后面的catch语句，执行非catch语句
 * }finally{
 *    可选，但选了就无条件执行
 * } 
 */
public class TestException {
	
	@Test
	public void Test() {
		Scanner s = new Scanner(System.in);
		try {//try内声明的变量是局部变量，出了try不能使用
			int i = s.nextInt();
			System.out.println(i);
		}catch(InputMismatchException e) {
			System.out.println("出现类型不匹配的异常");
		}
	}
}
