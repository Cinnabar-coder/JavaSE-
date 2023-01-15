package 类与对象_关键字this的使用_Text;

public class BoyGirlText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy boy = new Boy("张三", 19);
		boy.shout();
		
		Girl girl = new Girl("李四", 18);
		girl.marry(boy);
		
		Girl girl1 = new Girl("王五", 20);
		
		int compare = girl.compare(girl1);
		if (compare > 0) {
			System.out.println(girl.getName()+"大");
		}else if (compare < 0) {
			System.out.println(girl1.getName()+"大");
		}else {
			System.out.println("一样大");
		}
		
	}

}
