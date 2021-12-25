package pers.chh3213.array;

public class FuncTest {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2};
		System.out.println(arr[0]+"\t"+arr[1]);
		swap(arr, 0,1);
		System.out.println(arr[0]+"\t"+arr[1]);

	}
	public static void swap(int[] arr, int index_1,int index_2 ) {
		int temp = arr[index_1];
		arr[index_1] = arr[index_2];
		arr[index_2] = temp;
	}

}
