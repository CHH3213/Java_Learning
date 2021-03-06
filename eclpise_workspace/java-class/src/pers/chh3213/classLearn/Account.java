
package pers.chh3213.classLearn;
/**
 * 写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter 和 setter
方法），取款方法 withdraw()，存款方法 deposit()。
 *
 */
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	public Account (int id, double balance, double annualInterestRate ) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	public Account(double balance) {
		this.balance = balance;
	}
	public int getId() {
		return this.id;
	}
	public double getBalance() {
		return this.balance ;
	}
	public double getAnnualInterestRate() {
		return this.annualInterestRate ;
	}
	public void setId( int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;

	}
	public void withdraw (double amount){
		//取钱
		if(amount>this.balance) {
			System.out.println("pool guy!not enough money!");
		}else {
			this.balance = this.balance-amount;
			System.out.println(" withdraw money success: "+amount);
			System.out.println("now the balance is :" + balance);
		}
	}
	public void deposit (double amount){//存钱
		this.balance = this.balance + amount;
		System.out.println("deposit success! The balance is: "+ this.balance);
	}


}
