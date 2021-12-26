package pers.chh3213.classLearn;
public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	public Customer(String f,String l) {
		this.firstName=f;
		this.lastName =l;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public Account getAccount() {
		return this.account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public void printAcount() {
		System.out.println("Customer ["+this.firstName+this.lastName+"]"+"has a acount: id is:"+this.account.getId()+"annualInterestRate is "+this.account.getAnnualInterestRate()+"%, "+"balance is "+this.account.getBalance());
	}
}
