package pers.chh3213.vector;

import org.junit.Test;

import java.util.List;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.vector
 * @FileName : VectorTest.java
 * @createTime : 2022/1/11 上午9:45
 * @Email :
 * @Description :
 */
public class VectorTest {
    @Test
    public void test1(){
        Vector vector = new Vector();
        vector.add(123);
        vector.add(456);
        vector.add("AA");
        vector.add(456);
        System.out.println(vector);
        vector.add(1,"i love you");
        System.out.println(vector);
        vector.setElementAt('c',4);
        System.out.println(vector);
        vector.insertElementAt('b',5);
        System.out.println(vector);
        vector.removeElement(123);
        System.out.println(vector);
        for (Object v:vector
             ) {
            System.out.println(v);
        }
        List v = vector.subList(2,5);
        System.out.println(v);

        System.out.println(vector.remove(2));




    }
}
