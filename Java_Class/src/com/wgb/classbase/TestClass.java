package com.wgb.classbase;
/**
 * OOP: Object Oriented Programming (面向对象)
 * 1.三大特征：封装、继承、多态
 * 2.面向对象的核心：类与对象
 * 3.Java类的成员：属性(field)、方法(method)
 * 4.类的语法格式：
 *   修饰符 class 类名{属性；方法}
 *   属性语法格式：修饰符 属性类型  属性名=初值；
 *   方法语法格式： 修饰符 返回值类型 方法名(形参列表){方法体}
 * 5.对象的创建和使用：
 * 	使用new +构造器创建一个新的对象；
 *  使用“对象名.对象成员”的方式访问对象成员（包括属性和方法）；
 *  注：如果创建了一个类的多个对象，对于类中定义的属性，每个对象都拥有各自的一套副本，且互不干扰。
 *
 */
public class TestClass {
	public static void main(String[] args) {
		Person pp = new Person();
		pp.study();
		System.out.println(pp.addAge());
		pp.showAge();
		
//		System.out.println("hello new class!");
//		//对象的创建
//		Person p = new Person();
//		//对象的使用
//		p.setName("文国邦");
//		p.setAge(22);
//		System.out.println(p.getName());
//		System.out.println(p.getAge());
//		
//		Person p1 = new Person();
//		p1.setName("李楠");
//		p1.setAge(23);
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
//		
		/////////////////////////////
		//教师类测试
//		Teacher t = new Teacher();
//		t.setName("文国邦");
//		t.setProfession("电子信息科学与技术");
//		t.setCourse("java程序设计");
//		t.serAge(22);
//		t.info();
		
		/////////////////////////
		//学生类测试
//		Student s = new Student();
//		
//		s.setName("王三");
//		s.setAge(12);
//		s.setCourse("化学");
//		s.setHobby("读书");
//		s.info();
		//匿名对象
		//new Student().info();
		//使用情况：1.一个对象只需调用一次的地方  2.作为实参传递
	}
	
}
