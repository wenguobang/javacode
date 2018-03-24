package com.wgb.java;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("hello world!");
		Test t = new Test();
		t.Set(3);
		System.out.println(t.Get());
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
}
