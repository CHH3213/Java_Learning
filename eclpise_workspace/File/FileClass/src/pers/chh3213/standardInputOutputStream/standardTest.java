package pers.chh3213.standardInputOutputStream;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.standardInputOutputStream
 * @ClassName : standardTest.java
 * @createTime : 2022/1/20 14:29
 * @Email :
 * @Description :
 *     从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，
 *     直至当输入“e”或者“exit”时，退出程序。
 */
public class standardTest {
    /**
     *  方法一：使用Scanner实现，调用next()返回一个字符串
     *  方法二：使用System.in实现。System.in  --->  转换流 ---> BufferedReader的readLine()
     */
    public static void main(String[] args) {
        System.out.println("请输入信息(退出输入e或exit):");
        // 把"标准"输入流(键盘输入)这个字节流包装成字符流,再包装成缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            while ((s = br.readLine()) != null) { // 读取用户输入的一行数据 --> 阻塞程序
                if ("e".equalsIgnoreCase(s) || "exit".equalsIgnoreCase(s)) {
                    System.out.println("安全退出!!");
                    break;
                }
                // 将读取到的整行字符串转成大写输出
                System.out.println("-->:" + s.toUpperCase());
                System.out.println("继续输入信息");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close(); // 关闭过滤流时,会自动关闭它包装的底层节点流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
