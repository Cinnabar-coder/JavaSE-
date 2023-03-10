package 类与对象_关键字this的使用;
/*
 * this 关键字的使用
 * 1.this 用来修饰、调用：属性、方法、构造器
 * 
 * 2.this 修饰属性和方法:
 * 		this 理解为：当前对象,或当前正在创建的对象。
 * 	 
 *  2.1 在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对象属性和方法。
 *  	通常情况下，我们都选择省略“this.”。特殊情况下，如果方法的形参和类的属性同名，我们必须显式
 *  	的使用"this.变量"的方式，表明此变量是属性，而非形参。
 * 
 *  2.2 在类的构造器中，我们可以使用"this.属性"或"this.方法"的方式，调用正在创建的对象属性和方法。
 *  	但是，通常情况下，我们都选择省略“this.”。特殊情况下，如果构造器的形参和类的属性同名，我们必须显式
 *  	的使用"this.变量"的方式，表明此变量是属性，而非形参。
 *  
 *  3.this 调用构造器
 *  	① 我们可以在类的构造器中，显式的使用"this(形参列表)"的方式，调用本类中重载的其他的构造器！
 *  	② 构造器中不能通过"this(形参列表)"的方式调用自己。
 *  	③ 如果一个类中声明了n个构造器，则最多有n -1个构造器中使用了"this(形参列表)"。
 *  	④ "this(形参列表)"必须声明在类的构造器的首行！
 *  	⑤ 在类的一个构造器中，最多只能声明一个"this(形参列表)"。
 */
public class PersonText {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(18);
		System.out.println(p.getAge());
		System.out.println("-------------");
		Person p2 = new Person("niko",18);
		System.out.println(p2.getName());
	}
}
class Person{
	private String name;
	private int age;
	
	public Person(){
		String info = "构造器调用构造器";
		System.out.println(info);
	}
	public Person(String name){
		this();
		this.age = age;
	}
	public Person(int age){
	this();	
	this.age = age;	
		
	}
	public Person(String name,int age){
		this(age);
		this.name = name;
		
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
}