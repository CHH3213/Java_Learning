package pers.chh3213.array;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Fibonacci do you want to obtain: ");
		int number = scanner.nextInt();
		int[] fibonacci = new int[number];
		fibonacci[0]=0;
		fibonacci[1]=1;
		if(fibonacci.length>2) {
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
		}
	}
		for (int i : fibonacci) {
			System.out.print(i+"\t");
		};

	}


}
