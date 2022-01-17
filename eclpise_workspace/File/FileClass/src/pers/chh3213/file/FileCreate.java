package pers.chh3213.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.file
 * @ClassName : FileCreate.java
 * @createTime : 2022/1/16 9:14
 * @Email :
 * @Description :
 */
public class FileCreate {
    public static void main(String[] args) {
        File file = new File("hello.txt");//相对于当前module
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        boolean isTrue = file.exists();
        System.out.println(isTrue);
        try{ // 如果还不存在，就创建为文件
            file.createNewFile();
        }catch ( IOException e){
            e.printStackTrace();
        }
    }
    @Test
    public void test01(){
        File dir1 = new File("D:/IOTest/dir1");
        if (!dir1.exists()) { // 如果D:/IOTest/dir1不存在，就创建为目录
            dir1.mkdir();
        }
// 创建以dir1为父目录,名为"dir2"的File对象
        File dir2 = new File(dir1, "dir2");
        if (!dir2.exists()) { // 如果还不存在，就创建为目录
            dir2.mkdirs();
        }
        File dir4 = new File(dir1, "dir3/dir4");
        if (!dir4.exists()) {
            dir4.mkdirs();
        }
// 创建以dir2为父目录,名为"test.txt"的File对象
        File file = new File(dir2, "test.txt");
        try{ // 如果还不存在，就创建为文件
            file.createNewFile();
        }catch ( IOException e){
            e.printStackTrace();
        }

    }


}
