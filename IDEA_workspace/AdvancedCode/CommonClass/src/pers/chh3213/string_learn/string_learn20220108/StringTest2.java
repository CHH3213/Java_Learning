package pers.chh3213.string_learn.string_learn20220108;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : AdvancedCode
 * @Package : pers.chh3213.string_learn.string_learn20220108
 * @FileName : StringTest2.java
 * @createTime : 2022/1/8 上午10:54
 * @Email :
 * @Description :
 */
public class StringTest2 {
    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };
    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }
    public static void main(String[] args) {
        StringTest2 ex = new StringTest2();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");//
        System.out.println(ex.ch);
    }
}
