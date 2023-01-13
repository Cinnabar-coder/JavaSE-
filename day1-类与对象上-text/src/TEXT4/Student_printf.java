package TEXT4;

public class Student_printf {
	public void print(Student stu[]) {
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].info());
		}
	}
}
