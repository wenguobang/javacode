package com.wgb.classbase;

public class Circle {
	//圆的属性
	private double radius;
	//float diameter;
	//方法
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//圆的面积
	public double area() {
		return 3.14*radius*radius;
	}
	//圆的直径
	public double diameter() {
		return 2*radius;
	}

}
