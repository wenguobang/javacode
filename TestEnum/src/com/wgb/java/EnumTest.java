package com.wgb.java;

/**
 * 1.自定义枚举类：枚举类的对象是有限个的，确定的
 *   1).私有化的构造器，防止外部调用创建实例
 *   2).枚举类的属性声明为public final的，在类的构造器中初始化
 *   3).枚举类的对象在枚举类内部创建，声明为：public static final
 * 2.使用enum自定义枚举类
 * 	 1).对象实例必须放在类的第一行，用“,”号隔开，“;”号结尾
 *   2).常用方法：values-->返回所有实例的一个数组
 *   		   valueOf(String str)-->返回字符串str对象的对象实例
 * 3.枚举类实现接口
 * 	 1).让类实现此接口，类的对象共享同一套接口的抽象方法的实现。
 * 	 2).让类的每一个对象都去实现接口的抽象方法，进而通过类的对象调用被重写的抽象方法时，执行的效果不同
 *  
 */
public class EnumTest {
	public static void main(String[] args) {
		//自定义枚举类1
		Season s1 = Season.SPRING;
		System.out.println(s1.getSeasonname()+" "+s1.getSeasondesc());
		System.out.println(s1.toString());
		//使用enum自定义的枚举类
		//values
		Season1[] s2 = Season1.values();
		for(Season1 s:s2) {
			System.out.println(s);
			s.show();
		}
		//valueof:
		String str = "SPRING";
		Season1 s3 = Season1.valueOf(str);
		System.out.println(s3);
	
		
	}
}

interface info{
	void show();
}
//使用enum定义枚举类
enum Season1 implements info {
	
	SPRING("春天", "春意盎然"){//类的每一个对象实现接口的抽象放方法
		public void show() {
			System.out.println("春天到了");
		}
	},
	SUMMER("夏天", "夏日炎炎"){
		public void show() {
			System.out.println("夏天到了");
		}
	},
	AUTUMN("秋天", "秋高气爽"){
		public void show() {
			System.out.println("秋天到了");
		}
	},
	WINTER("冬天","白雪皑皑"){
		public void show() {
			System.out.println("冬天到了");
		}
	};

	//枚举类的属性：设置为private final，次此属性在构造器中初始化
	private final String seasonname;
	private final String seasondesc;
	
	//私有的构造器，防止外部调用类的构造器创建实例
	private Season1(String seasonname,String seasondesc) {
		this.seasonname = seasonname;
		this.seasondesc = seasondesc;
	}
	

	
	
	public String getSeasonname() {
		return seasonname;
	}

	public String getSeasondesc() {
		return seasondesc;
	}


	@Override
	public String toString() {
		return "Season [seasonname=" + seasonname + ", seasondesc=" + seasondesc + "]";
	}
//	@Override
//	public void show() {
//		System.out.println("This is season!");
//	}

}

//自定义的枚举类1
class Season implements info{

	//枚举类的属性：设置为private final，次此属性在构造器中初始化
	private final String seasonname;
	private final String seasondesc;
	
	//私有的构造器，防止外部调用类的构造器创建实例
	private Season(String seasonname,String seasondesc) {
		this.seasonname = seasonname;
		this.seasondesc = seasondesc;
	}
	
	//在类的内部创建枚举类的实例，声明为public static final
	public static final Season SPRING = new Season("春天", "春意盎然");
	public static final Season SUMMER = new Season("夏天", "夏日炎炎");
	public static final Season AUTUMN = new Season("秋天", "秋高气爽");
	public static final Season WINTER = new Season("冬天","白雪皑皑");
	
	
	public String getSeasonname() {
		return seasonname;
	}

	public String getSeasondesc() {
		return seasondesc;
	}


	@Override
	public String toString() {
		return "Season [seasonname=" + seasonname + ", seasondesc=" + seasondesc + "]";
	}
	@Override
	public void show() {
		System.out.println("This is season!");
	}

}