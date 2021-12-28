package pers.chh3213.classLearn20211228;

public class Circle extends GeometricObject {
	private double radius;
	public Circle(double radius,String color,double weight) {
		// TODO Auto-generated constructor stub
		super(color, weight);
		this.radius=radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double findArea() {
		return Math.PI*radius*radius;
	}
}
