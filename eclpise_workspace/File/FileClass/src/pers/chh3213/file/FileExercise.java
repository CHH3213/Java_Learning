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
 * @ClassName : FileExercise.java
 * @createTime : 2022/1/16 21:30
 * @Email :
 * @Description :
 */
public class FileExercise {

    /**
     * 1. 利用File构造器， new 一个文件目录file
     * 1)在其中创建多个文件和目录
     * 2)编写方法，实现删除file中指定文件的操作
     */
    @Test
    public void test01() {
        File dir = new File("src/pers/chh3213/file/test01");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File file1 = new File(dir, "01.txt");
        File file2 = new File(dir, "02.jpg");
        try {
            file1.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File dir2 = new File(dir, "/dir");
        if (!dir2.exists()) {
            dir2.mkdirs();
        }
//        delFile(file1);


    }

    public void delFile(File file) {
        file.delete();
    }

    @Test
    public void test02() {
        /**
         *  判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
         */
        File dir = new File("src/pers/chh3213/file/test01");

        isExist(dir);

    }

    public void isExist(File dir) {
        String[] files = dir.list();
        for (String file : files
        ) {
            if (file.endsWith(".jpg")) {
                System.out.println(file);
            }
        }

    }

}