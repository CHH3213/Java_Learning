package pers.chh3213.string_learn.string_learn20220108;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : AdvancedCode
 * @Package : pers.chh3213.string_learn.string_learn20220108
 * @FileName : StringTrim.java
 * @createTime : 2022/1/8 上午11:27
 * @Email :
 * @Description :
/*
 * 1.模拟一个trim方法，去除字符串两端的空格。
 *
 */
public class StringTrim {
    // 第1题
    public static String myTrim(String str) {
        if (str != null) {
            int start = 0;// 用于记录从前往后首次索引位置不是空格的位置的索引
            int end = str.length() - 1;// 用于记录从后往前首次索引位置不是空格的位置的索引

            while (start < end && str.charAt(start) == ' ') {
                start++;
            }

            while (start < end && str.charAt(end) == ' ') {
                end--;
            }
            if (str.charAt(start) == ' ') {
                return "";
            }

            return str.substring(start, end + 1);
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "   a  b   ";
        System.out.println("---" + str + "---");
        // str = " ";
        String newStr = myTrim(str);
        System.out.println("---" + newStr + "---");
    }

}
