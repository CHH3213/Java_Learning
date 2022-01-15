package pers.chh3213.exercise;

import org.junit.Test;

import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : AdvancedCode
 * @Package : pers.chh3213
 * @FileName : Exercise.java
 * @createTime : 2022/1/9 下午8:41
 * @Email :
 * @Description :
 */
public class Exercise {
        public static void main(String a[]) {

            String s = "people";
            String t = "people";
            String c[ ] = {"p","e","o","p","l" ,"e"};
            System.out.println(s.equals(t));//true
            System.out.println(t.equals(c));//false
            System.out.println(s==t);//true
            System.out.println(t.equals(new String("people")));//true

        }
        @Test
        public void test1(){

            String s = "abcdefg";
            System.out.println(s.charAt(1));
            s+="student";
            int len = s.length();
            String t = s.toLowerCase(Locale.ROOT);
        }

        @Test
        public void test2(){
//            String s[ ] = new String[5];
//            for(int i=0;i<5;s[i++]="");
            String s[ ]={"", "", "", "", ""};
            System.out.println(s);

        }


}
