package pers.chh3213.project2;
/**
 *
* CustomerList.java
* @Description 为Customer对象的管理模块，内部使用数组管理一组Customer对象
* @author chh3213
* @version
* @date 2021年12月27日下午11:08:09
 */
public class CustomerList {
	private Customer[] customers;//用来保存客户对象的数组
	private int total;//记录已保存客户对象的数量
	public static void main(String[] args) {
		CustomerList cuList = new CustomerList(10);

	}
	public  CustomerList(int totalCustomer) {
		// 构造器，用来初始化customers数组
		this.customers = new Customer[totalCustomer];
	}
	public boolean addCustomer(Customer customer){
		//将参数customer添加到数组中最后一个客户对象记录之后
		if(this.customers.length<=this.total){
			System.out.println("添加失败，客户数量已满");
			return false;
		}
		else {
			this.customers[this.total]=customer;
			this.total++;
		}
//		System.out.println(this.total);
		return true;
	}
	public boolean replaceCustomer(int index, Customer cust) {
		//用参数customer替换数组中由index指定的对象
		for (int i = 0; i < this.total; i++) {
			if(i==index) {
				this.customers[i]=cust;
				return true;
			}
		}
		System.out.println("索引无效，无法替换");
		return false;

	}
	public boolean deleteCustomer(int index) {
		//从数组中删除参数index指定索引位置的客户对象记录
		for (int i = 0; i < this.total; i++) {
			if(i==index) {
				for (int j = i; j < this.total; j++) {
					if(j+1!=this.customers.length) {
						this.customers[j]=this.customers[j+1];
					}
					else {
						this.customers[j]=null;
					}
				}
				this.total--;
				return true;
			}
		}
		System.out.println("索引无效，无法删除");
		return false;
	}
	public Customer[] getAllCustomers() {
		//返回数组中记录的所有客户对象
		Customer[] customers = new Customer[this.total];
		for (int i = 0; i < this.total; i++) {
			customers[i]= this.customers[i];
		}
		return customers;
	}
	public Customer getCustomer(int index) {
		if(index<this.total)return this.customers[index];
		else {
			System.out.println("该索引位置无客户信息");
			return null;
		}
	}
	public int getTotal() {
		return total;
	}
}
