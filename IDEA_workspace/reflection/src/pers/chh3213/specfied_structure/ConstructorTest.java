package pers.chh3213.specfied_structure;

import org.junit.Test;
import pers.chh3213.full_constructure.Person;

import java.lang.reflect.Constructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.specfied_structure
 * @ClassName : ConstructorTest.java
 * @createTime : 2022/1/23 15:16
 * @Email :
 * @Description :
 */
public class ConstructorTest {
    @Test
    public void test01() throws Exception{
        Class<Person> clazz = Person.class;
        //1.获取指定的构造器
        //getDeclaredConstructor():参数：指明构造器的参数列表
        Constructor<Person> declaredConstructor = clazz.getDeclaredConstructor(String.class);
        //2.保证此构造器是可访问的
        declaredConstructor.setAccessible(true);
        //3.调用此构造器创建运行时类的对象
        Person jack = declaredConstructor.newInstance("jack");
        System.out.println(jack);


    }
}
