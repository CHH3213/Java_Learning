package pers.chh3213.exercise;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;
/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.exercise
 * @ClassName : RandomAccessTest.java
 * @createTime : 2022/1/21 15:23
 * @Email :
 * @Description :使用RandomAccessFile流将一个文本文件倒置读出
 */
public class RandomAccessTest {
    public static void main(String args[]){
        File f=new File("hello1.txt");
        try{
            RandomAccessFile random=new RandomAccessFile(f,"rw");    //以随机读取方式打开文件
            random.seek(0);
            long m=random.length();               //m = 文件长度
            while (m >= 0){
                m--;                                      //每次循环m都减1,等于从后往前
                random.seek(m);                    //定位到文件中第m个字符
                int c=random.readByte();        //c被赋值为文件中第m个字符
                if(c<=255&&c>=0)  {
                    System.out.print((char)c);       //如果asc码<=255,>=0,则判断是个英文字符,直接打印.
                }
                else {                                   //如果不在asc码范围内,则判断是个汉字字符
                    m--;                                   //汉字字符是占2个字节的,所以m再退一个字节(m=m-1)

                    random.seek(m);
                    byte cc[]=new byte[2];
                    random.readFully(cc);               //cc被复制为文件中连续的两个字节
                    System.out.print(new String(cc)); //把cc转换为字符串,打印(这里会打印出汉字)
                }
            }
        }catch(IOException e){}
    }

}
