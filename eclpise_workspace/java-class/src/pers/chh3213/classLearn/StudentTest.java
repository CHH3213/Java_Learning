package pers.chh3213.classLearn;

public class StudentTest {
	public static void main(String[] args) {
		Student[] stu_arr = new Student[20];
		for (int i = 0; i < stu_arr.length; i++) {
			stu_arr[i] = new Student();
			stu_arr[i].number= i+1;
//			System.out.print(stu_arr[i].number+"\t");
		}
		//print information
		for (int i = 0; i < stu_arr.length; i++) {
			if(stu_arr[i].state==3) {
				System.out.print("state 3:\t");
				stu_arr[i].printInfor();
			}
		}

		//sort
		System.out.println("before sort");
		for (int i = 0; i < stu_arr.length; i++) {
				stu_arr[i].printInfor();
		}
		for (int i = 0; i < stu_arr.length-1; i++) {
			for (int j = 0; j < stu_arr.length-1-i; j++) {
				if(stu_arr[j].score>stu_arr[j+1].score) {
					Student tempStudent = stu_arr[j];
					stu_arr[j]=stu_arr[j+1];
					stu_arr[j+1]=tempStudent;
				}
			}
		}
		System.out.println("after sort");
		for (int i = 0; i < stu_arr.length; i++) {
				stu_arr[i].printInfor();
		}

	}
}

class Student{
	int number;
	int state = (int)(Math.random()*6)+1;
	int score=(int)(Math.random()*100)+1;
	public void printInfor() {
		System.out.println("学号:" + number + ",年级:" + state + ",成绩:" + score);

	}
}