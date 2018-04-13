package com.wgb.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * (Annotation)注解：
 * 1.注解概述：
 * 	1).从 JDK 5.0 开始, Java 增加了对元数据(MetaData) 的支持, 也就是 Annotation(注解)
 * 	2).Annotation 其实就是代码里的特殊标记, 这些标记可以在编译, 类加载, 运行时被读取,
 * 	         并执行相应的处理. 通过使用 Annotation, 程序员可以在不改变原有逻辑的情况下, 在源文件中嵌入一些补充信息.
 * 	3).Annotation 可以像修饰符一样被使用, 可用于修饰包,类, 构造器, 方法, 成员变量, 参数, 局部变量的声明,
 * 	         这些信息被保存在 Annotation 的 “name=value” 对中.
 * 	4).Annotation 能被用来为程序元素(类, 方法, 成员变量等) 设置元数据
 * 	5).使用 Annotation 时要在其前面增加 @ 符号, 并把该 Annotation 当成一个修饰符使用。用于修饰它支持的程序元素
 * 2.JDK内置的基本注解类型（3个）:
 * 		1).@Override: 限定重写父类方法, 该注释只能用于方法
 * 		2).@Deprecated: 用于表示某个程序元素(类, 方法等)已过时,在某个时间段还可以使用
 * 		3).@SuppressWarnings: 抑制编译器警告
 * 3.自定义注解:
 * 		1).定义新的 Annotation 类型使用 @interface 关键字
 *      2).Annotation 的成员变量在 Annotation 定义中以无参数方法的形式来声明. 
 *         其方法名和返回值定义了该成员的名字和类型. 
 *      3).可以在定义 Annotation 的成员变量时为其指定初始值, 指定成员变量的初始值可使用 default 关键字
 *     		 public @interface MyAnnotation{
 *        		 String name() default “atguigu";
 *        	 }
 *      4).没有成员定义的 Annotation 称为标记; 包含成员变量的 Annotation 称为元数据 Annotation
 * 4.JDK 的元 Annotation
 * 		1)@Retention: 只能用于修饰一个 Annotation 定义, 用于指定该 Annotation 可以保留多长时间, @Rentention 包含一个 RetentionPolicy 类型的成员变量, 使用 @Rentention 时必须为该 value 成员变量指定值:
 *			 RetentionPolicy.SOURCE: 编译器直接丢弃这种策略的注释
 *			 RetentionPolicy.CLASS: 编译器将把注释记录在 class 文件中. 当运行 Java 程序时, JVM 不会保留注解。 这是默认值
 *			 RetentionPolicy.RUNTIME:编译器将把注释记录在 class 文件中. 当运行 Java 程序时, JVM 会保留注释. 程序可以通过反射获取该注释
 *		2).@Target: 用于修饰 Annotation 定义, 用于指定被修饰的 Annotation 能用于修饰哪些程序元素. @Target 也包含一个名为 value 的成员变量.
 *		3).@Documented: 用于指定被该元 Annotation 修饰的 Annotation 类将被 javadoc 工具提取成文档.
 * 			  定义为Documented的注解必须设置Retention值为RUNTIME。
 *		4).@Inherited: 被它修饰的 Annotation 将具有继承性.如果某个类使用了被 @Inherited 修饰的 Annotation, 则其子类将自动具有该注解
 *				实际应用中，使用较少
 */

//自定义注解:
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface Myannotaton{
	String name() default "wgb";
}

public class AnnotationTest {
	//@SuppressWarnings:抑制编译器警告
	public static void main(String[] args) {
		//不适用变量i，左边就是出现黄色感叹号，显示警告内容如下：
		//The value of the local variable i is not used
		@SuppressWarnings(value = {"unused" })
		int i = 12;
		
		//***********提取 Annotation 信息***************
		 
	}
	
	//@Deprecated: 用于表示某个程序元素(类, 方法等)已过时,
	@Deprecated
	public void show()
	{}
	@Myannotaton
	int i = 0;
	
	
}


//@Override:限定重写父类方法, 该注释只能用于方法
abstract class A{
	public abstract void show();
}
@Deprecated
class B extends A{

	@Override
	public void show() {//重写父类的方法，如果方法名写错等，就会报错
		// TODO Auto-generated method stub
		
	}
	
}
