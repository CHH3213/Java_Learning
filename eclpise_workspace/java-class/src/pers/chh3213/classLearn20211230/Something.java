package pers.chh3213.classLearn20211230;

public class Something {
	public static void main(String[] args) {
		Other o = new Other();
		new Something().addOne(o);
	}
	public void addOne(final Other o) {
//		 o = new Other();
		o.i++;
		System.out.println(o.i);
	}
}
class Other {
	public int i;
}