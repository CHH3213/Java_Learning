package pers.chh3213.string_learn.string_learn20220108;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : AdvancedCode
 * @Package : pers.chh3213.string_learn.string_learn20220108
 * @FileName : StringReverse.java
 * @createTime : 2022/1/8 上午11:32
 * @Email :
 * @Description :
 */
public class StringReverse {
    public static void main(String[] args) {
        String s = reverse("1234567",3,5);
        System.out.println(s);
    }
    public static String reverse (String str,int start, int end){
        if(str!=null){

                if (start < end) {
                    char[] temp_char = str.toCharArray();
                    for (int i = start; i < end; i++) {
                        char temp = temp_char[i];
                        temp_char[i] = temp_char[end - i];
                        temp_char[end - i] = temp;
                    }
                    return new String(temp_char);
                }

        }
        return null;
    }
}
