package pers.chh3213.exercise1;

import org.junit.Test;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.exercise1
 * @FileName : MapTest.java
 * @createTime : 2022/1/13 上午11:44
 * @Email :
 * @Description :
 */
public class MapTest {
    @Test
    public void test01(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1",null);
        map.put("2","a");
        map.put("3","b");
        map.put(null,"c");
        map.put("5",null);
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        for (String key:map.keySet()) {
            if(map.get(key)==null){
                map.put(key,"这里是空值");
            }
        }
        Iterator iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
    }

    @Test
    public void test02(){
        Integer[] datas = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(datas);
        list.add(5);
        System.out.println(list.size());
    }

}
