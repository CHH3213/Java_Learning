package pers.chh3213.specfied_structure;

import org.junit.Test;
import pers.chh3213.full_constructure.Person;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.specfied_structure
 * @ClassName : MethodTest.java
 * @createTime : 2022/1/23 15:07
 * @Email :
 * @Description :
 */
public class MethodTest {
    @Test
    public void test01() throws Exception{
        Class<Person> clazz = Person.class;
        //创建运行时类的对象
        Person person = clazz.newInstance();
        //1.获取指定的某个方法
        //getDeclaredMethod():参数1 ：指明获取的方法的名称  参数2：指明获取的方法的形参列表
        Method show = clazz.getDeclaredMethod("show", String.class);
        //2.保证当前方法是可访问的
        show.setAccessible(true);
        //3.调用方法的invoke():参数1：方法的调用者  参数2：给方法形参赋值的实参
        //invoke()的返回值即为对应类中调用的方法的返回值。
        Object returnValue = show.invoke(person, "hahha");
        System.out.println(returnValue);
        System.out.println("===============");
        //调用静态方法
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        //如果调用的运行时类中的方法没有返回值，则此invoke()返回null
        //    Object returnVal = showDesc.invoke(null);
        Object returnVal = showDesc.invoke(Person.class);
        System.out.println(returnVal);

    }

}
