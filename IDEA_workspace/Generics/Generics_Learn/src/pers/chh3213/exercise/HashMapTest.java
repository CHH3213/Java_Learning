package pers.chh3213.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Generics
 * @Package : pers.chh3213.exercise
 * @FileName : HashMapTest.java
 * @createTime : 2022/1/14 下午9:57
 * @Email :
 * @Description :
 */
public class HashMapTest {

     public static void main(String[] args) {

         HashMap<String, Integer> hashMap = new HashMap<>();

         hashMap.put("张三", 800);
         hashMap.put("李四", 1500);
         hashMap.put("王五", 3000);

         //将张三的工资更改为2600元
         hashMap.replace("张三", 2500);

         //为所有员工工资加薪100元
         //遍历集合中所有的员工
         //遍历集合中所有的工资
         Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
         Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
         while(iterator.hasNext()) {
             Map.Entry<String, Integer> entry = iterator.next();
             String key = entry.getKey();
             Integer val = entry.getValue()+100;
             hashMap.put(key,val);
             System.out.println(entry.getKey());
             System.out.println(entry.getValue());

         }
     }
 }

