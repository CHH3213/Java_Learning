package pers.chh3213.map;

import org.junit.Test;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Collection_Map
 * @Package : pers.chh3213.map
 * @FileName : MapTest.java
 * @createTime : 2022/1/12 上午9:31
 * @Email :
 * @Description :
 */
public class MapTest {
    @Test
    public void test(){
        Map map = new HashMap();
        map.put("1",1);
        map.put("2",2);
        map.put("3",4);
        System.out.println("map的所有key:");
        Set keys = map.keySet();// HashSet
        for (Object key : keys) {
            System.out.println(key + "->" + map.get(key));
        }
        System.out.println("map的所有的value：");
        Collection values = map.values();
        Iterator iter = values.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("map所有的映射关系：");
        // 映射关系的类型是Map.Entry类型，它是Map接口的内部接口
        Set mappings = map.entrySet();
        for (Object mapping : mappings) {
            Map.Entry entry = (Map.Entry) mapping;
            System.out.println("key是：" + entry.getKey() + "，value是：" + entry.getValue());
        }
    }
}
