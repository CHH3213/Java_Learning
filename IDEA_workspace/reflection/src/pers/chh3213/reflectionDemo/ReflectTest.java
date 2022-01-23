package pers.chh3213.reflectionDemo;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.reflectionDemo
 * @ClassName : ReflectTest.java
 * @createTime : 2022/1/22 20:02
 * @Email :
 * @Description :
 */
public class ReflectTest {
    /**
     * 不使用反射的情况
     */
    @Test
    public void test(){
        Person person = new Person("jack",20);
        person.age=15;
        System.out.println(person.toString());
        person.show();
        //在Person类的外部，不可以通过Person类的对象调用其内部私有的结构。
        //比如：name、showNation以及私有的构造器。
    }

    /**
     * 使用反射的情况
     */
    @Test
    public void test02() throws Exception {
        //1.通过反射，创建Person类的对象
        Class clazz = Person.class;
        Constructor cons = clazz.getConstructor(String.class,int.class);
        Object obj = cons.newInstance("john",21);
        Person person = (Person) obj;
        System.out.println(person.toString());
        //2.通过反射，调用对象指定的属性和方法
        //调用属性
        Field age = clazz.getDeclaredField("age");
        age.set(person,11);
        System.out.println(person.toString());
        //调用方法
        Method show = clazz.getDeclaredMethod("show");
        show.invoke(person);
        System.out.println("============");
        //通过反射，是可以调用Person类的私有结构的。比如：私有的构造器、方法、属性
        //调用私有的构造器
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Person p = (Person) constructor.newInstance("kk");
        System.out.println(p);
        //调用私有的属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p,"zz");
        System.out.println(p);

        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation",String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p,"china");
//        相当于String nation = p1.showNation("FaceBook")
        System.out.println(nation);

    }

}
