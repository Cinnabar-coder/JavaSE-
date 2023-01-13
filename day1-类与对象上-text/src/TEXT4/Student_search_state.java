package TEXT4;

public class Student_search_state {
public void searchstate(Student stu[],int state) {
	for (int i = 0; i < stu.length; i++) {
		if (stu[i].state==state) {
			System.out.println(stu[i].info());
		}
	}
}
}
