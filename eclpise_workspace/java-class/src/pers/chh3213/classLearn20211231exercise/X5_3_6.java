package pers.chh3213.classLearn20211231exercise;

public class X5_3_6 {
	public static void main(String[] args) {
		Circle cir1 = new Circle(5.0);
		Circle cir2 = new Circle(4.0);
		System.out.println(cir1.area());
		System.out.println(cir1.perimeter());
		System.out.println(cir2.area());
		System.out.println(cir2.perimeter());
		Cylinder cy1 = new Cylinder(10.0, 1.0);
		Cylinder cy2 = new Cylinder(20.0, 1.0);
		System.out.println(cy1.area());
		System.out.println(cy1.volume());
		System.out.println(cy2.area());
		System.out.println(cy2.volume());

	}
}
