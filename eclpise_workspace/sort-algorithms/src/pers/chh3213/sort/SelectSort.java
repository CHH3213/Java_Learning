package pers.chh3213.sort;

import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		SelectSort select = new SelectSort();
		int[] arr = {9, -16, 310, 23, -30, -49, 25, 21, 30};
		select.selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {//进行n-1趟排序
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min]>arr[j])min=j; // 记录目前能找到的最小值元素的下标
			}
			 // 找到最小值后，再将找到的最小值和i位置所在的值进行交换
			if(i!=min)swap(arr, i, min);
		}
	}
	public void swap(int[] arr, int i, int j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
