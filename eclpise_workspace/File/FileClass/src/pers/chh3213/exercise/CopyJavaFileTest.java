package pers.chh3213.exercise;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.exercise
 * @ClassName : CopyJavaFileTest.java
 * @createTime : 2022/1/21 13:54
 * @Email :
 * @Description :
 */
public class CopyJavaFileTest {
    @Test
    public void test(){
        File dir = new File("E:\\CHH3213_KING\\研究生\\导师\\就业规划\\Java_Learning\\eclpise_workspace\\File\\FileClass\\src\\pers\\chh3213\\exercise\\mytemp");
        //创建文件夹
        if(!dir.exists()){
            dir.mkdirs();
        }
        //显示所有。java文件
        File display_dir = new File("E:\\CHH3213_KING\\研究生\\导师\\就业规划\\Java_Learning\\eclpise_workspace\\File\\FileClass\\src\\pers\\chh3213\\file");
        Set name_set = displayJava(display_dir);
        //将显示的java文件全部复制到mytemp文件夹中
        Iterator iterator = name_set.iterator();
        while (iterator.hasNext()){
            String name = (String)iterator.next();
//            System.out.println(name);
            File f = new File(name);
            copyFile(f);
        }
    }
    public void copyFile(File file) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
             fis = new FileInputStream(file);
             File out_file = new File("E:\\CHH3213_KING\\研究生\\导师\\就业规划\\Java_Learning\\eclpise_workspace\\File\\FileClass\\src\\pers\\chh3213\\exercise\\mytemp\\" + file.getName());
             fos = new FileOutputStream(out_file);
            int len;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public Set displayJava(File dir){
        File[] files = dir.listFiles();
        Set<String> set = new HashSet<String>();
        for (File file:files
             ) {
            if (file.isDirectory()){
                displayJava(file);
            }
            else{
                String name = file.getName();
                if(name.endsWith(".java")){
                    //将显示的文件绝对路径名保存下来
                    String path = file.getAbsolutePath();
                    set.add(path);
                    System.out.println(name);
                }
            }
        }
        return set;
    }
}
