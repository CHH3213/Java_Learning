package pers.chh3213.classLearn;

public class TransferTest2 {
	public static void main(String[] args) {
		DataSwap dataSwap = new DataSwap();
		dataSwap.a = 5;
		dataSwap.b = 10;
		System.out.println("交换前："+"a = " + dataSwap.a + ", b = " + dataSwap.b);

		swap(dataSwap);
		System.out.println("交换后："+"a = " + dataSwap.a + ", b = " + dataSwap.b);
	}
	public static void swap(DataSwap data) {
		int temp = data.a;
		data.a = data.b;
		data.b = temp;
		System.out.println("swap方法里：a = "+data.a+"; b = "+data.b);
	}
}

class DataSwap{
	public int a;
	public int b;
}