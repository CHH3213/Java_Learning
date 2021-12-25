package pers.chh3213.classLearn;


public class CircleArea {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(10.0);
		double area = circle.computeArea();
		System.out.println(area);
	}
	
}
class Circle{
	double radius;
	public void setRadius(double r) {
		radius = r;
	}
	public double computeArea() {
		return(Math.PI*Math.pow(radius,2));

	}

}

