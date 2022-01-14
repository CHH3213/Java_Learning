package pers.chh3213.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.list
 * @FileName : ArrTest.java
 * @createTime : 2022/1/10 下午11:08
 * @Email :
 * @Description :
 */
public class ArrTest {
    /**
     * 区分List中remove(int index)和remove(Object obj)
     */

    @Test
    public void testListRemove() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        updateList(list);
        System.out.println(list);//
        System.out.println(list.size());//
        Collections.sort(list); //排序
        System.out.println(list);
    }

    private void updateList(List list) {
//        list.remove(2);
        list.remove(new Integer(2));
    }

}
