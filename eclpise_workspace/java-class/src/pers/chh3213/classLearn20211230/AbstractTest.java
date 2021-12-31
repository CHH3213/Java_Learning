package pers.chh3213.classLearn20211230;

public class AbstractTest {
	public static void main(String args[]) {
		A a = new B();
		a.m1();
		a.m2();
	}
}

abstract class A{
	abstract void m1();
	public void m2() {
	System.out.println("A类中ЕXtm2方法");
	}
}
class B extends A{
	void m1() {
		System.out.println("B类中定义的m1方法");
	}
}


