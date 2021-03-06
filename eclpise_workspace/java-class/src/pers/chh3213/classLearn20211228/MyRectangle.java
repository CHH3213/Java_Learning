package pers.chh3213.classLearn20211228;

public class MyRectangle extends GeometricObject{
	private double width;
	private double height;
	public MyRectangle(double width,double height,String color,double weight) {
		// TODO Auto-generated constructor stub
		super(color, weight);
		this.width=width;
		this.height=height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public double findArea() {
		return this.width*this.height;
	}
}
