package pers.chh3213.exception20220101;

public class Demo2 {
	public static void main(String[] args) {
		int test = test(3,5);
		System.out.println(test);
	}

	public static int test(int x, int y){
		int result = x;
		try{
			if(x<0 || y<0){
				return 0;
			}
			result = x + y;
			System.out.println(result);//8
			return result;
		}finally{
			result = x - y;
			System.out.println(result);//-2
			System.out.println("HAHHA");
		}
	}

}
