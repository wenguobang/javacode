package com.wgb.java;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello world!");
		Test t = new Test();
		t.Set(3);
		System.out.println(t.Get());
		t.info();
		
		Person p = new Person();
		p.Set("ÎÄ¹ú°î");
		System.out.println(p.Get());
		p.Info();
	}

}



class Person{
	private int age;
	private String name;
	public void Set(String name) {
		this.name = name;
	}
	public String Get() {
		return this.name;
	}
	public void Info() {
		System.out.println("age:"+this.age +" "+ "name:"+this.name);
	}
	
}


class Test{
	private int i;
	public void Set(int i) {
		this.i = i;
	}	
	public int Get() {
		return i;
	}
	public void info() {
		System.out.println(this.i);
	}
}
