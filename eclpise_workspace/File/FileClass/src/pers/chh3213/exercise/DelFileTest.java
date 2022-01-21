package pers.chh3213.exercise;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.exercise
 * @ClassName : DelFileTest.java
 * @createTime : 2022/1/21 13:40
 * @Email :
 * @Description :
 *  使用File类删除某个文件夹（例如D盘下的temp文件夹）下的所有文件和文件夹:
 * 1）	判断temp文件夹下的文件类型，如果是文件则直接删除
 * 2）	如果是文件夹则获取该文件夹下的子文件和文件夹
 * 3）	使用递归的方式删除所有temp文件夹下的文件和文件夹
 */
public class DelFileTest {
    @Test
    public void test01() throws IOException {
        deleteDirectory(new File("1.jpg"));

    }
    // 拓展2：删除指定的目录
    public  void deleteDirectory(File file) {
        // 如果file是文件，直接delete
        // 如果file是目录，先把它的下一级干掉，然后删除自己
        if (file.isDirectory()) {
            File[] all = file.listFiles();
            // 循环删除的是file的下一级
            for (File f : all) {// f代表file的每一个下级
                deleteDirectory(f);
            }
        }
        // 删除自己
        file.delete();
    }
}
