package pers.chh3213.IOstream;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.IOstream
 * @ClassName : WriteTest.java
 * @createTime : 2022/1/17 10:56
 * @Email :
 * @Description :
 */
public class WriteTest {
    /**
     * 从内存中写出数据到硬盘的文件里。
     *
     * 说明：
     * 1.输出操作，对应的File可以不存在的。并不会报异常
     * 2.
     *   File对应的硬盘中的文件如果不存在，在输出的过程中，会自动创建此文件。
     *   File对应的硬盘中的文件如果存在：
     *       如果流使用的构造器是：FileWriter(file,false) / FileWriter(file):对原有文件的覆盖
     *       如果流使用的构造器是：FileWriter(file,true):不会对原有文件覆盖，而是在原有文件基础上追加内容
     */
    @Test
    public void test01(){
        FileWriter fw = null;
        try {
            //1.提供File类的对象，指明写出到的文件
            File file = new File("hello1.txt");

            //2.提供FileWriter的对象，用于数据的写出
            fw = new FileWriter(file,false);

            //3.写出的操作
            fw.write("I have a dream!\n");
            fw.write("you need to have a dream!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流资源的关闭
            if(fw != null){

                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
