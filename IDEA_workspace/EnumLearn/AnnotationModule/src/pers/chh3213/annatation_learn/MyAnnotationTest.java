package pers.chh3213.annatation_learn;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : EnumLearn
 * @Package : pers.chh3213.annatation_learn
 * @FileName : MyAnnotationTest.java
 * @createTime : 2022/1/10 上午9:48
 * @Email :
 * @Description :
 */

@MyAnnotation("chh3213")
public class MyAnnotationTest {
    public static void main(String[] args) {
        Class clazz = MyAnnotationTest.class;
        Annotation a = clazz.getAnnotation(MyAnnotation.class);
        MyAnnotation m = (MyAnnotation) a;//向下转型
        String info = m.value();
        System.out.println(info);
    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyAnnotation{
    String value() default "chh";
}