package pers.chh3213.iteration;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.iteration
 * @FileName : IteratorTest.java
 * @createTime : 2022/1/10 下午10:03
 * @Email :
 * @Description :
 *  集合元素的遍历操作，使用迭代器Iterator接口
 *  内部的方法：hasNext()和 next()
 */

public class IteratorTest {

    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator = coll.iterator();

        //方式一：
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        //报异常：NoSuchElementException
//        //因为：在调用it.next()方法之前必须要调用it.hasNext()进行检测。若不调用，且下一条记录无效，直接调用it.next()会抛出NoSuchElementException异常。
//        System.out.println(iterator.next());

//        方式二：不推荐
//        for(int i = 0;i < coll.size();i++){
//            System.out.println(iterator.next());
//        }

//        //方式三：推荐
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);

        //错误方式一：
//        Iterator iterator = coll.iterator();
//        while(iterator.next() != null){
//            System.out.println(iterator.next());
//        }

        //错误方式二：
        //集合对象每次调用iterator()方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前。
//        while(coll.iterator().hasNext()){
//            System.out.println(coll.iterator().next());
//        }
    }

    @Test
    public void removeTest(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iter = coll.iterator();//回到起点
        while(iter.hasNext()){
            Object obj = iter.next();
            if(obj.equals("Tom")){
                iter.remove();
            }
        }
         iter = coll.iterator();//回到起点
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
