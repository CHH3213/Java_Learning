package pers.chh3213.classLearn20211228;

public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		test.displayGeometricObject(new MyRectangle(10, 20, null, 0));
		test.displayGeometricObject(new Circle(5, null, 0));
		test.equalsArea(new MyRectangle(10, 20, null, 0), new MyRectangle(10, 10, null, 0));;
	}
	public void equalsArea(GeometricObject ob1,GeometricObject ob2) {
		if(ob1.findArea()==ob2.findArea())System.out.println("Areas are equal");
		else {
			System.out.println("Areas are not equal");
		}
	}
	public void displayGeometricObject(GeometricObject objecet) {
		System.out.println("area is:"+objecet.findArea());
	}
}
