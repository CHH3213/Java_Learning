package pers.chh3213.array;

public class MultiArraySwap {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		System.out.println("before swap");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]= (int)(Math.random()*30);
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i==0)swap(arr, i,  i+3, j);
				if(i==1)swap(arr, i, i+1, j);
			}
		}
		System.out.println();
		System.out.println("after swap:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();

		}
	}
	public static void swap(int[][] arr, int i,int j,int index ) {
		int temp = arr[i][index];
		arr[i][index]= arr[j][index];
		arr[j][index]= temp;
	}
}
