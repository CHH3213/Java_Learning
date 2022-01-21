package pers.chh3213.bufferStream;

import org.junit.Test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.bufferStream
 * @ClassName : ExerciseTest.java
 * @createTime : 2022/1/19 9:28
 * @Email :
 * @Description :
 *
 * 1. 分别使用节点流： FileInputStream、 FileOutputStream和
 * 缓冲流：BufferedInputStream、 BufferedOutputStream实现
 * 文本文件/图片/视频文件的复制。并比较二者在数据复制方面的效率
 *
 */
public class ExerciseTest {
    /**
     * 分别使用节点流： FileInputStream、 FileOutputStream
     */
    @Test
    public void test01(){
        FileInputStream file1_input = null;
        FileOutputStream file1_output = null;
        try {
            File file1 = new File("hello1.txt");
            File file1_copy = new File("hello1_cp.txt");
            file1_input = new FileInputStream(file1);
            file1_output = new FileOutputStream(file1_copy);
            //3.复制的过程
            byte[] buffer = new byte[5];
            int len;
            //4.读数据
            while((len = file1_input.read(buffer)) != -1){
//                System.out.println(len);
                file1_output.write(buffer,0,len);
            }
            System.out.println("复制成功");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(file1_input!=null ){
                try {
                    file1_input.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(file1_output!=null ) {
                try {
                    file1_output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    /**
     *  缓冲流：BufferedInputStream、 BufferedOutputStream实现
     */
    @Test
    public void test02(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try{
            File file1 = new File("hello1.txt");
            File file1_copy = new File("hello1_cpp.txt");
            FileInputStream file1_input = new FileInputStream(file1);
            FileOutputStream file1_output = new FileOutputStream(file1_copy);
            bis = new BufferedInputStream(file1_input);
            bos = new BufferedOutputStream(file1_output);
            byte[] bt = new byte[5];
            int len;
            while((len=bis.read(bt))!=-1){
//                System.out.println(len);
                bos.write(bt,0,len);
            }
            System.out.println("复制成功");

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(bis!=null){
                try{
                    bis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(bos!=null){
                try{
                    bos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
