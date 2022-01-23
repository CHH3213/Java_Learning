package pers.chh3213.exercise;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.exercise
 * @ClassName : Student.java
 * @createTime : 2022/1/23 20:17
 * @Email :
 * @Description :
 */
class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("无参构造");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }
}

public class 