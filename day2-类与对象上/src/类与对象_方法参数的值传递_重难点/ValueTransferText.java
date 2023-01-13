package 类与对象_方法参数的值传递_重难点;
/*
 * 	关于变量的赋值
 * 
 * 	如果变量是基本数据类型，此时赋值的是变量所保存的数据值。
 * 	如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值。
 * 
 */
public class ValueTransferText {
	public static void main(String[] args) {
		System.out.println("**********基本数据类型：***********");
		int m=10;
		int n = m;
		System.out.println("m = " + m + ", n = " + n);
		n=20;
		System.out.println("m = " + m + ", n = " + n);
		System.out.println("***********引用数据类型:********");
		orderID id = new orderID();
		id.ID = 1001;
		
		orderID id2 = id;//赋值后，o1和o2的地址值相同，都指向了堆空间中同一个对象实体
		System.out.println("id.ID = " + id.ID+ ",id2.ID = " + id2.ID);
		
		id.ID = 2002;	
		System.out.println("id.ID = " + id.ID+ ",id2.ID = " + id2.ID);
	
		
		
	
	}
}

class orderID{
	int ID;
}