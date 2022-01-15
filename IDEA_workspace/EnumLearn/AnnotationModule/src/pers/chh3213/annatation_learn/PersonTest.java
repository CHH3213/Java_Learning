package pers.chh3213.annatation_learn;


import java.lang.annotation.*;
//import org.junit.Test;
/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : EnumLearn
 * @Package : pers.chh3213.annatation_learn
 * @FileName : PersonTest.java
 * @createTime : 2022/1/10 上午10:06
 * @Email :
 * @Description :
 */

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @MyTiger("zxy")
    public void walk(){
        //通过反射获取注解信息
        try {
            MyTiger anno = Person.class.getMethod("walk").getAnnotation(MyTiger.class);
            System.out.println(anno.value());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(name +" is walking");
    }

}
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyTiger{
    String value() default "tiger";
}

public class PersonTest{
    public static void main(String[] args) {
        Person person = new Person("zxy",18);
        person.walk();
    }
}