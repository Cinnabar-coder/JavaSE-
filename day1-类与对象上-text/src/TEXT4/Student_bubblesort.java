package TEXT4;

public class Student_bubblesort {
	/**
	 * 
	 * @Description 冒泡排序按学生成绩排序 
	 * @author cinnabar 
	 * @date 2023年1月11日下午10:39:11
	 * @param  student数组
	 */
	public void bubblesort(Student stu[]) {
		for (int i = 0; i < stu.length-1; i++) {
			for (int j = 0; j < stu.length-i-1; j++) {//-i:排好序的不需要在排序  -1防止数组
				if (stu[j].score>stu[j+1].score) {
					Student temp = stu[j];
					stu[j]=stu[j+1];
					stu[j+1]=temp;
				}
			}
		
		}
	}
}
