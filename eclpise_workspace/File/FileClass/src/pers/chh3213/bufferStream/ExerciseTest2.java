package pers.chh3213.bufferStream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.bufferStream
 * @ClassName : ExerciseTest2.java
 * @createTime : 2022/1/19 10:56
 * @Email :
 * @Description : 实现图片加密解密操作。
 */
public class ExerciseTest2 {
    /**
     * 实现图片加密操作。
     */
    @Test
    public void test01(){
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try{
            File file = new File("time.png");
            File file_secret = new File("time_jiami.png");
            fi = new FileInputStream(file);
            fo = new FileOutputStream(file_secret);
            int len;
//            while((len=fi.read())!=-1){
//                fo.write(len^5);
//            }
            byte[] buffer = new byte[20];
            while ((len = fi.read(buffer)) != -1) {
                //字节数组进行修改
                //错误的
                //            for(byte b : buffer){
                //                b = (byte) (b ^ 5);
                //            }

                //正确的
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

                fo.write(buffer, 0, len);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fi!=null){
                try{
                    fi.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fo!=null){
                try{
                    fo.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * 实现图片解密操作
     */
    @Test
    public void test02(){
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try{
            File f_secret = new File("time_jiami.png");
            File f_ = new File("time_jiemi.png");
            fo = new FileOutputStream(f_);
            fi = new FileInputStream(f_secret);
            int len;
//            while((len=fi.read())!=-1){
//                fo.write(len^(5));
//            }
            byte[] buffer = new byte[20];
            while ((len = fi.read(buffer)) != -1) {
                //字节数组进行修改
                //错误的
                //            for(byte b : buffer){
                //                b = (byte) (b ^ 5);
                //            }

                //正确的
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

                fo.write(buffer, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fi!=null){
                try {
                    fi.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fo!=null){
                try {
                    fo.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
