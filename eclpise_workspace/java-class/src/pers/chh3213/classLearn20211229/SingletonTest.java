package pers.chh3213.classLearn20211229;

public class SingletonTest {
	public static void main(String[] args) {
//		Bank2 bank1 = new Bank2(); 
//		Bank2 bank2 = new Bank2(); 
		
		Bank2 bank1 = Bank2.getInstance();
		Bank2 bank2 = Bank2.getInstance();
		
		System.out.println(bank1 == bank2);
		
	}
}

//单例的饿汉式
class Bank2{
	
	//1.私有化类的构造器
	private Bank2(){
		
	}
	
	//2.内部创见类的对象
	//4.要求此对象也必须声明为静态的
	private static Bank2 instance = new Bank2();
	
	//3.提供公共的静态的方法，返回类的对象。
	public static Bank2 getInstance(){
		return instance;
	}
}