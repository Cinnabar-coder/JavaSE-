package 类与对象_方法的重载;
/*
 * 方法的重载(Overload)
 * 	1.定义；在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不同即可
 * 		"两同一不同"：同一个类、相同方法名
 * 					参数列表不同、参数个数不同、参数类型不同
 *	2.举例；
 *		Arrays类中重载的sort()/binarySearch() 
 * 
 * 	3.判断是否重载；
 * 		与方法的权限修饰符、返回值类型、形参变量名、方法体都无关
 * 
 * 	4.再通过对象调方法时，如何确定某一个指定的方法；
 * 		4.1 方法名--> 参数列表
 * 		4.2 
 */
public class OverlaodText {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		OverlaodText text = new OverlaodText();
		text.getSum(1, 2);
	}

	
	//如下的四个方法构成了重载
	public void getSum(int j,int i) {
		System.out.println("1");
	}
	
	public void getSum(double a,double b) {
		System.out.println("2");
	}
	
	public void getSum(String a,int c) {
		System.out.println("3");
	}
		public void getSum(int i,String j) {
		System.out.println("4");	
	}
		
		//以下3个是错误的重载
//	public int getSum(int i,int j) {
//		
//	}
	
//	public void getSum(int m,int n) {
//		
//	}
	
//	private void getSum(int i,int j) {
//		
//	}
	
	
	
	
}
