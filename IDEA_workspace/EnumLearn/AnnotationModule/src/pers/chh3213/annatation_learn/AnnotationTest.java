package pers.chh3213.annatation_learn;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : EnumLearn
 * @Package : pers.chh3213.annatation_learn
 * @FileName : AnnotationTest.java
 * @createTime : 2022/1/10 上午9:38
 * @Email :
 * @Description :
 */
public class AnnotationTest {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int a = 10;
        System.out.println(a);
    }
    @Deprecated
    public void print(){
        System.out.println("过时的方法");
    }
    @Override
    public String toString() {
        return "重写的toString方法()";
    }
}
