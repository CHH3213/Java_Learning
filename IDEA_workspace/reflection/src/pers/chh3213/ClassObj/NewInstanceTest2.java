package pers.chh3213.ClassObj;

import org.junit.Test;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.ClassObj
 * @ClassName : NewInstanceTest2.java
 * @createTime : 2022/1/23 10:09
 * @Email :
 * @Description :
 */
public class NewInstanceTest2 {
    @Test
    public void test2(){
        for (int i = 0; i < 100; i++) {
            int num = new Random().nextInt(3);
            String classpath = "";
            switch (num){
                case 0:
                    classpath = "java.util.Date";
                    break;
                case 1:
                    classpath = "java.lang.Object";
                    break;
                case 2:
                    classpath = "pers.chh3213.reflectionDemo.Person";
                    break;
            }
            try {
                Object obj = getInstance(classpath);
                System.out.println(obj);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    /**
     * 创建一个指定类的对象。
     * classPath:指定类的全类名
     *
     * @param classPath
     * @return
     * @throws Exception
     */
    public Object getInstance(String classPath) throws Exception {
        Class clazz =  Class.forName(classPath);
        return clazz.newInstance();
    }
}
