package 类与对象_关键字this的使用_Text;

public class Boy {
	private String name;
	private int age;

	public Boy(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void marry(Girl girl)	{
		System.out.println("我想娶"+girl.getName());
	}
	
	public void shout(){
		if (this.age>22) {
			System.out.println("可以结婚了");
		}else {
			System.out.println("多恋爱去吧");
		}
	}
}
