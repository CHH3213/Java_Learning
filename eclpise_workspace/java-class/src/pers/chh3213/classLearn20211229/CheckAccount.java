package pers.chh3213.classLearn20211229;

public class CheckAccount extends Account {
	private double overdraft;
	public static void main(String[] args) {
		CheckAccount checkAccount = new CheckAccount(1122, 20000, 4.5, 5000);
		checkAccount.withdraw (5000);
		System.out.println("您的账户余额为："+checkAccount.getBalance());
		System.out.println("您的可透支额为："+checkAccount.getOverdraft());
		checkAccount.withdraw (18000);
		System.out.println("您的账户余额为："+checkAccount.getBalance());
		System.out.println("您的可透支额为："+checkAccount.getOverdraft());
		checkAccount.withdraw (3000);
		System.out.println("您的账户余额为："+checkAccount.getBalance());
		System.out.println("您的可透支额为："+checkAccount.getOverdraft());

	}
	public CheckAccount(int id,double balance,double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	public double getOverdraft() {
		return overdraft;
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount<super.getBalance()) {
			super.withdraw(amount);
		}
		else if (amount>super.getBalance()) {
			double overdraft = amount-super.getBalance();
			if(this.overdraft>=overdraft) {
				super.setBalance(0);
				this.overdraft-=overdraft;
			}
			else {
				System.out.println("超过可透支额的限额!!!");
			}
		}
	}
}
