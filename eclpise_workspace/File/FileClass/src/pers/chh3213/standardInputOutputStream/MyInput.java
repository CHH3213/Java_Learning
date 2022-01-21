package pers.chh3213.standardInputOutputStream;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.standardInputOutputStream
 * @ClassName : MyInput.java
 * @createTime : 2022/1/20 14:49
 * @Email :
 * @Description :
 */
public class MyInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("字符串:");
        scanner.next();
        System.out.println("int");
        scanner.nextInt();
        System.out.println("bool");
        scanner.nextBoolean();//false or true
    }
}
