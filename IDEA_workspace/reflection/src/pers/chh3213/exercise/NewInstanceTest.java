package pers.chh3213.exercise;

import java.lang.reflect.Constructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.exercise
 * @ClassName : NewInstanceTest.java
 * @createTime : 2022/1/23 20:17
 * @Email :
 * @Description :
 */
class Student1 {
    private String name;
    private int age;

    public Student1() {
        System.out.println("无参构造");
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }
}

public class NewInstanceTest{
    public static void main(String[] args) throws Exception{
        Class<Student1> clazz = Student1.class;
        Constructor<Student1> declaredConstructor1 = clazz.getDeclaredConstructor();
        //2.无参构造
        declaredConstructor1.setAccessible(true);
        Student1 jack = declaredConstructor1.newInstance();
        //有参构造
        Constructor<Student1> declaredConstructor2 = clazz.getDeclaredConstructor(String.class,int.class);
        declaredConstructor2.setAccessible(true);
        Student1 tom = declaredConstructor2.newInstance("tom",21);

    }
}