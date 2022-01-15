package pers.chh3213.string_learn.string_learn20220108;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : AdvancedCode
 * @Package : pers.chh3213.string_learn.string_learn20220108
 * @FileName : StringConvert.java
 * @createTime : 2022/1/8 上午11:20
 * @Email :
 * @Description :字符串 --> 字节数组;字节数组 --> 字符串
 */
public class StringConvert {
    public static void main(String[] args) {
        String str = "中";
        try{
            System.out.println(str.getBytes("ISO8859-1").length);//
            System.out.println(str.getBytes("GBK").length);
            System.out.println(str.getBytes("UTF-8").length);
            System.out.println(new String(str.getBytes("ISO8859-1"),
                    "ISO8859-1"));// 乱码，表示不了中文
            System.out.println(new String(str.getBytes("GBK"), "GBK"));
            System.out.println(new String(str.getBytes("UTF-8"), "UTF-8"));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
