package 类与对象_构造器Text;
/*
 * 编写两个类，TriAngle 和 TriAngleTest，
 * 其中 TriAngle 类中声明私有的底边长 base 和高 height，同时声明公共方法访问私有变量。
 * 此外，提供类必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 * 
 */
public class TriAngleText {
	public static void main(String[] args) {
		TriAngle t1 = new TriAngle();
		t1.setbase(3);
		t1.setheight(9);
		System.out.println("底："+t1.getbase()+",高："+t1.getheight());
		TriAngle text  = new TriAngle(3,4);
		System.out.println(text.area());
	}
}
