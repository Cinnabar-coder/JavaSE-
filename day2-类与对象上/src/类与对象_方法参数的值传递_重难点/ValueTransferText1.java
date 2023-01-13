package 类与对象_方法参数的值传递_重难点;
/*
 * 方法的形参的传递机制：值传递
 * 
 * 1.形参：方法定义时，声明的小括号内的参数
 *   实参：方法调用时，实际传递给形参的数据
 * 
 * 2.值传递机制：
 *  如果参数是基本数据类型，此时实参赋值给形参的是实参真是存储的数据值。
 */
public class ValueTransferText1 {
	public static void main(String[] args) {
		int n = 10;
		int m = 20;
		System.out.println("m = " + m + ", n = " + n);
		
		//交换两个变量的值
		int temp = n;
		n = m ;
		m = temp;
		System.out.println("m = " + m + ", n = " + n);
	}
}
