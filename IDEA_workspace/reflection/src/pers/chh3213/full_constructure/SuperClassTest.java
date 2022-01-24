package pers.chh3213.full_constructure;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.full_constructure
 * @ClassName : SuperClassTest.java
 * @createTime : 2022/1/23 12:06
 * @Email :
 * @Description :
 */
public class SuperClassTest {
    @Test
    public void test01(){
        Class<Person> clazz = Person.class;
        //获取运行时类的父类
        Class<? super Person> superclass = clazz.getSuperclass();
        System.out.println(superclass);
        //获取运行时类的带泛型的父类
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
        //获取运行时类的带泛型的父类的泛型
        Type genericSuperclass1 = clazz.getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType) genericSuperclass1;
        for (Type actualTypeArgument : paramType.getActualTypeArguments()) {
            System.out.println(((Class)actualTypeArgument).getName());
        }

    }
}
