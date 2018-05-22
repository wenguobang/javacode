package com.wgb.generic;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Test;

/**
 * 
 * 泛型(generic):
 * 泛型分类：泛型类、泛型接口、泛型方法
 * 注意点：
 * 	1.泛型类型必须是引用类型；
 * 	2.泛型的类型确定了，假如是String类型的，就不能加入其它类型的数据
 * 	3.基本数据类型只能用对应的包装类类型来创建；
 * 泛型优缺点：
 * 	1.使用泛型，在编译时检测出泛型
 * 	2.
 *
 */

public class GenericTest {
	@Test
	public void test1() {
		ArrayList<String> list = new ArrayList<>(20);
		list.add("wgb");
		list.add("ln");
		list.add(1, "love");
		list.add("wgb");
		list.add(12);
		System.out.println(list);
		
		Stack s= new Stack();
		
	}

}
