package pers.chh3213.classLearn;

/*
 * 方法的形参的传递机制：值传递
 * 
 * 1.形参：方法定义时，声明的小括号内的参数
 *   实参：方法调用时，实际传递给形参的数据
 * 
 * 2.值传递机制：
 *  如果参数是基本数据类型，此时实参赋值给形参的是实参真是存储的数据值。
 */
public class TransferTest1 {
	public void swap(int a,int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("swap方法里：a = "+a+"; b = "+b);
	}
	public static void main(String[] args) {
		
		TransferTest1 test = new TransferTest1();
		int a = 5;
		int b = 10;
		System.out.println("交换前："+"a = " + a + ", b = " + b);
		
		test.swap(a, b);
		System.out.println("交换后："+"a = " + a + ", b = " + b);
		
	}
	
}
