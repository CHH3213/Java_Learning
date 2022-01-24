package pers.chh3213.streamAPI;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : java8
 * @Package : pers.chh3213.streamAPI
 * @ClassName : StreamAPIOrderTest.java
 * @createTime : 2022/1/24 15:20
 * @Email :
 * @Description :
 */
public class StreamAPIOrderTest {
    @Test
    public void test(){
        /*
         * 1.sorted()——自然排序
         */
        //List<Integer> list = Arrays.asList(10, 25, 13, 45, 68, 23, -5, -62, 4);
        //list.stream().sorted().forEach(System.out::println);
        //抛异常，原因:Employee没有实现Comparable接口
        //List<Employee> employees = EmployeeData.getEmployees();
        //employees.stream().sorted().forEach(System.out::println);
        /*
        2. sorted(Comparator com)——定制排序
         */
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted( (e1,e2) -> {
            //按照age排序
            int ageValue = Integer.compare(e1.getAge(),e2.getAge());
            if(ageValue != 0){
                return ageValue;
            }else{
                return -Double.compare(e1.getSalary(),e2.getSalary());
            }

        }).forEach(System.out::println);



    }
}
