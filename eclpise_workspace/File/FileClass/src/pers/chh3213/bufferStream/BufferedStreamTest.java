package pers.chh3213.bufferStream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.bufferStream
 * @ClassName : BufferedStreamTest.java
 * @createTime : 2022/1/18 10:43
 * @Email :
 * @Description :
 */
import org.junit.Test;

import java.io.*;

/**
 * 处理流之一：缓冲流的使用
 *
 *  1.缓冲流：
 *  BufferedInputStream
 *  BufferedOutputStream
 *  BufferedReader
 *  BufferedWriter
 */
public class BufferedStreamTest {
    /**
     * 实现非文本文件的复制
     */
    @Test
    public void bufferedStreamTest(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.造文件
            File srcFile = new File("1.jpg");
            File destFile = new File("2.jpg");
            try{
                srcFile.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
            //2.造流
            //2.1 造节点流
            FileInputStream fis = new FileInputStream((srcFile));
            FileOutputStream fos = new FileOutputStream(destFile);
            //2.2 造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制的细节：读取、写入
            byte[] buffer = new byte[10];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
//                bos.flush();//刷新缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
            //要求：先关闭外层的流，再关闭内层的流
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            //说明：关闭外层流的同时，内层流也会自动的进行关闭。关于内层流的关闭，我们可以省略.
//        fos.close();
//        fis.close();
        }
    }

    @Test
    public void test02(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
// 创建缓冲流对象：它是处理流，是对节点流的包装
            br = new BufferedReader(new FileReader("hello1.txt"));
            bw = new BufferedWriter(new FileWriter("hello2.txt"));
            String str;
            while ((str = br.readLine()) != null) { // 一次读取字符文本文件的一行字符
                bw.write(str); // 一次写入一行字符串
                bw.newLine(); // 写入行分隔符
            }
            bw.flush(); // 刷新缓冲区
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
// 关闭IO流对象
            try {
                if (bw != null) {
                    bw.close(); // 关闭过滤流时,会自动关闭它所包装的底层节点流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

