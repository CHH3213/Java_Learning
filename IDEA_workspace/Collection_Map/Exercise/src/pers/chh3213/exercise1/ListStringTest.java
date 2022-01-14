package pers.chh3213.exercise1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.exercise1
 * @FileName : ListStringTest.java
 * @createTime : 2022/1/13 上午11:27
 * @Email :
 * @Description :
 */
public class ListStringTest {
    @Test
    public void test(){
        List list = new ArrayList();
        list.add("123");
        list.add("abc");
        list.add("abf");
        list.add("hgfabf");
        System.out.println("原数据： "+ list);
        Collections.reverse(list);
        System.out.println("反转后： "+ list);
        Collections.sort(list);
        System.out.println("排序："+list);
    }
}
