package pers.chh3213.classLearn20220101exercise;

interface Car{
	void run();
}
class Audi implements Car{
	public void run() {
	System.out.println("奥迪在跑");
	}
}
class BYD implements Car{
	public void run() {
	System.out.println("比亚迪在跑");
	}
}
public class Client01 {
	public static void main(String[] args) {
		Car a = new Audi();
		Car b = new BYD();
		a.run();
		b.run();
	}
}