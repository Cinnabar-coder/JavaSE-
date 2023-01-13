package TEXT4;

import java.util.Random;

/*
 * 
 * 4. 对象数组题目：定义类Student，包含三个属性：
 * 学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：  1) 生成随机数：Math.random()，返回值类型double;  
 * 		2) 四舍五入取整：Math.round(double d)，返回值类型long
 *
 */
public class StudentText {
	public static void main(String[] args) {
		//声明Student数组
		Student stu[] = new Student[20];	//对象数组
		
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student(); //给数组元素赋值
			//学号；1-20
			stu[i].number = i+1;
			//年级；1-6
			stu[i].state = (int)(Math.random()*(6-1+1)+1);//[1,6]=（b-a+1）+a
			//成绩：0-100
			stu[i].score = (int)(Math.random()*(100-0+1)+0);
		}
		for (int i = 0; i < stu.length; i++) {
//			System.out.println(stu[i].number + "," + stu[i].state 
//					+  "," + stu[i].score);
			System.out.println(stu[i].info());
		}
		System.out.println("***********************");
		
		/* 问题一：打印出3年级(state值为3）的学生信息。*/
		for (int i = 0; i < stu.length; i++) {
			if (stu[i].state==3) {
				System.out.println(stu[i].info());
			}
		}
		
		System.out.println("***********************");
		
		/*
		 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
		 */
		for (int i = 0; i < stu.length-1; i++) {
			for (int j = 0; j < stu.length-i-1; j++) {//-i:排好序的不需要在排序  -1防止数组
				if (stu[j].score>stu[j+1].score) {
					Student temp = stu[j];
					stu[j]=stu[j+1];
					stu[j+1]=temp;
				}
			}
		
		}
		for (int i = 0; i < stu.length; i++) {
			
				System.out.println(stu[i].info());
			
		}
	}
	
}
