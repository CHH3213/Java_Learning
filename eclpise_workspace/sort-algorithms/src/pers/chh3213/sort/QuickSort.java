package pers.chh3213.sort;
public class QuickSort {
	public static void main(String[] args) {
		System.out.println("quick sort test");
		int[] arr = {9, -16, 30, 23, -30, -49, 25, 21, 30};
		System.out.println("before sort:");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		quickSort(arr, 0, arr.length-1);
		System.out.println();
		System.out.println("after sort:");
		for (int i : arr) {
			System.out.print(i+"\t");
		}

	}
	public static void quickSort(int[] arr,int start, int end) {
		if(start<end) {
			 int index = partition(arr, start, end); //将表一分为2
			 quickSort(arr, start, index-1); // 对左子序列进行快速排序
			 quickSort(arr, index+1, end); //对右子序列进行快速排序
		}

	}
//	一次划分
	public static int partition(int[] arr, int low,int high) {

		int base = arr[low]; //暂存基准元素到base
		while (low<high) {//从表的两端交替的向中间扫描
			while(low<high && arr[high]>=base)high--;//右端扫描
			if(low<high) {
				arr[low]=arr[high];//把比基准小的元素放到基准前面
				low++;
			}
			while(low<high && arr[low]< base)low++;//左端扫描
			if(low<high) {
				arr[high]=arr[low];//把比基准大的元素放到基准后面
				high--;
			}
		}
		arr[low] = base;//把基准元素放到最终位置

		return low;//返回基准元素所在的位置
	}


}
