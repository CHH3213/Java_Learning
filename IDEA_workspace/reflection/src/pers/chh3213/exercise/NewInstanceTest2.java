package pers.chh3213.exercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.exercise
 * @ClassName : NewInstanceTest2.java
 * @createTime : 2022/1/23 20:42
 * @Email :
 * @Description :
 */
class Mytxt{
    public void myCreate() throws IOException {
        File file = new File("hello.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("hello!!!!!!!");
        fileWriter.close();
    }

}

public class NewInstanceTest2 {
    public static void main(String[] args) throws Exception{
        Class<Mytxt> clazz = Mytxt.class;
        Mytxt mytxt = clazz.newInstance();
        Method myCreate = clazz.getDeclaredMethod("myCreate");
        myCreate.setAccessible(true);
        Object invoke = myCreate.invoke(mytxt);

    }
}
