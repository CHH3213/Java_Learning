package pers.chh3213.classLearn20211230;

/*
 * 抽象类的匿名子类
 *
 */
public class PersonTest {
	public static void main(String[] args) {

		method(new Student());	//匿名对象

		Worker worker = new Worker();
		method1(worker);	//非匿名的类非匿名的对象

		method1(new Worker());	//非匿名的类匿名的对象

		System.out.println("*********************");

		//创建了一个匿名子类的对象:p
		Person p = new Person(){

			@Override
			public void eat() {
				System.out.println("吃东西");
			}

			@Override
			public void breath() {
				System.out.println("呼吸空气");
			}

		};
		method1(p);
		System.out.println("**********************");
		//创建匿名子类的匿名对象
		method1(new Person(){

			@Override
			public void eat() {
				System.out.println("吃零食");
			}

			@Override
			public void breath() {
				System.out.println("云南的空气");
			}

		});
	}

	public static void method1(Person p){
		p.eat();
		p.walk();
	}

	public static void method(Student s){

	}
}
class Worker extends Person{

	@Override
	public void eat() {
	}

	@Override
	public void breath() {
	}
}
