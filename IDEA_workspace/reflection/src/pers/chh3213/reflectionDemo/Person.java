package pers.chh3213.reflectionDemo;

import org.junit.Test;

import java.time.Period;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.reflectionDemo
 * @ClassName : Person.java
 * @createTime : 2022/1/22 17:14
 * @Email :
 * @Description :
 */
public class Person {
    private String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name) {
        this.name = name;
    }
    public Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void show(){
        System.out.println("hello");
    }
    private String showNation(String nation){
        System.out.println("中国");
        return nation;
    }
//    private void showNation(){
//        System.out.println("中国");
//    }
}
