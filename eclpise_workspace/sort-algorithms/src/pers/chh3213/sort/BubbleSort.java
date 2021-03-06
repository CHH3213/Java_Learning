package pers.chh3213.sort;
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5,4,1,966,2,3,56,89,12,0,56562};
		System.out.println("before sort:");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
//		// solution 1
////		for(int i=0;i<arr.length-1;i++) {
////			for (int j = i; j < arr.length; j++) {
////				if(arr[i]>arr[j]) {
////					int temp = arr[i];
////					arr[i]= arr[j];
////					arr[j] = temp;
////				}
////			}
////		}
//		// solution 2
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1-i; j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		BubbleSort bubble = new BubbleSort();
		bubble.bubbleSort(arr);
		System.out.println();
		System.out.println("after sort:");
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}
	public void bubbleSort(int[] data) {
		for (int i = 0; i < data.length-1; i++) {
			boolean swap = false;
			for (int j = 0; j < data.length-i-1; j++) {
				if(data[j]>data[j+1]) {
					int temp = data[j];
					data[j]= data[j+1];
					data[j+1] = temp;
					swap = true;
				}
			}
			if(!swap)break; //不交换时停止排序
		}
	}
}
