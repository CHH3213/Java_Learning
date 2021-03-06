package pers.chh3213.sort;

import java.util.Arrays;
/**
 *
* MergeSort.java
* @Description 归并排序
* @author chh3213
* @version
* @date 2021年12月26日下午4:54:53
 */
public class MergeSort {
	public static void main(String[] args) {
		MergeSort Sort = new MergeSort();
		int[] arr = {9, -16, 310, 23, -30, -49, 25, 21, 30};
		Sort.mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public void mergeSort(int[] arr,int left, int right) {
		int mid = (left+right)/2;
		if(left<right) {
			//递归
			mergeSort(arr, left, mid);//左边归并排序，使得左子序列有序
			mergeSort(arr, mid+1, right);//右边归并排序，使得右子序列有序
			//合并
			merge(arr, left, right, mid);//将两个有序子数组合并操作
		}
	}

	public void merge(int[] arr, int left,int right, int mid) {
		/*
		 * 将两个有序数组合并
		 */
		int[] temp = new int[right-left+1]; //建好一个临时数组
		int i=left; //左子序列索引（理解成指针）
		int j = mid+1;//右子序列索引（理解成指针）
		int k =0;//临时数组的索引（理解成指针）
		while(i<=mid && j<=right) {
			if(arr[i]<=arr[j]) {
				temp[k++]=arr[i++];
			}
			else {
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid)temp[k++]=arr[i++];//将左子序列剩余元素填充进temp中
		while(j<=right)temp[k++]=arr[j++];//将右子序列剩余元素填充进temp中
		//将temp中的元素全部拷贝回原数组中
		for (int k2 = 0; k2 < temp.length; k2++) {
			arr[k2+left]=temp[k2];
		}
	}
}
