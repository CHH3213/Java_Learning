package pers.chh3213.array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayClassTest {
	public static void main(String[] args) {
//		arrayTest();
//		arrayClassExample();
		int[][] arr = new int[3][3];
		for (int i =0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]= (int)(Math.random()*30);
			}
		}
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2+"\t");
			}
			System.out.println();
		}
		int sum = 0;
		for (int i =0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				if(i==j)sum+=arr[i][j];
			}
		}
		System.out.println("sum is: "+ sum);

	}
	public static void arrayTest() {
		int[] arr1 = new int[] {2,5,10,456,4,23,15684,8749};
		int[] arr2 = new int[] {2,5,10,456,4,203,15684,8749};
		//判断两个数组是否相等
		boolean is_equal = Arrays.equals(arr1, arr2);
		System.out.println("is equal? "+ is_equal);
		//输出数组信息
		System.out.println(Arrays.toString(arr1));
		//将指定值填充到数组之中--感觉很鸡肋
//		Arrays.fill(arr1, 100);
//		System.out.println(Arrays.toString(arr1));
		//对数组进行排序
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		//对排序后的数组进行二分法检索指定的值
		int index = Arrays.binarySearch(arr1, 456);
		System.out.println(index);

	}

	public static void arrayClassExample() {
		int[] arr = {5,4,3,2,1};
		int[] arr2 = new int[arr.length];
		for (int i = 0,j=arr.length-1; i < arr.length; i++,j--) {
			arr2[j] = arr[i];
		}
		System.out.println(Arrays.toString(arr2));

	}
}
