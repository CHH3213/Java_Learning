package pers.chh3213.MethodRef;

import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : java8
 * @Package : pers.chh3213.MethodRef
 * @ClassName : ConstructorRefTest.java
 * @createTime : 2022/1/24 10:50
 * @Email :
 * @Description :
 */
public class ConstructorRefTest {
    //构造器引用
    //Supplier中的T get()
    //Employee的空参构造器：Employee()
    @Test
    public void test01() {
        Supplier<Employee> sup = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        System.out.println("============");

        Supplier<Employee> sup1 = () -> new Employee();
        System.out.println(sup1.get());

        System.out.println("==================");

        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());
    }
    //Function中的R apply(T t)
    @Test
    public void test02() {
        Function<Integer, Employee> f1 = id -> new Employee(id);
        Employee employee = f1.apply(1001);
        System.out.println(employee);

        System.out.println("====================");

        Function<Integer, Employee> f2 = Employee::new;
        Employee employee1 = f2.apply(1001);
        System.out.println(employee1);
    }
    //BiFunction中的R apply(T t,U u)
    @Test
    public void test03() {
        BiFunction<Integer, String, Employee> f1 = (id, name) -> new Employee(id, name);
        System.out.println(f1.apply(1001, "jack"));

        System.out.println("==============");

        BiFunction<Integer, String, Employee> f2 = Employee::new;
        System.out.println(f2.apply(1002, "rose"));
    }
    //数组引用
    //Function中的R apply(T t)
    @Test
    public void test04() {
        Function<Integer, String[]> f1 = length -> new String[length];
        String[] arr1 = f1.apply(10);
        System.out.println(Arrays.toString(arr1));

        System.out.println("================");

        Function<Integer, String[]> f2 = String[]::new;
        String[] arr2 = f2.apply(10);
        System.out.println(Arrays.toString(arr2));
    }
}
