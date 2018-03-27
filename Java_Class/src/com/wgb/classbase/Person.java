package com.wgb.classbase;
/**
 * 
 * @author 文国邦
 *多行代码缩进快捷键：tab向右；shift+tab向左
 */
public class Person {
	private String name;
	private int age;
	private int sex;
	//构造器(与类名相同)
	Person(){}
	//方法
	public void study() {
		System.out.println("studying!");
	}
	public void showAge() {
		System.out.println(this.age);
	}
	public int addAge() {
		this.age+=2;
		return this.age;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAge(int i) {
		age = i;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
