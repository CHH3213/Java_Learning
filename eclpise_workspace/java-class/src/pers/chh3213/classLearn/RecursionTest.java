package pers.chh3213.classLearn;

public class RecursionTest {
	public static void main(String[] args) {

//		int result = nFactorial(3);
//		System.out.println(result);
//		int fibonacci_result = fibonacci(3);
//		System.out.println(fibonacci_result);
		recursion(10);
	}
	public static int nFactorial(int number) {
		if(number==1)return number;
		else {
			return number*nFactorial(number-1);
		}
	}
	public static int fibonacci(int n) {
		if(n==1 || n==2)return 1;
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	private static int count = 0;
	public static int recursion(int k) {
		count++;
		System.out.println("count:"+count+" k:"+k);
		if(k<=0)return 0;
		return recursion(k-1)+recursion(k-2);
	}
}


