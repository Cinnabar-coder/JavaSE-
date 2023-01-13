package CodeText;
/*
 * 1.编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
 * 在主类的main ()方法中分别用参数区别调用三个方法。
 * 2.定义三个重载方法max()，
 * 第一个方法求两个int值中的最大值，
 * 第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，并分别调用三个方法。
 * 
 */
public class OverloadExer {
public static void main(String[] args) {
		OverloadExer text = new OverloadExer();
		System.out.println(text.mOL(3));
		System.out.println(text.mOL(2, 3));
		text.mOL("abc");
}
	
	
	public int mOL(int i) {
		return i*i;
	}
	
	public int mOL(int i,int j) {
		return i*j;
	}
	
	public void mOL(String str) {
		System.out.println(str);
	}
}
