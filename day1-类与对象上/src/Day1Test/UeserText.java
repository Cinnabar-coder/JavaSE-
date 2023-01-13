package Day1Test;
/*
 * 类中属性的使用
 * 
 * 属性（成员变量） vs 局部变量
 * 1、相同点
 *      1.1 定义变量格式：数据类型 变量名 = 变量值
 *      1.2先声明后使用
 *      1.3变量都有其对应的作用域
 * 
 * 2、不同点
 * 		2.1在类中声明的位置不同
 * 		   属性：直接定义在类的一对{}中
 * 		   局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内的变量	
 * 
 * 		2.2关于权限修饰符的不同
 * 		  属性：可以在生命属性时，指明其权限，使用修饰符
 * 		  常用的权限修饰符：private、public、缺省、protected
 * 	          局部变量：不可以使用权限修饰符
 * 
 * 		2.3默认初始化值的情况：
 * 		  属性：类的属性，根据其类型，都有默认初始化值
 * 		  整形（byte short int long）：0
 * 		  浮点型（float double）：0.0
 * 		  字符型（char）：0
 * 		  布尔型（Boolean）：false
 * 
 * 		  引用数据类型（类 数组 接口）；null
 * 
 * 		  局部变量：没有默认初始化值
 * 		  调用前，要赋值
 * 		  形参在调用时，要赋值	
 * 
 * 		2.4在内存中加载的位置：
 * 		 属性：加载到堆空间（非static）
 * 		 局部变量：加载到栈空间中
 */
public class UeserText {
	
	public static void main(String[] args){
	// TODO Auto-generated method stub
	User u = new User();
	u.ShowEat();
	u.ShowLangeage("日语");
	
}
}

class User{
	//属性（成员变量）
	String name;
	int age;
	boolean isMale;
	
	public void ShowLangeage(String langeage){//langage :形参
		System.out.println("使用的语言是："+langeage);
	}
	
	public void ShowEat() {
		String food = "raw";//局部变量
		System.out.println("中国人喜欢吃："+food);
		
	}
	
	
}