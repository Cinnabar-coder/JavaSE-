package 类与对象_关键字this的使用_Text;

public class Girl {
	private String name;
	private int age;
	
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void marry(Boy boy) {
		System.out.println("我想嫁给"+boy.getName());
		boy.marry(this);
	}
	
/**
 * 
 * @Description 比较两个对象的大小
 * @author cinnabar 
 * @date 2023年1月15日下午5:02:35
 * @param girl
 * @return  正数：当前对象大；负数：当前对象小；0：当前对象与形参对象相等
 */
	public int compare(Girl girl){
		return this.age - girl.age;
	}
	
}
