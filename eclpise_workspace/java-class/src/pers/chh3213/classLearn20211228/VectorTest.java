package pers.chh3213.classLearn20211228;
import java.util.Vector;
import java.util.Scanner;
public class VectorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector vector =new Vector();
		int max = 0;
		System.out.println("请输入学生成绩（以负数代表输入结束）");
		while (true) {
			int score =scanner.nextInt();
			if(score<0)break;
			else if(score>100){
				System.out.println("输入的数据>100，请重新输入");
				continue;
			}
			vector.addElement(score);
			if(score>max)max=score;
		}
		//遍历数组
		char level;
		for (int i = 0; i < vector.size(); i++) {
			Object object = vector.elementAt(i);
			int score=(int)object;
			if(max-score<=10)level='A';
			else if (max-score<=20) {
				level='B';
			}else if (max-score<=30) {
				level='C';
			}else {
				level='D';
			}
			System.out.println("student-" + i + " score is " + score + ",level is " + level);
		}


		System.out.println();
	}
}
