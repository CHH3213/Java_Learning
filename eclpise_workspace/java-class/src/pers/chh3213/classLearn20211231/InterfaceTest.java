package pers.chh3213.classLearn20211231;

interface CompareObject {
	public int compareTo(Object o);//返回值为0，代表相等；若为正数，代表当前对象大，负数代表当前对象小

}

class Circle{
	private Double  radius;
	public Double  getRadius() {
		return radius;
	}
	public void setRadius(Double  radius) {
		this.radius = radius;
	}
	public Circle(Double  radius) {
		super();
		this.radius=radius;
	}
	public Circle() {
		super();
	}
}

class ComparableCircle extends Circle implements CompareObject{
	public ComparableCircle(double radius) {
		super(radius);
	}
	public int compareTo(Object o) {
		if(this==o)return 0;
		else if (o instanceof ComparableCircle) {
			ComparableCircle circle = (ComparableCircle) o;
			//正确的方式一：
//			if(this.getRadius() > circle.getRadius()){
//				return 1;
//			}else if(this.getRadius() < circle.getRadius()){
//				return -1;
//			}else{
//				return 0;
//			}
//			当属性 radius 声明为 Double 类型时，可以调用包装类的方法
			//正确的方式二：
			return this.getRadius().compareTo(circle.getRadius());
		}else{
			return 0;
//			throw new RuntimeException("传入数据类型不匹配");
		}

	}
}

public class InterfaceTest{
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(1.0);
		ComparableCircle c2 = new ComparableCircle(1.1);
		int result = c1.compareTo(c2);
		System.out.println(result);
		int compareValue1 = c1.compareTo(new String("AA"));
		System.out.println(compareValue1);
	}
}
