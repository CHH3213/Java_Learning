package pers.chh3213.array;
import java.util.*;
public class ArrayMove {
	public static void main(String[] args) {
		int[] arr = new int[]{2,4,5,6,8,29,2,10,2132};
		System.out.println(Arrays.toString(arr));
		int m = 5;
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if(i>=arr.length-m) {
				arr2[i-arr.length+m] = arr[i];
			}
			else{arr2[m+i] =arr[i];}

		}
		System.out.println(Arrays.toString(arr2));

	}
}
