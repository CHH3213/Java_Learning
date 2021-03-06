package pers.chh3213.classLearn;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;
	public Bank() {
		this.customers = new Customer[1000];
	}
	public void addCustomer(String f,String l) {
		Customer customer = new Customer(f, l);
		this.customers[this.numberOfCustomer]=customer;
		this.numberOfCustomer++;
	}
	public int getNumOfCustomers() {
		return this.numberOfCustomer;
	}
	public Customer getCustomer(int index) {
		return this.customers[index];
	}
}
