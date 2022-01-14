package pers.chh3213.customize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Generics
 * @Package : pers.chh3213.customize
 * @FileName : OrderTest.java
 * @createTime : 2022/1/14 下午3:55
 * @Email :
 * @Description :
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 自定义泛型类
 */
public class OrderTest<T> {

    /**
     * 泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系。
     * 换句话说，泛型方法所属的类是不是泛型类都没有关系。
     * 泛型方法，可以声明为静态的。原因：泛型参数是在调用方法时确定的。并非在实例化类时确定。
     */
    public static <E> List<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();

        for(E e : arr){
            list.add(e);
        }
        return list;

    }
}

