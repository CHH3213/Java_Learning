package pers.chh3213.full_constructure;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.full_constructure
 * @ClassName : FiledTest.java
 * @createTime : 2022/1/23 11:32
 * @Email :
 * @Description :
 */
public class FiledTest {
    /**
     * //获取属性结构
     */
    @Test
    public void test01(){
        Class clazz = Person.class;

        //1.getFields():获取当前运行时类及其父类中声明为public访问权限的属性
        for (Field field : clazz.getFields()) {
            System.out.println(field);
        }
        System.out.println("***************");
        //2.getDeclaredFields():获取当前运行时类中声明的所有属性。（不包含父类中声明的属性）
        for (Field declaredField : clazz.getDeclaredFields()) {
            System.out.println(declaredField);
        }

    }
    @Test public void test02(){
        Class clazz = Person.class;
        for (Field declaredField : clazz.getDeclaredFields()) {
            //1.获得属性的权限修饰符
            int modifiers = declaredField.getModifiers();
            System.out.println(Modifier.toString(modifiers));
            System.out.println("=============");
            //2.获得属性的数据类型
            Class type = declaredField.getType();
            System.out.print(type.getName() + "\t");
            System.out.println();
            System.out.println("----------------");
            //3.获得属性的变量名
            String name = declaredField.getName();
            System.out.print(name);
        }

    }
}
