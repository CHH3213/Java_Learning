package pers.chh3213.objectStream;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.objectStream
 * @ClassName : Person.java
 * @createTime : 2022/1/20 17:09
 * @Email :
 * @Description :
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String address;
    private Pet pet;

    public Person(String name, int age, String address, Pet pet) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", pet=" + pet +
                '}';
    }
}


class Pet implements Serializable{
    private String name;
    public Pet(String name){
        this.name = name;
        System.out.println("养了一只"+ this.name);
    }
}