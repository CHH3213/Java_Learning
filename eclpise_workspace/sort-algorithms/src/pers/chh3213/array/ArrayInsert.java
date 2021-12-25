package pers.chh3213.array;
import java.util.*;
/**
 * 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
* ArrayInsert.java
* @Description
* @author chh3213
* @version 1.0
* @date 2021年12月25日上午10:42:49
 */
public class ArrayInsert {
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,4,5,8};
		int[] arr2 = new int[arr.length+1];
		System.out.println(Arrays.toString(arr));
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input your number that you want to insert: ");
		int number = scanner.nextInt();
		if(number>=arr[arr.length-1]) {
			arr2[arr2.length-1]=number;
			for (int i = 0; i < arr.length; i++) {
				arr2[i] =arr[i];
			}
		}
		else {
			Boolean insert_flag = true;
			for (int i = 0,j=0; i < arr.length; i++,j++) {
				arr2[j] =arr[i];
				if(number<=arr[i] && insert_flag) {
					insert_flag = false;
					arr2[j]=number;
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));




	}
}
