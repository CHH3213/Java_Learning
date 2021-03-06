package pers.chh3213.sort;

import java.util.Arrays;

/**
* DirectInsertSort.java
* @Description 直接插入法
* @author chh3213
* @version
* @date 2021年12月26日上午11:19:07
 */
public class DirectInsertSort {
	public static void main(String[] args) {
		DirectInsertSort insertSort = new DirectInsertSort();
		int[] arr = {9, -16, 310, 23, -30, -49, 25, 21, 30};
		insertSort.directInsertSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public void directInsertSort(int[] arr) {
		// 法一
		for (int i = 1; i < arr.length; i++) {
				int temp = arr[i];           // 记录要插入的数据
				int j=i;
				for ( ; j>0&&arr[j-1]>temp; j--) {// 从已经排序的序列最右边的开始比较，找到比其小的数
					arr[j]=arr[j-1];
				}
				if(j!=i)arr[j]=temp;
		}
		//法二
//		for (int i = 1; i < arr.length; i++) {
//			for(int j=i;j>0;j--) {
//				if(arr[j]<arr[j-1])swap(arr, j, j-1);
//			}
//		}
	}
	public void swap(int[] arr, int i, int j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}


}
