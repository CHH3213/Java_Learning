package pers.chh3213.customize;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Generics
 * @Package : pers.chh3213.customize
 * @FileName : SubOrder.java
 * @createTime : 2022/1/14 下午3:58
 * @Email :
 * @Description :
 */
import java.util.ArrayList;
import java.util.List;

public class SubOrder extends OrderTest<Integer>{   //SubOrder:不是泛型类

    public static <E> List<E> copyFromArrayToList(E[] arr){//静态的泛型方法

        ArrayList<E> list = new ArrayList<>();

        for(E e : arr){
            list.add(e);
        }
        return list;

    }
}

