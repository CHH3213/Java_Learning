package pers.chh3213.classLearn20211229;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	public Account(int id,double balance,double annualInterestRate) {
		// TODO Auto-generated constructor stub
		this.id =id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public double getBalance() {
		return balance;
	}
	public int getId() {
		return id;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMonthlyInterest() {
		/**
		 * 月利率=年利率/12
		 */
		return this.annualInterestRate/12;
	}
	public void withdraw(double amount) {
		//取款
		if(this.balance-amount>=0)this.balance=this.balance-amount;
		else {
			System.out.println("余额不足!");
		}
	}
	public void deposit(double amount) {
		//存钱
		this.balance=this.balance+amount;
	}
}
