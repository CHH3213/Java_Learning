package pers.chh3213.full_constructure;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.full_constructure
 * @ClassName : Person.java
 * @createTime : 2022/1/23 11:16
 * @Email :
 * @Description :
 */
@MyAnnotation(value = "person")
public class Person extends Creature<String> implements Comparable<String>,MyInterface{
    private String name;
    int age;
    public int id;

    public Person() {
    }
    @MyAnnotation(value="name")
    public Person(String name) {
        this.name = name;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @MyAnnotation
    private String show(String nation){
        System.out.println("国籍："+nation);
        return nation;
    }

    @Override
    public void info() {
        System.out.println("I love China");

    }
    public String display(String play){
        return play;
    }
    private static void showDesc(){
        System.out.println("hahahhadsa");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

}
