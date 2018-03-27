package com.wgb.classbase;

public class Student {
	//属性
	private String name;
	private int age;
	private String course;
	private String hobby;
	private long id;
	//方法
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCourse(String course) {
		this.course  = course;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.course);
		System.out.println(this.hobby);
		System.out.println(this.id);
	}
}
