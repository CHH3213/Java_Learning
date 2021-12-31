package pers.chh3213.classLearn20211231;

public class OuterClass {

	private int s = 111;
	public class Inner {
		private int s = 222;
		public void mb(int s) {
			System.out.println(s); //局部变量s
			System.out.println(this.s); //内部类对象的属性s
			System.out.println(OuterClass.this.s); //外部类对象属性s
		}
	}
	public static void main(String[] args) {
		OuterClass a = new OuterClass();
		OuterClass.Inner b= a.new Inner();
		b.mb(333);
	}
}