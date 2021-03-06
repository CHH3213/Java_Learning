package pers.chh3213.sort;

import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {
		ShellSort shell = new ShellSort();
		int[] arr = {9, -16, 310, 23, -30, -49, 25, 21, 30};
		shell.shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public void shellSort(int[] arr) {
		//第一次步长为数组长度/2，后面依次步长/2
		for (int step = arr.length /2; step >0; step /= 2) {
			//直接插入排序
			for (int i = step; i < arr.length; i++) {
				int temp = arr[i];//右侧待排序区第一个数
				int j=i-step;//左侧已排序区域第一个数索引
				for( ;j>=0&&arr[j]>temp;j-=step) {
					arr[j+step]=arr[j];//满足条件则把已排序数字往后挪一个位置
//					swap(arr, j, j+step);
				}
				//插入待排序数字到指定位置
				arr[j+step]=temp;
			}


		}
	}
	public void swap(int[] arr, int i, int j) {
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
