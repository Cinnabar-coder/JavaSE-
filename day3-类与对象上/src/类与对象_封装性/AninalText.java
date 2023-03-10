package 类与对象_封装性;

import java.security.PublicKey;

/*
 * 面向对象的特征一:封装与隐藏
 * 一、问题的引入：
 *    当我们创建一个类的对象以后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值。这里，赋值操作要受到
 *    属性的数据类型和存储范围的制约。但除此之外，没有其他制约条件。但是，实际问题中，我们往往需要给属性赋值
 *    加入额外限制条件。这个条件就不能在属性声明时体现，我们只能通过方法进行条件的添加。比如说，setLegs
 *    同时，我们需要避免用户再使用“对象.属性”的方式对属性进行赋值。则需要将属性声明为私有的(private)
 *    --》此时，针对于属性就体现了封装性。
 *    
 * 二、封装性的体现：
 *    我们将类的属性私有化(private),同时,提供公共的(public)方法来获取(getXxx)和设置(setXxx)
 *    
 *    拓展：封装性的体现：① 如上 ② 单例模式 ③ 不对外暴露的私有方法
 *
 * 三、封装性的体现，需要权限修饰符来配合。
 *   1.Java 规定的 4 种权限：(从小到大排序)private、缺省、protected、public
 *   2.4 种权限用来修饰  	类及类的内部结构：属性、方法、构造器、内部类
 *   3.具体的，4 种权限都可以用来修饰	类的内部结构：属性、方法、构造器、内部类
 * 		 修饰  类的话，只能使用：缺省、public
 *  	总结封装性：Java 提供了 4 中权限修饰符来修饰类积累的内部结构，体现类及类的内部结构的可见性的方法。
 * 
 */
public class AninalText {
	public static void main(String[] args) {
		Aninal A = new Aninal();
		A.name = "niko";
//		A.age=3;
//		A.legs=4;//The field Aninal.legs is not visible
		A.showAnimal();
		
//		A.legs=0;
//		A.Setlegs(0);
		A.Setlegs(6);
		A.showAnimal();
		System.out.println(A.Getlegs());
	}
}

class Aninal{
	String name;
	private int age;
	private int legs;
	
	public void eat(){
		System.out.println("进食");
			}
	//属性的设置
	public void Setlegs(int L) {
		if (L>=0&&L%2==0) {
			legs = L;
		}else {
			legs = 0;
		}
	}
	
	//属性的获取
	public int Getlegs() {
		return legs;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void showAnimal() {
		System.out.println("姓名："+name+" 年龄："+age+" 腿的个数："+legs);
	}
}
