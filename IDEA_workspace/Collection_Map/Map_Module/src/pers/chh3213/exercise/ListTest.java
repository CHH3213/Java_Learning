package pers.chh3213.exercise;

import org.junit.Test;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.exercise
 * @FileName : ListTest.java
 * @createTime : 2022/1/13 上午8:46
 * @Email :
 * @Description :
 */
public class ListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new ArrayList();
        System.out.println("input:");
        while (true){
//            System.out.println("input your number: ");
            int i = scanner.nextInt();
            list.add(i);
            if(list.size()>10){
                break;
            }
        }
        //倒叙
        Collections.reverse(list);
        Iterator iterator = list.iterator();
        System.out.println("倒叙");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        Collections.sort(list);//从小到大
         iterator = list.iterator();
        System.out.println();
        System.out.println("从小到大");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }


    }

}
