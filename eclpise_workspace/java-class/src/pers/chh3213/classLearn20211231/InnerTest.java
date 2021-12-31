package pers.chh3213.classLearn20211231;

public class InnerTest {
	public InnerTest() {
		Inner s1 = new Inner();
		s1.a = 10;
		Inner s2 = new Inner();
		s2.a = 20;
		InnerTest.Inner s3 = new InnerTest. Inner();
		System.out.println(s3.a);
	}
	class Inner {
		public int a = 5;
	}
	public static void main(String[] args) {
	InnerTest t = new InnerTest();
	Inner r =t.new Inner();
	System.out.println(r.a);
	}
}
