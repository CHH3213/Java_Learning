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
 * @FileName : LastNameCountTest.java
 * @createTime : 2022/1/13 上午10:22
 * @Email :
 * @Description :
 */
public class LastNameCountTest {
    @Test
    public void test(){
        Set set = new HashSet();
        set.add("张 三");
        set.add("罗 翔");
        set.add("罗 翔1");
        set.add("罗翔 1");
        set.add("上官 云祥");
        set.add("李 四");
        set.add("王 五");
        set.add("王5 4");
        Iterator iterator = set.iterator();
        List list = new ArrayList();
        while (iterator.hasNext()) {
            Object name = iterator.next();
            String str = name.toString();
            if(str.indexOf(" ")!=-1){//存在空格
               String s = str.substring(0,str.indexOf(" "));
                list.add(s);
            }
        }
        HashMap<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (!map.containsKey(obj)) {//如果姓氏没有开始统计，不在map中
                map.put(obj, 1);
            } else {//如果姓氏已经在map中
                map.put(obj, map.get(obj) + 1);
            }
        }
        Iterator iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
