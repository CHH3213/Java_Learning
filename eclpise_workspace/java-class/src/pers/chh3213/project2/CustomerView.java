package pers.chh3213.project2;

import java.util.Iterator;

/**
 *
* CustomerView.java
* @Description 为主模块，负责菜单的显示和处理用户操作
* @author chh3213
* @version
* @date 2021年12月28日上午8:41:00
 */
public class CustomerView {
	private CustomerList customerList;
	public CustomerView() {
		customerList = new CustomerList(10);
	}
	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}
	public void enterMainMenu() {
		/*显示主菜单，响应用户输入，
		 * 根据用户操作分别调用其他相应的成员方法（如addNewCustomer），
		 * 以完成客户信息处理。
		 */
		while (true) {
			System.out.print("-------客户信息管理软件-------\r\n"
					+ "\r\n"
					+ "       1 添 加 客 户\r\n"
					+ "       2 修 改 客 户\r\n"
					+ "       3 删 除 客 户\r\n"
					+ "       4 客 户 列 表\r\n"
					+ "       5 退   出\r\n"
					+ "\r\n"
					+ "       请选择(1-5)：");
			char choose = CMUtility.readMenuSelection();
			switch (choose) {
			case '1': {
				this.addNewCustomer();
				break;
			}
			case '2': {
				this.modifyCustomer();
				break;
			}
			case '3': {
				this.deleteCustomer();
				break;
			}
			case '4': {
				this.listAllCustomers();
				break;
			}
			default:
				System.out.println("是否退出(Y/N)?");
				char c= CMUtility.readConfirmSelection();
				if(c== 'Y')System.exit(0);
				else {
					break;
				}
			}
		}

	}
	private void addNewCustomer() {
		//添加客户
		System.out.println("--------添加客户----------");
		System.out.print("姓名：");
		String name = CMUtility.readString(10);
		System.out.println();
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.println();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.println();
		System.out.print("电话：");
		String phone = CMUtility.readString(12);
		System.out.println();
		System.out.print("邮箱：");
		String email = CMUtility.readString(20);
		boolean addCustomerSuccess = this.customerList.addCustomer(new Customer(name, gender, age, phone, email));
		if(addCustomerSuccess) {
			System.out.println("---------------------添加完成---------------------\r\n");
		}
	}
	private void modifyCustomer() {
		//修改客户
		System.out.println("--------修改客户----------");
		System.out.print("请选择待修改客户编号(-1退出)：");
		int choose = CMUtility.readInt(-1);
		if(choose!=-1 && choose<this.customerList.getTotal()) {
			System.out.println();
			System.out.print("姓名：("+this.customerList.getCustomer(choose).getName()+")");
			String name = CMUtility.readString(10,this.customerList.getCustomer(choose).getName());
			System.out.println();
			System.out.print("性别：("+this.customerList.getCustomer(choose).getGender()+")");
			char gender = CMUtility.readChar(this.customerList.getCustomer(choose).getGender());
			System.out.println();
			System.out.print("年龄：("+this.customerList.getCustomer(choose).getAge()+")");
			int age = CMUtility.readInt(this.customerList.getCustomer(choose).getAge());
			System.out.println();
			System.out.print("电话：("+this.customerList.getCustomer(choose).getPhone()+")");
			String phone = CMUtility.readString(12,this.customerList.getCustomer(choose).getPhone());
			System.out.println();
			System.out.print("邮箱：("+this.customerList.getCustomer(choose).getEmail()+")");
			String email = CMUtility.readString(20,this.customerList.getCustomer(choose).getEmail());
			this.customerList.replaceCustomer(choose, new Customer(name, gender, age, phone, email));
			System.out.println("---------------------修改完成---------------------\r\n");
		}
		if(choose>=this.customerList.getTotal()) {
			System.out.println("此索引无客户信息");
		}
	}
	private void deleteCustomer() {
		//删除客户
		System.out.println("---------------------删除客户---------------------");
		System.out.print("请选择待删除客户编号(-1退出)：");
		int choose = CMUtility.readInt(-1);
		if(choose!=-1&& choose<this.customerList.getTotal()) {
			System.out.println();
			System.out.print("确认是否删除(Y/N)：");
			char c= CMUtility.readConfirmSelection();
			if(c=='Y') {
				this.customerList.deleteCustomer(choose);
			}
		}
		if(choose>=this.customerList.getTotal()) {
			System.out.println("此索引无客户信息");
		}
	}
	private void listAllCustomers() {
		//客户列表
		System.out.println("-------------------客户列表-------------------");
		System.out.println("编号  姓名   性别   年龄          电话                   邮箱\r\n");
		Customer[] customers = this.customerList.getAllCustomers();
		for (int i = 0; i < customers.length; i++) {
			System.out.println(i+"\t"+customers[i].getName()+"\t"+customers[i].getGender()+"\t"+customers[i].getAge()+"\t"+customers[i].getPhone()+"\t"+customers[i].getEmail());
		}
		System.out.println("-------------------客户列表完成--------------");
	}
}
