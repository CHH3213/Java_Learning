package pers.chh3213.full_constructure;

import org.junit.Test;

import java.lang.annotation.Annotation;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.full_constructure
 * @ClassName : OtherTest.java
 * @createTime : 2022/1/23 12:12
 * @Email :
 * @Description :
 */
public class OtherTest {
    /**
     * 获取运行时类实现的接口
     */
    @Test
    public void test01(){
        Class<Person> clazz = Person.class;
        //获取运行时类实现的接口
        for (Class<?> anInterface : clazz.getInterfaces()) {
            System.out.println(anInterface);
        }
        System.out.println("=============");
        //获取运行时类的父类实现的接口
        for (Class<?> anInterface : clazz.getSuperclass().getInterfaces()) {
            System.out.println(anInterface);
        }
    }

    /**
     * 获取运行时类所在的包
     */
    @Test
    public void test02(){
        Class<Person> clazz = Person.class;
        Package clazzPackage = clazz.getPackage();
        System.out.println(clazzPackage);
    }
    /**
     * 获取运行时类声明的注解
     */
    @Test
    public void test03(){
        Class<Person> clazz = Person.class;
        for (Annotation annotation : clazz.getAnnotations()) {
            System.out.println(annotation);
        }

    }
}
