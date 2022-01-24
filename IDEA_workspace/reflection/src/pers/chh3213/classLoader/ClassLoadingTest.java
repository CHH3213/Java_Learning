package pers.chh3213.classLoader;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.classLoader
 * @ClassName : ClassLoadingTest.java
 * @createTime : 2022/1/22 21:33
 * @Email :
 * @Description :
 */
public class ClassLoadingTest {
    public static void main(String[] args) {
// 主动引用：一定会导致A和Father的初始化
// A a = new A();
// System.out.println(A.m);
// Class.forName("pers.chh3213.classLoader.A");
// 被动引用
//        A[] array = new A[5];//不会导致A和Father的初始化
// System.out.println(A.b);//只会初始化Father
 System.out.println(A.M);//不会导致A和Father的初始化
    }
    static {
        System.out.println("main所在的类");
    }
}
class Father {
    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}
class A extends Father {
    static {
        System.out.println("子类被加载");
        m = 300;
    }
    static int m = 100;
    static final int M = 1;
}