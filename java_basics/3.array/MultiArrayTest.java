import java.util.Scanner;
public class MultiArrayTest {
    // public static Scanner  scanner = new Scanner();
    public static void main(String[] args) {
        // int[][] arr = new int[][] { { 3, 8, 2 }, { 2, 7 }, { 9, 0, 1, 6 } };
        // for (int[] is : arr) {
        //     for (int is2 : is) {
        //         System.out.println(is2);
        //     }
        // }

        // int[][] arr2 = new int[3][];
        // arr2[0] = new int[]{10,2,3};
        // arr2[1] = new int[2];
        // System.out.println(arr2[0][0]);
        // yangHuiTriangle();
        // testArray();
        boolean[] b = { true, false,true };
        arrayTest();

    }
    
    /*
     * ����ʾ��
     * 1. ��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
     * 2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
     * 3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ�ء�
     * ����yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
     */
    public static void yangHuiTriangle(){
        int[][] yang_hui = new int[10][10];
        yang_hui[0][0] = 1;
        yang_hui[1][0] = 1;
        yang_hui[1][1] = 1;
        System.out.println(yang_hui[0][0] + "\t");
        System.out.println(yang_hui[1][0] + "\t"+ yang_hui[1][1]);
        for(int i = 2;i<10;i++){
            for(int j =0;j<=i;j++){
                if(j==0 || j==i)yang_hui[i][j]=1;
                // else if(j==i)yang_hui[i][j]=1;
                else{
                    yang_hui[i][j] = yang_hui[i-1][j-1]+yang_hui[i-1][j];
                }
                System.out.print(yang_hui[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public static void testArray(){
        /*
         * ����һ������Ϊ6��int�����飬Ҫ������Ԫ�ص�ֵ����1-30֮�䣬
         * ���������ֵ��ͬʱ��Ҫ��Ԫ�ص�ֵ������ͬ
         */
        int [] arr = new int[6];
        for(int i =0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*30)+1;
            for(int j = 0;j<i;j++){
                while(arr[i]==arr[j]){
                    arr[i]= (int)(Math.random() * 30) + 1;
                }
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void arrayTest(){
        int[] arr1;
        int[] arr2;
        arr1 = new int[]{2,3,5,7,11,13,17,19};  
        //copy
        arr2 = new int[arr1.length];// copy
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i]; // copy
        }
        //print
        System.out.println();
        System.out.println("print copied arr2");
        for (int i : arr2) {
            System.out.print(i+"\t");
        }

        //convert
        //solution1
        for (int i = 0; i < arr1.length; i++) {
            arr2[arr1.length-i-1]=arr1[i];
        }
        arr1 = arr2;
        //solution2��
		// for(int i = 0;i < arr1.length / 2;i++){
		// 	int temp = arr1[i];
		// 	arr1[i] = arr1[arr1.length - i - 1];
		// 	arr1[arr1.length - i - 1] = temp;
		// }
		
		//solution3��
		// for(int i = 0,j = arr1.length - 1;i < j;i++,j--){
		// 	int temp = arr1[i];
		// 	arr1[i] = arr1[j];
		// 	arr1[j] = temp;
		// }

        // print
        System.out.println();
        System.out.println("print converted arr2");
        for (int i : arr1) {
            System.out.print(i + "\t");
        }

        //find:er_fen_cha_zhao
        int choose_number = 1;
        int start = 0;
        int end = arr1.length-1;
        boolean is_find = false;
        while(start<end){
            int middle = (int)(start+end)/2;
            if(arr1[middle]==choose_number){
                System.out.println("find! the index is: "+middle);
                is_find = true;
                break;
            }
            else if(arr1[middle]>choose_number){
                end = end-1;
            }
            else{
                start = start+1;
            }
        }
        if(!is_find){
            System.out.println();
            System.out.println("not find.");
        }


    }
}


