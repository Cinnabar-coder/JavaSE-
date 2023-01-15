package 类与对象_JavaBean_Text;
/*
 * JavaBean 是一种 Java 语言写成的可重用组件。
 * 所谓 javaBean，是指符合如下标准的 Java 类：
 * 		> 类是公共的
 * 		> 有一个无参的公共的构造器
 * 		> 有属性，且有对应的 get、set 方法
 * 
 */
public class Customer {
	private int ID;
	private String name;
	
	public Customer(){
		
	}
	
	public void getid(int id) {
		ID = id;
	}
	public int setid() {
		return ID;
	}
	
	public void getname(String n) {
		name = n;
	}
	public String  setname() {
		return name;
	}
}
