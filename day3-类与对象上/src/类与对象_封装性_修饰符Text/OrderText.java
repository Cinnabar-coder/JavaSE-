package 类与对象_封装性_修饰符Text;

import 类与对象_封装性.Order;

public class OrderText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		//出了 Order 类之后，私有的结构、缺省的声明结构就不可调用了
//		order.Orderdefault=1; The field Order.Orderdefault is not visible
		
		order.Orderpublic=2;
		
		//出了 Order 类之后，私有的结构就不可调用了
//		order.Orderprivate=3; The field Order.Orderprivate is not visible
		
		//出了 Order 类之后，私有的结构、缺省的声明结构就不可调用了
//		order.defaultMethod(); The field Order.Orderdefault is not visible
		
		order.publicMethod();
		
		//出了 Order 类之后，私有的结构就不可调用了
//		order.privateMethod(); The method privateMethod() from the type Order is not visible
	
	}

}
