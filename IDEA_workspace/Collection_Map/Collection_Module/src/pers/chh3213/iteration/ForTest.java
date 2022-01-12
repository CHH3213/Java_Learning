package pers.chh3213.iteration;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.iteration
 * @FileName : ForTest.java
 * @createTime : 2022/1/10 下午10:33
 * @Email :
 * @Description :
 */
public class ForTest {
    public static void main(String[] args) {
        String[] str = new String[5];
        for (String myStr : str) {
            myStr = "atguigu";
            System.out.print(myStr+" ");
        }
        System.out.println();
        System.out.println("foreach");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
        for (int i = 0; i < str.length; i++) {
            str[i] = "1";
        }
        System.out.println();
        System.out.println("fori");
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
}