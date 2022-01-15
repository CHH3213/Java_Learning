package pers.chh3213.exercise1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.exercise1
 * @FileName : Hash2ArrayTest.java
 * @createTime : 2022/1/13 上午11:33
 * @Email :
 * @Description :
 * 按要求完成如下操作
 * 1.生成10个随机数，值在100到200之间；
 * 2.将这十个数存入HashSet集合中（有可能集合的长度小于10）。
 * 3.将这个HashSet集合转换成ArrayList集合
 * 4.重新为ArrayList集合排序，按照从小到大的顺序；
 * 5.使用foreach遍历集合；
 */
public class Hash2ArrayTest {
    @Test
    public void test(){
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 10; i++) {
           int x =  (int)(Math.random()*100)+101;//1.生成10个随机数，值在100到200之间；
            hashSet.add(x);//2.将这十个数存入HashSet集合中（有可能集合的长度小于10）。
        }
        System.out.println("hashSet: "+hashSet);//3.将这个HashSet集合转换成ArrayList集合
        ArrayList arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);//4.重新为ArrayList集合排序，按照从小到大的顺序；
        for (Object i:arrayList
             ) {
            System.out.print(i+" ");//5.使用foreach遍历集合；
        }
    }
}
