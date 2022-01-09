package pers.chh3213.string_learn.string_learn20220109;
import org.junit.Test;
/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : AdvancedCode
 * @Package : pers.chh3213.string_learn.string_learn20220109
 * @FileName : CodeTest.java
 * @createTime : 2022/1/9 下午3:50
 * @Email :
 * @Description :
 */

public class CodeTest {
    @Test
    public void test(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//
        System.out.println(sb);//
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);//
    }
    @Test
    public void test2(){
        String a="123";
        String b="123";
        String c=new String("123");
        String d=new String("123");
        System.out.println(a.equals(b));//true
        System.out.println(a==b);//true
        System.out.println(c.equals(d));//true
        System.out.println(c==d);//false
        System.out.println(a.equals(c));//true
        System.out.println(a==c);//false
    }
}
