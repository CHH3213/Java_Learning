package pers.chh3213.streamAPI;

import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : java8
 * @Package : pers.chh3213.streamAPI
 * @ClassName : StreamAPITest2.java
 * @createTime : 2022/1/24 15:09
 * @Email :
 * @Description :
 */
public class StreamAPITest2 {
    @Test
    public void test01(){
        List<Employee> list = EmployeeData.getEmployees();
//        filter(Predicate p)——接收 Lambda ， 从流中排除某些元素。
        Stream<Employee> stream = list.stream();
        //练习：查询员工表中薪资大于7000的员工信息
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);

        System.out.println("");
//        limit(n)——截断流，使其元素不超过给定数量。
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("");

//        skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
        list.stream().skip(3).forEach(System.out::println);

        System.out.println("");
//        distinct()——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素

        list.add(new Employee(1013,"chh",20,85000));
        list.add(new Employee(1013,"chh",20,85000));
        list.add(new Employee(1013,"chh",20,85000));
        list.add(new Employee(1013,"chh",20,85000));
        list.add(new Employee(1013,"chh",20,85000));

//        System.out.println(list);

        list.stream().distinct().forEach(System.out::println);
    }
}
