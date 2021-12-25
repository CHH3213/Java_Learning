package pers.chh3213.classLearn;

public class TriAngleTest {
	public static void main(String[] args) {
		TriAngle triAngle = new TriAngle(10, 10);
		triAngle.setBase(5);
		triAngle.setHeight(10);
		int s = triAngle.computeArea();
		int s2 = triAngle.getBase()*triAngle.getHeight()/2;
		System.out.println(s);
		System.out.println(s2);
		
	}
}
class TriAngle{
	private int base;
	private int height;
	public int getHeight() {
		return height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int b) {
		base = b;
	}
	public void setHeight(int h) {
		height = h;
	}
	public TriAngle(int b,int h) {
		// TODO Auto-generated constructor stub
		height = h;
		base = b;
	}
	public int computeArea() {
		return base*height/2;
	}
}