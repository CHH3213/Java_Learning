public class MultiArrayTest {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 3, 8, 2 }, { 2, 7 }, { 9, 0, 1, 6 } };
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.println(is2);
            }
        }

        int[][] arr2 = new int[3][];
        arr2[0] = new int[]{10,2,3};
        arr2[1] = new int[2];
        System.out.println(arr2[0][0]);

    }
}
