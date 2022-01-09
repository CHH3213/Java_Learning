package pers.chh3213.string_learn.string_learn20220108;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : AdvancedCode
 * @Package : pers.chh3213.string_learn.string_learn20220108
 * @FileName : stringClass.java
 * @createTime : 2022/1/8 上午10:33
 * @Email :
 * @Description :
 */
public class stringClass {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        //通过new + 构造器的方式:此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值。
        String s3=new String("java");
        String s4=new String("java");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s4);
    }
}
