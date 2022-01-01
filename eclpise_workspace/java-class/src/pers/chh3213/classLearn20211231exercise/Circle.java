package pers.chh3213.classLearn20211231exercise;

public class Circle implements Shape{
	private double radius;
	public Circle (double radius ) {
		this.radius = radius;
	}
	public double area() {
		return PI*radius*radius;
	}
	public double perimeter() {
		return 2*PI*radius;
	}

}
