package pers.chh3213.MethodRef;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : java8
 * @Package : pers.chh3213.MethodRef
 * @ClassName : MethodRefTest.java
 * @createTime : 2022/1/24 10:17
 * @Email :
 * @Description :
 */
public class MethodRefTest {
    // 情况一：对象 :: 实例方法
    //Consumer中的void accept(T t)
    //PrintStream中的void println(T t)
    @Test
    public void test01(){
        Consumer<String> c1 = str -> System.out.println(str);
        c1.accept("hhhd");

        System.out.println("===============");
        PrintStream ps = System.out;
        Consumer<String> c2 = ps::println;
        c2.accept("dsf");
    }
    //Supplier中的T get()
    //Employee中的String getName()
    @Test
    public void test2() {
        Employee emp = new Employee(01, "Jack", 19, 110000);

        Supplier<String> sk1 = () -> emp.getName();
        System.out.println(sk1.get());

        System.out.println("=--========");
        Supplier<String> sk2 = emp::getName;
        System.out.println(sk2.get());
    }
    // 情况二：类 :: 静态方法
    //Comparator中的int compare(T t1,T t2)
    //Integer中的int compare(T t1,T t2)
    @Test
    public void test3() {
        Comparator<Integer> com1 = (t1, t2) -> Integer.compare(t1,t2);
        System.out.println(com1.compare(12,21));

        System.out.println("========");

        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(12,3));
    }
    //Function中的R apply(T t)
    //Math中的Long round(Double d)
    @Test
    public void test4() {
        Function<Double,Long> func = new Function<Double, Long>() {
            @Override
            public Long apply(Double d) {
                return Math.round(d);
            }
        };

        System.out.println("----------");

        Function<Double,Long> func1 = d -> Math.round(d);
        System.out.println(func1.apply(13.3));

        System.out.println("------------");

        Function<Double,Long> func2 = Math::round;
        System.out.println(func2.apply(18.88));
    }
    // 情况三：类 :: 实例方法  (有难度)
    // Comparator中的int comapre(T t1,T t2)
    // String中的int t1.compareTo(t2)
    @Test
    public void test5() {
        Comparator<String> com1 = (s1,s2) -> s1.compareTo(s2);
        System.out.println(com1.compare("abc","abd"));

        System.out.println("===============");

        Comparator<String> com2 = String :: compareTo;
        System.out.println(com2.compare("abc","asd"));
    }

    //BiPredicate中的boolean test(T t1, T t2);
    //String中的boolean t1.equals(t2)
    @Test
    public void test6() {
        BiPredicate<String,String> pre1 = (s1, s2) -> s1.equals(s2);
        System.out.println(pre1.test("asd","asd"));

        System.out.println("=================");

        BiPredicate<String,String> pre2 = String :: equals;
        System.out.println(pre2.test("asd","asd"));
    }

    // Function中的R apply(T t)
    // Employee中的String getName();
    @Test
    public void test7() {
        Employee employee = new Employee(01, "Rose", 21, 11111);

        Function<Employee,String> func1 = e -> e.getName();
        System.out.println(func1.apply(employee));

        System.out.println("==================");

        Function<Employee,String> f2 = Employee::getName;
        System.out.println(f2.apply(employee));
    }



}
