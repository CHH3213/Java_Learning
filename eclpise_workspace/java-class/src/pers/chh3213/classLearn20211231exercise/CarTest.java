package pers.chh3213.classLearn20211231exercise;


class Car{
	private double temperature;
	public Car(double temperature) {
		// TODO Auto-generated constructor stub
		this.temperature = temperature;
	}
	class Air{
		public void flow() {
			if(temperature>40) {
				System.out.println("cold wind");
			}
			else if(temperature<0) {
				System.out.println("warm wind");
			}
			else {
				System.out.println("close Air");
			}
		}
	}
	public void test(Air air) {
		air.flow();
	}

}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car(45);
		Car c2 = new Car(15);
		Car c3 = new Car(-45);
		c1.test(c1.new Air());
		c2.test(c2.new Air());
		c3.test(c3.new Air());
	}
}
