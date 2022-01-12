package pers.chh3213.Set.exercise;

import org.junit.Test;

import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.Set.exercise
 * @FileName : InterviewTest.java
 * @createTime : 2022/1/11 下午11:06
 * @Email :
 * @Description :其中Person类中重写了hashCode()和equal()方法
 */
public class InterviewTest {
    @Test
    public void test01(){
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");
        set.add(p1);
        set.add(p2);
//        System.out.println(p1);
        p1.name = "CC";
//        System.out.println(p1);
        set.remove(p1);
        System.out.println("first: "+set);
        set.add(new Person(1001,"CC"));
        System.out.println("second: " + set);
        set.add(new Person(1001,"AA"));
        System.out.println("last: " + set);
    }
}

class Person{
    public int id;
    public String name;

    public Person( int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
