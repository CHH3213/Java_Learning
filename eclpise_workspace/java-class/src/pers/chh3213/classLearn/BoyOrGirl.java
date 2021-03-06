package pers.chh3213.classLearn;

public class BoyOrGirl {
	public static void main(String[] args) {
		Boy b1 = new Boy("John", 25);
		Boy b2 = new Boy("Johnson", 24);
		Girl g1 = new Girl("Jane", 23);
		Girl g2 = new Girl("Angel", 22);
		g1.compare(g2);
		g1.marry(b2);
		b1.marry(g2);
	}
}
class Boy{
	private String name;
	private int age;
	public Boy(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void marry(Girl girl) {
		System.out.println(this.getName()+" married with:" +girl.getName());

	}
	public void shout() {
		System.out.println("I'm a rich boy!!");
	}
}
class Girl{
	private String name;
	private int age;
	public Girl(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public void marry(Boy boy) {
		System.out.println(this.getName()+" married with:" +boy.getName());
	}
	public void compare(Girl girl) {
		System.out.println(this.getName()+"'s age:"+ this.age);
		System.out.println(girl.getName()+"'s age:"+ girl.getAge());
	}
}
