package pers.chh3213.map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.Set
 * @FileName : TreeMapTest.java
 * @createTime : 2022/1/11 下午10:36
 * @Email :
 * @Description :
 */
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * 1.向TreeSet中添加的数据，要求是相同类的对象。
 * 2.两种排序方式：自然排序（实现Comparable接口） 和 定制排序（Comparator）
 * 3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回0.不再是equals().
 * 4.定制排序中，比较两个对象是否相同的标准为：compare()返回0.不再是equals().
 */
public class TreeMapTest {

    @Test
    public void test() {
        TreeMap map = new TreeMap();

        // 自然排序
        map.put(new User("Tom",12),10);
        map.put(new User("Jerry",32),11);
        map.put(new User("Jim",2),12);
        map.put(new User("Mike",65),14);
        map.put(new User("Jack",33),8);
        map.put(new User("Jack",56),5);

        Set entry = map.entrySet();
        Iterator iterator = entry.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            Map.Entry entry1 = (Map.Entry) o;
            System.out.println(((Map.Entry<?, ?>) o).getKey()+"-->"+((Map.Entry<?, ?>) o).getValue());
        }
    }
    @Test
    public void tets2(){
        //定制排序
        Comparator com = new Comparator() {
            //按照年龄从小到大排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }else{
                    throw new RuntimeException("输入的数据类型不匹配");
                }
            }
        };

        TreeMap map = new TreeMap(com);
        map.put(new User("Tom",12),10);
        map.put(new User("Jerry",32),11);
        map.put(new User("Jim",2),12);
        map.put(new User("Mike",65),14);
        map.put(new User("Jack",33),8);
        map.put(new User("Jack",56),5);


        Set entry = map.entrySet();
        Iterator iterator = entry.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
            Map.Entry entry1 = (Map.Entry) o;
            System.out.println(((Map.Entry<?, ?>) o).getKey()+"-->"+((Map.Entry<?, ?>) o).getValue());
        }
    }
}

