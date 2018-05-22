package com.wgb.teststatic1;

/**
 * 
 * static :静态的，可以修饰属性，方法，代码块，内部类
 * 一.static修饰属性（类变量）：
 * 1.由类创建的所有的对象，都共用这一个属性
 * 2.当其中一个对象对此属性进行修改，会导致其他对象对此属性的一个调用。vs 实例变量（非static修饰的属性，各个对象各自拥有一套副本）
 * 3.类变量随着类的加载而加载的，而且独一份
 * 4.静态的变量可以直接通过“类.类变量”的形式来调用(SportMan.nation)
 * 5.类变量的加载是要早于对象。所以当有对象以后，可以“对象.类变量”使用。但是"类.实例变量"是不行的。
 * 6.类变量存在于静态域中。
 */

public class StaticTest1 {
	public static void main(String[] args) {
		SportMan.nation = "China";//类变量访问方法一
		//SportMan.name = "wgb";//不能"类.实例变量"访问
		SportMan s1 =new SportMan("文国邦", 23);
		SportMan s2 = new SportMan("李楠", 21);
		s1.name = "wff";
		s1.nation = "American";//类变量访问方法二
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
	}

}

class SportMan{
	//实例变量
	String name;
	int age;
	//类变量
	static String nation;
	public SportMan(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "SportMan [name=" + name + ", age=" + age + ", nation=" + nation + "]";
	}
	
	public void show() {
		System.out.println("我是一个非静态方法");
	}

	public static void show1() {
		System.out.println("我是一个静态方法");
	}
	
}