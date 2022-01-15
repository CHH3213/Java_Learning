package pers.chh3213.exercise1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.exercise1
 * @FileName : StudentTest.java
 * @createTime : 2022/1/13 上午9:02
 * @Email :
 * @Description :
 */
public class StudentTest {
    @Test
    public void test(){
        /**
         * 定制排序
         */
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Student && o2 instanceof Student){
                    Student s1 = (Student) o1;
                    Student s2 = (Student) o2;
                    return -Integer.compare(s1.getScore(),s2.getScore());
                }
                else {
                    throw new RuntimeException("类型不一致");
                }
            }
        };
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.add(new Student("jack",98,1));
        treeSet.add(new Student("rose",99,2));
        treeSet.add(new Student("rock",88,4));
        treeSet.add(new Student("fuzz",65,3));
        treeSet.add(new Student("87",77,6));
        treeSet.add(new Student("hah",100,5));
        Iterator iterator = treeSet.iterator();
        int count=0;
        while(iterator.hasNext()&&count<3){
            System.out.println(iterator.next());
            count++;

        }
    }
    @Test
    public void test02(){
        /**
         * 自然排序
         */
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Student("jack",98,1));
        treeSet.add(new Student("rose",99,2));
        treeSet.add(new Student("rock",88,4));
        treeSet.add(new Student("fuzz",65,3));
        treeSet.add(new Student("87",77,6));
        treeSet.add(new Student("hah",100,5));
        Iterator iterator = treeSet.iterator();
        int count=0;
        while(iterator.hasNext()&&count<3){
            System.out.println(iterator.next());
            count++;

        }
    }

}
