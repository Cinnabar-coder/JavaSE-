package Day1Test;

class person{
	// 1、定义成员变量(即属性)
	String name;
	int age=1;
	boolean ismale;
	
	// 2、设计方法（即函数）
	void ShowEat()
	{
		System.out.println("人要吃饭");
	}
	
	void ShowSleep(){
		System.out.println("人要睡觉");
	}
	
	void ShowLangeage(String langeage){
		System.out.println("使用的语言是："+langeage);
	}
	
}
public class PersonText {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //创建对象
		person p = new person();
		//调用方法
		p.name="tom";
		System.out.println(p.name);
		p.ShowEat();
		p.ShowSleep();
		p.ShowLangeage("chinese");
		
		person p1 = new person();
		System.out.println(p1.name); 
		
		      
		person p3 = p;
		System.out.println(p3.age);
		p3.age=10;
		System.out.println(p.age);
	}

}
