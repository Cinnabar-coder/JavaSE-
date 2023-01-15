package 类与对象_封装性Text;
/*
 * 1.创建程序,在其中定义两个类：Person 和 PersonTest 类。
 * 定义如下：用 setAge()设置人的合法年龄(0~130)，用 getAge()返回人的年龄。
 * 
 * 练习 2.在前面定义的 Person 类中添加构造器，
 * 利用构造器设置所有人的 age 属性初始值都为 18。
 * 
 * 练习 3.修改上题中类和构造器，增加 name 属性,
 *   使得每次创建 Person 对象的同时初始化对象的 age 属性值和 name 属性值。
 */
public class PersonText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new  Person();
//		p.age =12; 编译不通过
		
		System.out.println(p.getage());
		
		Person p2 = new Person("小明",21);
		System.out.println("姓名；"+p2.getName()+" 年龄："+p2.getage());
	}

}
