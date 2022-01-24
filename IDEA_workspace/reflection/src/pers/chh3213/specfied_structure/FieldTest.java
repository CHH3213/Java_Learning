package pers.chh3213.specfied_structure;

import org.junit.Test;
import pers.chh3213.full_constructure.MyAnnotation;
import pers.chh3213.full_constructure.Person;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.specfied_structure
 * @ClassName : FieldTest.java
 * @createTime : 2022/1/23 14:56
 * @Email :
 * @Description :
 */
public class FieldTest {
    @Test
    public void test01() throws Exception {
        Class<Person> clazz = Person.class;
        //创建运行时类的对象
        Person person = clazz.newInstance();
        //获取指定的属性：要求运行时类中属性声明为public
        //通常不采用此方法
        Field id = clazz.getField("id");
        //设置当前属性的值
        //set():参数1：指明设置哪个对象的属性   参数2：将此属性值设置为多少
        id.set(person,1000);
        //获取当前属性的值
        //get():参数1：获取哪个对象的当前属性值
        int pId = (int)id.get(person);
        System.out.println(pId);
    }
    /**
     * 如何操作运行时类中的指定的属性 -- 需要掌握
     */
    @Test
    public void test02() throws Exception{
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        //1. getDeclaredField(String fieldName):获取运行时类中指定变量名的属性
        Field name = clazz.getDeclaredField("name");
        //2.保证当前属性是可访问的
        name.setAccessible(true);
        //3.获取、设置指定对象的此属性值
        name.set(person,"Fire");
        System.out.println(name.get(person));
    }
}
