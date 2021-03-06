package pers.chh3213.classLearn20211229;


class Bank{
	private int id;
	private String password;
	private double balance;
	private static double annualInterestRate;
	private static double min_balance;
	public Bank(int id,String password,double balance,double annualInterestRate,double min_balance) {
		// TODO Auto-generated constructor stub
		this.id =id;
		this.balance=balance;
		Bank.annualInterestRate=annualInterestRate;
		Bank.min_balance=min_balance;
	}
	public Bank() {
		id =(int)( Math.random()*30);
		balance =(double)( Math.random()*30000+5000);
		password = "1245679";
		Bank.annualInterestRate=1;
		Bank.min_balance=10;
		// TODO Auto-generated constructor stub
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
		Bank.annualInterestRate = annualInterestRate;
	}
	public static void setMin_balance(double min_balance) {
		Bank.min_balance = min_balance;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public int getId() {
		return id;
	}
	public static double getMin_balance() {
		return min_balance;
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public String getPassword() {
		return password;
	}
	public void printInfo() {
		System.out.println("id:"+id);
		System.out.println("password:"+password);
		System.out.println("balance:"+balance);
		System.out.println("annualInterestRate:"+annualInterestRate);
		System.out.println("min_balance:"+min_balance);
	}


}
public class BankTest {
	public static void main(String[] args) {
		Bank[] bank = new Bank[3];
		for (Bank bank2 : bank) {
			bank2 = new Bank();
			bank2.setAnnualInterestRate(0.2);
			bank2.setMin_balance(1);
			bank2.printInfo();
			System.out.println("==============");
		}
	}
}
