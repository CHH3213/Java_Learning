//package pers.chh3213.customize;
//
///**
// * Created with IntelliJ IDEA.
// *
// * @author : chh3213
// * @version : 1.0
// * @Project : Generics
// * @Package : pers.chh3213.customize
// * @FileName : GenericTest.java
// * @createTime : 2022/1/14 下午3:57
// * @Email :
// * @Description :
// */
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
///**
// * 如何自定义泛型结构：泛型类、泛型接口；泛型方法。
// *
// * 1.关于自定义泛型类、泛型接口：
// *
// */
//public class GenericTest {
//
//    //测试泛型方法
//    @Test
//    public void test4(){
//        OrderTest<String> order = new OrderTest<>();
//        Integer[] arr = new Integer[]{1,2,3,4};
//        //泛型方法在调用时，指明泛型参数的类型。
//        List<Integer> list = order.copyFromArrayToList(arr);
//
//        System.out.println(list);
//    }
//
//    /**
//     * 2.通配符的使用
//     * 通配符：？
//     *
//     * 类A是类B的父类，G<A>和G<B>是没有关系的，二者共同的父类是：G<?>
//     */
//    @Test
//    public void test3(){
//        List<Object> list1 = null;
//        List<String> list2 = null;
//
//        List<?> list = null;
//
//        list = list1;
//        list = list2;
//
//        //编译通过
//        print(list1);
//        print(list2);
//    }
//
//    public void print(List<?> list){
//        Iterator<?> iterator = list.iterator();
//        while(iterator.hasNext()){
//            Object obj = iterator.next();
//            System.out.println(obj);
//        }
//    }
//    @Test
//    public void test(){
//        List<? extends Person> list1 = null;
//        List<? super Person> list2 = null;
//
//        //        List<Student> list3 = null;
//        //        List<Student> list4 = null;
//        //        List<Student> list5 = null;
//
//        List<Student> list3 = new ArrayList<Student>();
//        List<Person> list4 = new ArrayList<Person>();
//        List<Object> list5 = new ArrayList<Object>();
//
//        list1 = list3;
//        list1 = list4;
//        //        list1 = list5;
//
//        //        list2 = list3;
//        list2 = list4;
//        list2 = list5;
//
//        //读取数据：
////        list1 = list3;
////        Person p = list1.get(0);
//        //编译不通过
//        //Student s = list1.get(0);
//
//        list2 = list4;
//        Object obj = list2.get(0);
////        编译不通过
//        //        Person obj = list2.get(0);
//
//        //写入数据：
//        //编译不通过
//        //        list1.add(new Student());
//
//        //编译通过
//        list2.add(new Person());
//        list2.add(new Student());
//    }
//
//    public static void main(String[] args) {
//        List<?> list = null;
//        list = new ArrayList<String>();
//        list = new ArrayList<Double>();
////         list.add(3);//编译不通过
//        list.add(null);
//        List<String> l1 = new ArrayList<String>();
//        List<Integer> l2 = new ArrayList<Integer>();
//        l1.add("尚硅谷");
//        l2.add(15);
//        read(l1);
//        read(l2);
//    }
//    public static void read(List<?> list) {
//        for (Object o : list) {
//            System.out.println(o);
//        }
//    }
//}
//
//// class Person {
////}
//class Student extends Person{
//}