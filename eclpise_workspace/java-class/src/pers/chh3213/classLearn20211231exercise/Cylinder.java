package pers.chh3213.classLearn20211231exercise;

public class Cylinder extends Circle {
	private double height;
	public Cylinder(double height,double radius) {
		super(radius);
		this.height=height;
	}
	@Override
	public double area() {
		return super.area()*2+super.perimeter()*height;
	}
	public double volume() {
		return super.area()*height;
	}
}
