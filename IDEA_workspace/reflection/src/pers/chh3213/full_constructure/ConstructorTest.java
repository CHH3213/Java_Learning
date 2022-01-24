package pers.chh3213.full_constructure;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.full_constructure
 * @ClassName : ConstructorTest.java
 * @createTime : 2022/1/23 12:03
 * @Email :
 * @Description :
 */
public class ConstructorTest {
    @Test
    public void test01(){
        Class<Person> clazz = Person.class;
        //getConstructors():获取当前运行时类中声明为public的构造器
        for (Constructor constructor : clazz.getConstructors()) {
            System.out.println(constructor);
        }
        System.out.println("=================");
        //getDeclaredConstructors():获取当前运行时类中声明的所有的构造器
        for (Constructor declaredConstructor : clazz.getDeclaredConstructors()) {
            System.out.println(declaredConstructor);
        }

    }
}
