package com.wgb.teststatic1;
/**
 * 类的第四个成员：代码块
 * 
 * >属性的赋值操作：1.默认初始化 2.显示初始化 3.构造器初始化 4.对象的方法修改属性值
 *
 */
public class CodeBlock {
	public static void main(String[] args) {
		Order o1 = new Order();
		System.out.println(o1.toString());
	}

}


class Order{
	//private int orderId = 1001;//显示的初始化
	private int orderId; 
	private String orderName;
//	public Order() {
//		super();
//		System.out.println("无参构造器");
//	}
	static{
		System.out.println("静态代码块1");
	}
	//非静态初始化块(代码块)：
	{
		orderId = 1002;
		orderName = "wgb";
		System.out.println("非静态代码块1");
	}
	{
		orderId = 1003;
		System.out.println("非静态代码块2");
	}
	static{
		System.out.println("静态代码块2");
	}
	static{
		System.out.println("静态代码块3");
	}
	public Order() {
		super();
	System.out.println("无参构造器");
	}
	public Order(int orderId, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + "]";
	}
	
	
	
}
