package pers.chh3213.full_constructure;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.full_constructure
 * @ClassName : MethodTest.java
 * @createTime : 2022/1/23 11:42
 * @Email :
 * @Description :
 */
public class MethodTest {
    @Test
    public void test01(){
        Class<Person> personClass = Person.class;
        //getMethods():获取当前运行时类及其所有父类中声明为public权限的方法
        for (Method method : personClass.getMethods()) {
            System.out.println(method+"\t");
        }
        System.out.println();
        System.out.println("==============");
        //getDeclaredMethods():获取当前运行时类中声明的所有方法。（不包含父类中声明的方法）
        for (Field declaredField : personClass.getDeclaredFields()) {
            System.out.println(declaredField+"\t");

        }
        System.out.println();


    }
}
