package pers.chh3213.exercise;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Generics
 * @Package : pers.chh3213.exercise
 * @FileName : AppleTest.java
 * @createTime : 2022/1/14 下午9:08
 * @Email :
 * @Description :
 */
public class AppleTest {
    @Test
    public void test01(){
        Apple<String> a1 = new Apple<>("500克");
        Apple<Integer> a2 = new Apple<>(500);
        Apple<Double> a3 = new Apple<>(500.0);
        System.out.println("a1: "+a1.getWeight());
        System.out.println("a2: "+a2.getWeight());
        System.out.println("a3: "+a3.getWeight());
    }
}
