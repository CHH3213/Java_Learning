package pers.chh3213.transformStream;

import org.junit.Test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.transformStream
 * @ClassName : InputStreamReaderTest.java
 * @createTime : 2022/1/20 13:36
 * @Email :
 * @Description :
 */

public class InputStreamReaderTest {

    /**
     * 此时处理异常的话，仍然应该使用try-catch-finally
     * InputStreamReader的使用，实现字节的输入流到字符的输入流的转换
     */
    @Test
    public void test() throws IOException {

        FileInputStream fis = new FileInputStream("hello2.txt");
//        InputStreamReader isr = new InputStreamReader(fis);//使用系统默认的字符集
        //参数2指明了字符集，具体使用哪个字符集，取决于文件保存时使用的字符集
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");//使用系统默认的字符集

        char[] cbuf = new char[20];
        int len;
        while((len = isr.read(cbuf)) != -1){
            String str = new String(cbuf,0,len);
            System.out.print(str);
        }

        isr.close();
    }
    @Test
    public void testMyInput() throws Exception {
        FileInputStream fis = new FileInputStream("hello2.txt");
        FileOutputStream fos = new FileOutputStream("dbcp5.txt");
        InputStreamReader isr = new InputStreamReader(fis, "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);
        String str = null;
        while ((str = br.readLine()) != null) {
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}

