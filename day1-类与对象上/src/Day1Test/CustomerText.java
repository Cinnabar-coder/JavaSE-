package Day1Test;
/*
 * 类中方法的声明和使用
 * 
 * 方法：描述类应该具有的功能
 * 
 * 1.举例：
 * public void  eat()
 * public void sleep(int hour)
 * public String  getname()
 * public String  getnation(String nation)
 * 
 * 2. 方法的声明：权限修饰符  返回值类型  方法名(形参列表){
 *  	方法体
 * 	}
 * 	注意：static、final、abstract 来修饰的方法，后面再讲
 * 
 * 3. 说明：
 * 			3.1 关于权限修饰符：默认方法的权限修饰符先都使用public
 * 			Java规定的4种权限修饰符：private、public、缺省、protected  -->封装性再细说
 * 			
 * 			3.2 返回值类型： 有返回值  vs 没有返回值
 * 				3.2.1  如果方法有返回值，则必须在方法声明时，指定返回值的类型。同时，方法中，需要使用
 * 					return关键字来返回指定类型的变量或常量：“return 数据”
 * 					如果方法没有返回值，则方法声明时，使用void来表示。通常，没有返回值的方法中，就不需要
 * 					使用return.但是，如果使用的话，只能“return;”表示结束此方法的意思
 * 
 * 			3.3 方法名：属于标识符，遵循标识符的规则和规范，“见名知意”
 * 			3.4 形参列表:方法名可以声明0个、1个，或多个形参
 * 				3.4.1 格式:数据类型1 形参1，数据类型2 形参2,...
 * 						
 * 			3.5 方法体:方法功能的体现
 * 
 * 4. return关键字的使用：
 * 			1.使用范围:使用在方法体中
 * 			2.作业:① 结束方法
 * 				  ② 针对于有返回值类型的方法，使用"return 数据"方法返回所要的数据
 *
 *5. 方法的使用中，可以调用当前类的属性或方法
 *			特殊的:方法A中又调用了方法A:递归方法
 *			方法中不能定义其他方法
 */
public class CustomerText {
public static void main(String[] args) {
	Customer customer1 = new Customer();
	customer1.eat();
	customer1.sleep(6);
}
}

//客户类
class Customer
{
	//属性（成员变量）
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void  eat() {
		System.out.println("客户吃饭");
		return;
		//System.out.println(""); return 后不可以使用表达式
	}
	
	public void sleep(int hour) {
		System.out.println("休息了"+hour+"H");
	}
	
	public String  getname() {
		if(age>18){
			return name;
		}
		else{
			return "tom";                         
		}
		
	}
	
	public String  getnation(String nation) {
		String info = "我的国籍是："+nation;
				return info;
	}
}