package pers.chh3213.classLearn20211230;
import java.util.Scanner;
public class PayrollSystem {
	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		employees[0] = new SalariedEmployee("jack", 0, new MyDate(1997, 1,1),10000);
		employees[1] = new SalariedEmployee("rose", 1, new MyDate(1997, 8,8),10001);
		employees[2] = new HourlyEmployee("mary", 2, new MyDate(1996, 8,8),50,5);
		System.out.println("请输入当前月份:");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		for (Employee employee : employees) {
//			System.out.println(employee.earnings());
			System.out.println(employee.toString());
			double salary = employee.earnings();
			System.out.println("月工资为：" + salary);
			if (month==employee.getBirthday().getMonth()) {
				System.out.println("工资增加100元");
			}
		}
	}
}
