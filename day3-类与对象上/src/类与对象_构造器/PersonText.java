package 类与对象_构造器;
/*
 * 类的结构之三:构造器(构造方法、constructor)的使用
 * constructor:
 * 
 * 一、构造器的作用:
 * 1.创建对象
 * 2.初始化对象的属性
 * 
 * 二、说明
 * 1.如果没有显示的定义类的构造器的话，则系统默认提供一个空参的构造器。
 * 2.定义构造器的格式:
 * 			权限修饰符  类名(形参列表) { }
 * 3.一个类中定义的多个构造器，彼此构成重载。
 * 4.一旦显示的定义了类的构造器之后，系统不再提供默认的空参构造器。
 * 5.一个类中，至少会有一个构造器		
 */
public class PersonText {

	public static void main(String[] args) {
		//创建类的对象：new + 构造器
			person p =  new person(); //Person()这就是构造器
			p.eat();
	
		//初始化对象的属性
			person p1 = new person("tom");
			System.out.println(p1.name);
	}
}


class person{
	// 属性
	String name;
	int age;
	
	//构造器 权限修饰符  类名(形参列表) { }
	public person(){
		System.out.println("person().....");
	}
	
	public person(String n){
		name = n;
	}
	//  一个类中定义的多个构造器，彼此构成重载。
	public person(String n,int a)
	{
		name = n;
		age = a;
	}
	
	//方法
	public void eat() {
		System.out.println("人吃饭");
	}
	public void study() {
		System.out.println("人学习");
	}
}