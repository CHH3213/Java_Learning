package pers.chh3213.Set.exercise;


import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.Set.exercise
 * @FileName : TreeSetOrderTest.java
 * @createTime : 2022/1/11 下午11:39
 * @Email :
 * @Description :
 */
public class TreeSetOrderTest {
    /**
     * 使 Employee 实现 Comparable 接口，并按 name 排序
     */
    @Test
    public void test01() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("b", 25, new MyDate(1997, 5, 20));
        employees[1] = new Employee("f", 21, new MyDate(1989, 1, 10));
        employees[2] = new Employee("c", 22, new MyDate(1999, 2, 28));
        employees[3] = new Employee("g", 18, new MyDate(2000, 4, 26));
        employees[4] = new Employee("e", 16, new MyDate(1995, 8, 25));
        Set set = new TreeSet();
        set.add(employees[0]);
        set.add(employees[1]);
        set.add(employees[2]);
        set.add(employees[3]);
        set.add(employees[4]);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /**
     * 创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序。
     */
    @Test
    public  void test02() {

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;
                    if(Integer.compare(e1.getBirthday().getYear(),e2.getBirthday().getYear())!=0){
                        return Integer.compare(e1.getBirthday().getYear(),e2.getBirthday().getYear());
                    }else if(Integer.compare(e1.getBirthday().getMonth(),e2.getBirthday().getMonth())!=0){
                        return Integer.compare(e1.getBirthday().getMonth(),e2.getBirthday().getMonth());
                    }
                    else{
                        return Integer.compare(e1.getBirthday().getDay(),e2.getBirthday().getDay());
                    }
                }
                throw new RuntimeException("传入的数据类型不一致！");
            }
        };
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("b", 25, new MyDate(1997, 5, 20));
        employees[1] = new Employee("f", 21, new MyDate(1999, 1, 10));
        employees[2] = new Employee("c", 22, new MyDate(1997, 2, 28));
        employees[3] = new Employee("g", 18, new MyDate(2000, 4, 26));
        employees[4] = new Employee("e", 16, new MyDate(1995, 8, 25));
        Set set = new TreeSet(comparator);
        set.add(employees[0]);
        set.add(employees[1]);
        set.add(employees[2]);
        set.add(employees[3]);
        set.add(employees[4]);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
