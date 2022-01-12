package pers.chh3213.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.collections
 * @FileName : CollectionsTest.java
 * @createTime : 2022/1/12 下午11:17
 * @Email :
 * @Description :Collections常用方法测试
 */
public class CollectionsTest {
    @Test
    public void test01(){
        List list = new ArrayList();
        list.add(12);
        list.add(102);
        list.add(112);
        list.add(122);
        list.add(142);
        list.add(127);
        System.out.println("原数据： "+ list);
        Collections.reverse(list);//converse
        System.out.println("反转： "+list);
        Collections.sort(list);
        System.out.println("排序： "+ list);
        Collections.swap(list,0,5);
        System.out.println("交换："+list);
        // 报异常：IndexOutOfBoundsException("Source does not fit in dest")
//        List dest = new ArrayList();
//        Collections.copy(dest,list);
        // 正确的：
        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());//list.size();
        Collections.copy(dest,list);

        System.out.println("复制： "+ dest);

    }

}
