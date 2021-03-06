package pers.chh3213.classLearn20211228;

public class MainTest {
	public static void main(String[] args) {
		test();
		method1();
	}
	public static void test() {
//		char[] arr = new char[] {'a','b','c'};
//		System.out.println(arr);
//		int[] arr1 = new int[] {1,2,3};
//		System.out.println(arr1);
//		double[] arr2 = new double[] {1.1,2.2,3.3};
//		System.out.println(arr2);
////		String string = 5+"";
		Object o1= true? new Integer(1) : new Double(2.0);
		System.out.println(o1);//

		Object o2;
		if(true)
			o2 = new Integer(1);
		else {
		o2 = new Double(2.0);
		}
		System.out.println(o2);//
	}

	public static void method1() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
//		System.out.println(i);
//		System.out.println(i == j); //比较的是对象地址：false
		System.out.println(i.equals(j)); //true

	    //Integer内部定义了一个IntegerCache结构，IntegerCache中定义Integer[]
		//保存了从-128-127范围的整数。如果我们使用自动装箱的方式，给Integer赋值的范围在其中时，
		//可以直接使用数组中的元素，不用再去new了。目的，提高效率。

		Integer m = 1;
		Integer n = 1;
//		System.out.println(m);
		System.out.println(m == n);//true

		Integer x = 128;//相当于new了一个Integer对象
		Integer y = 128;//相当于new了一个Integer对象
		System.out.println(x == y);//false

	}
}
