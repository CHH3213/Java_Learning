package pers.chh3213.classLearn20211229;

class Person {
	private int id;
	private static int total = 0;
	public static int getTotalPerson() {
//		id++;//非法
		return total;
	}
	public static void setTotalPerson(int total) {
//		this.total = total;//非法，在static方法中不能有this或super
		Person.total=total;
	}
	public Person() {
		total++;
		id = total;
	}
}
public class PersonTest {
	public static void main(String[] args) {
		System.out.println("Number of total is " + Person.getTotalPerson());
		//没有创建对象也可以访问静态方法
		Person p1 = new Person();
		Person.setTotalPerson(10);
		System.out.println( "Number of total is "+ Person.getTotalPerson());
	}
}