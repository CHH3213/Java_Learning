package pers.chh3213.classLearn;
import pers.chh3213.classLearn.Account;
public class MainClass {
//	public static void main(String[] args) {
//		Customer customer = new Customer("Jane", "Smith");
//		Account account = new Account(1000, 2000, 1.23);
//		customer.setAccount(account);
//		Account acount2 =  customer.getAccount();
//		acount2.deposit(100);
//		acount2.withdraw(960);
//		acount2.withdraw(2000);
//		customer.printAcount();
//
//	}
	public static void main(String[] args){
		show(0);
		show(1);
	}
	public static void show(int i){
		switch(i){
			default:
				i+=2;
	//			System.out.println("1");
			case 1:
				i+=1;
	//			System.out.println("2");
	
			case 4:
				i+=8;
	//			System.out.println("3");
	
			case 2:
				i+=4;
	//			System.out.println("4");
	
			}
		System.out.println("i="+i);
	}

}
