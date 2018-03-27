package com.wgb.classbase;

public class Teacher {
	//属性
	private String name;
	private  String professional;
	private String course;
	private int age;
	//方法
	public void setName(String name) {
		this.name = name;
	}
	
	public void setProfession(String professional) {
		this.professional = professional;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void serAge(int age) {
		this.age = age;
	}
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.professional);
		System.out.println(this.course);
		System.out.println(this.age);
	}
	
	
}
