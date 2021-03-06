package pers.chh3213.classLearn;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("jane", "Smith");
		bank.addCustomer("Well", "Green");
		bank.getCustomer(0).setAccount(new Account(50000));
		bank.getCustomer(0).getAccount().withdraw(5000);

		double balance = bank.getCustomer(0).getAccount().getBalance();

		System.out.println("Customer: " + bank.getCustomer(0).getFirstName() + "'s balance：" + balance);

		System.out.println("***************************");
		bank.addCustomer("John", "Snow");

		System.out.println("number of customers: " + bank.getNumOfCustomers());


	}
}
