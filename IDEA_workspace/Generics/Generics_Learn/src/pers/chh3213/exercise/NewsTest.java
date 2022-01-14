package pers.chh3213.exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Generics
 * @Package : pers.chh3213.exercise
 * @FileName : NewsTest.java
 * @createTime : 2022/1/14 下午9:24
 * @Email :
 * @Description :
 */
public class NewsTest {
    @Test
    public void test01(){
        List<News> newsList = new ArrayList<>();
        newsList.add(new News("震惊！","chh","昨日下雨了","社会"));
        newsList.add(new News("快报","zxy","世界首例猪心脏移植成功","科学"));
        newsList.add(new News("印度一男子跳入恒河……","chh","印度一男子跳入恒河，声称能够净化新冠病毒","社会"));
        newsList.add(new News("印度一男子跳入恒河竟然是为了……","chh","印度一男子跳入恒河自尽了","社会"));
        Iterator iterator = newsList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
