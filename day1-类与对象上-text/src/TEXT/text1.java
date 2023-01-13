package TEXT;
/*
 * 
 * 
 * 
 * 
 */
public class text1 {
public static void main(String[] args) {
	Person people = new Person();
	people.name="wzh";
	people.age=18;
	people.set=1;
	people.study();
	people.showAge();
	int newAge = people.addAge(2);
	System.out.println(newAge);
	
}
}
class Person{
	String name;
	int age;
	int set;
	
	public void study(){
		System.out.println("studying");
	}
	
	public void showAge(){
		System.out.println(age);
	}
	
	public int addAge(int i){
		age+=i;
		return age;
	}
}