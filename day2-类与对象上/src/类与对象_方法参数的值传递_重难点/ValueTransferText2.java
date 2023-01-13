package 类与对象_方法参数的值传递_重难点;
/*
 *  如果参数是引用数据类型，此时实参赋值给形参的是实参存储数据的地址值。
 */
public class ValueTransferText2 {
	public static void main(String[] args) {
		Date date = new Date();
		date.n = 10;
		date.m = 20;
		System.out.println("n="+date.n+" m="+date.m);
		
		//交换值
		ValueTransferText2 text = new ValueTransferText2();
		text.swap(date);
		System.out.println("n="+date.n+" m="+date.m);
	}
	public void swap(Date date) {
		int temp = date.m;
		date.m = date.n;
		date.n = temp;
	}
}

class Date{
	int n;
	int m;
}