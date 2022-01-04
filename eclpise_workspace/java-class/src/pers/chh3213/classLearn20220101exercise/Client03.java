package pers.chh3213.classLearn20220101exercise;

//工厂接口
interface Factory{
	Car getCar();
}
//两个工厂类
class AudiFactory implements Factory{
	public Audi getCar(){
		return new Audi();
	}
}
class BydFactory implements Factory{
	public BYD getCar(){
		return new BYD();
	}
}
public class Client03 {
	public static void main(String[] args) {
		Car a = new AudiFactory().getCar();
		Car b = new BydFactory().getCar();
		a.run();
		b.run();
	}
}
