package pers.chh3213.classLearn20211231exercise;

public class First {
	private int a;
	static int b = 5;
	public class Contents{
		public int c;
		static int d;
		public void f(){
			System.out.println(a);
			System.out.println(b);
		}
	}
	static class Titles{
		public int e;
		static int f;
		public void show(){
//			System.out.println(a);
			System.out.println(b);
		}
	}
//	public void getInnerClassDate(){
//		System.out.println(c);//
//		System.out.println(d);//
//		System.out.println(e);//
//		System.out.println(f);//
//	}
	public static void main(String[] args) {
		First.Contents con= new First().new Contents();
		con.f();
		
	}
}
