package pers.chh3213.customize;



/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.Set.exercise
 * @FileName : Employee.java
 * @createTime : 2022/1/11 下午11:34
 * @Email :
 * @Description :
 */
public class Employee implements Comparable{
    private String name;
    private  int age;
    private MyDate birthday;

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee) {
            Employee user = (Employee) o;
            int compare = this.name.compareTo(user.name);  //按照姓名从大到小排列
                return compare;
        } else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (!name.equals(employee.name)) return false;
        return birthday != null ? birthday.equals(employee.birthday) : employee.birthday == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }
}
