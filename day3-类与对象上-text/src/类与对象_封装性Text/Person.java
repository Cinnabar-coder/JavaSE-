package 类与对象_封装性Text;

public class Person {
	private int age;
	private String name;
	
	public Person(){
		age = 18;
	}
	
	public Person(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public void setage(int age) {
		if(age>=0 && age<=130)
		{
			this.age  = age;
		}
		else {
			throw new RuntimeException("传入非法数据");
		}
	}
	
	public int getage() {
		return age;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
}
