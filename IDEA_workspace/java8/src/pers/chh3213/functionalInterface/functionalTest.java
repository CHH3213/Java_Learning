package pers.chh3213.functionalInterface;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : java8
 * @Package : pers.chh3213.functionalInterface
 * @ClassName : functionalTest.java
 * @createTime : 2022/1/24 9:41
 * @Email :
 * @Description :
 *
* java内置的4大核心函数式接口
*
* 消费型接口 Consumer<T>     void accept(T t)
* 供给型接口 Supplier<T>     T get()
* 函数型接口 Function<T,R>   R apply(T t)
*  断定型接口 Predicate<T>    boolean test(T t)
 */
public class functionalTest {
    public void happyTime(double money, Consumer<Double>consumer){
        consumer.accept(money);
    }
    @Test
    public void test01(){
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("消遣一下："+aDouble);
            }
        });
        System.out.println("==============");
        //Lambda表达式写法
        happyTime(500,aDouble -> System.out.println("消遣一下："+aDouble));
    }

    /**
     * 根据给定的规则，过滤集合中的字符串。此规则由Predicate的方法决定
     * @param list
     * @param pre
     * @return
     */
    public List<String> fileterString(List<String>list, Predicate<String>pre){
        ArrayList<String> arrayList = new ArrayList<>();
        for(String s:list){
            if(pre.test(s)){
                arrayList.add(s);
            }
        }
        return arrayList;
    }
    @Test
    public void test02(){
        List<String> list = Arrays.asList("长安","北京","南京","东京","西京");
        List<String> fileter = fileterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(fileter);
        System.out.println("==============");
        //Lambda表达式写法
        List<String> fileter2 = fileterString(list, s -> s.contains("京"));
        System.out.println(fileter2);
    }
}
