package pers.chh3213.exercise;

import org.junit.Test;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.exercise
 * @ClassName : FileTest.java
 * @createTime : 2022/1/23 21:33
 * @Email :
 * @Description :
 * 6. 利用反射和File完成以下功能
 * 	1.	利用Class类的forName方法得到File类
 * 	2.	在控制台打印File类的所有构造器
 * 	3.	通过newInstance的方法创建File对象，并创建D：\mynew.txt文件
 */
public class FileTest {
    @Test
    public void test() throws Exception{
        //利用Class类的forName方法得到File类
        Class FileAll = Class.forName("java.io.File");
        for (Constructor declaredConstructor : FileAll.getDeclaredConstructors()) {
            //在控制台打印File类的所有构造器
            System.out.println(declaredConstructor);
        }
        //通过newInstance的方法创建File对象，并创建D：\mynew.txt文件
        //1.获取File的一个构造器
        Constructor declaredConstructor = FileAll.getDeclaredConstructor(String.class);
        //2.用上面得到构造器创建File对象
        Object file = declaredConstructor.newInstance("mynew.txt");
        //3.获取File的createNewFile方法
        Method createNewFile = FileAll.getDeclaredMethod("createNewFile");
        createNewFile.setAccessible(true);
        Object invoke = createNewFile.invoke(file);




    }
}
