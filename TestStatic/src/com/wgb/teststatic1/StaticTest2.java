package com.wgb.teststatic1;
import org.junit.Test;
/**
 * static修饰方法(类方法 )：
 * 1.随着类的加载而加载，在内存中也是独一份
 * 2.可以直接通过“类.类方法”的方式调用,或者用"对象.类方法"的方式调用
 * 3.内部可以调用静态的属性或静态的方法，而不能调用非静态的属性或方法。反之，非静态的方法是可以调用静态的属性或静态的方法
 * >静态的方法内是不可以有this或super关键字的！
 * >//super关键字在静态方法内不能使用
 *  注：静态的结构(static的属性、方法、代码块、内部类)的生命周期要早于非静态的结构，同时被回收也要晚于非静态的结构
 */

public class StaticTest2 {
	public static void main(String[] args) {
		//SportMan.show();//不能用“类.方法”调用非静态方法
		SportMan.show1();//静态方法可以用“类.方法”调用；因为静态方法是随着类的加载而加载的
		SportMan s1 = new SportMan("wgb", 11);
		s1.show1();//静态方法也可以用“对象.方法“调用	
	}
	@Test
	public void test() {
		Person.info();
		Person p = new Person("wgb", 11);
		p.info1();
		p.info();
	}

}

class Person{
	String name;
	int age;
	static String nation;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", nation=" + nation + "]";
	}
	//非静态的方法可以调用静态或者非静态的方法或属性
	public void info1() {
		this.name = "李楠";
		this.nation = "China";
		System.out.println("非静态方法");
	}
	//静态的方法不能调用非静态的属性或者方法
	//静态的方法可以调用静态的方法或者使用
	public static void info() {
		
		//this.nation = "HongKOng";//静态方法内不能使用this关键字
		nation = "中国";
		System.out.println("静态方法");
	}
	
	
}