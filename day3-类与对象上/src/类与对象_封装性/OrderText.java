package 类与对象_封装性;
/*
 * 三、封装性的体现，需要权限修饰符来配合。
 *   1.Java 规定的 4 种权限：(从小到大排序)private、缺省、protected、public
 *   2.4 种权限用来修饰类及类的内部结构：属性、方法、构造器、内部类
 *   3.具体的，4 种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 * 		 修饰类的话，只能使用：缺省、public
 *  总结封装性：Java 提供了 4 中权限修饰符来修饰类积累的内部结构，体现类及类的内部结构的可见性的方法。
 * 
 */
public class OrderText {
	public static void main(String[] args) {
		Order order = new Order();
		order.Orderdefault=1;
		order.Orderpublic=2;
		//出了 Order 类之后，私有的结构就不可调用了
//		order.Orderprivate=3; The field Order.Orderprivate is not visible

		order.defaultMethod();
		order.publicMethod();
		//出了 Order 类之后，私有的结构就不可调用了
//		order.privateMethod(); The method privateMethod() from the type Order is not visible
	
	}
}
