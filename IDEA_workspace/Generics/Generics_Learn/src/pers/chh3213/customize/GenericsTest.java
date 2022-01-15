package pers.chh3213.customize;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Generics
 * @Package : pers.chh3213.customize
 * @FileName : GenericsTest.java
 * @createTime : 2022/1/14 下午4:25
 * @Email :
 * @Description :
 */
public class GenericsTest {
//    public void printCollection(Collection c) {
//        Iterator i = c.iterator();
//        for (int k = 0; k < c.size(); k++) {
//            System.out.println(i.next());
//        }
//    }

    public void printCollection(Collection<Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
    @Test
    public void test01(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add(3);
        printCollection(arrayList);
    }
}
