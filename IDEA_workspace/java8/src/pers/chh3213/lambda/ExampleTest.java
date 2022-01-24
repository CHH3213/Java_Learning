package pers.chh3213.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : java8
 * @Package : pers.chh3213.lambda
 * @ClassName : ExampleTest.java
 * @createTime : 2022/1/24 9:10
 * @Email :
 * @Description :
 */
public class ExampleTest {
    @Test
    public void test01(){
        //1.常规方法
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I love myself");
            }
        };
        r1.run();

        System.out.println("+++++++++++++++++++++++++|");

        //2.Lambda表达式的写法
        Runnable r2 = () -> System.out.println("chh loves himself?");
        r2.run();
    }
    @Test
    public void test02(){
        //1.常规方法
        Comparator<Integer> comparator = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        int compare = comparator.compare(5, 4);
        System.out.println(compare);
        System.out.println("+==============");
        //2.Lambda表达式的写法
        Comparator<Integer>comparator1 = (o1,o2)->Integer.compare(o1,o2);
        int compare1 = comparator1.compare(2, 6);
        System.out.println(compare1);
        //3.方法引用
        Comparator<Integer> com = Integer::compare;
        int compare2 = com.compare(55, 55);
        System.out.println(compare2);

    }
}
