package pers.chh3213.classLearn20211228;

public class GeometricObject {
	protected String color;
	protected double weight;
	protected GeometricObject(String color,double weight) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.weight = weight;

	}
	public String getColor() {
		return color;
	}
	public double getWeight() {
		return weight;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double findArea() {
		return 0.0;
	}
}
