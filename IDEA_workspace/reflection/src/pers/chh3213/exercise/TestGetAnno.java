package pers.chh3213.exercise;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static  java.lang.annotation.ElementType.*;



/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.exercise
 * @ClassName : TestGetAnno.java
 * @createTime : 2022/1/23 20:53
 * @Email :
 * @Description :
 */
public class TestGetAnno {
    public static void main(String[] args) throws Exception{
        Class<Student> clazz = Student.class;
        //for (Annotation annotation : clazz.getAnnotations()) {
        //    System.out.println(annotation);
        //}
        System.out.println(clazz.toString());
        MyAnnotation declaredAnnotation = clazz.getDeclaredAnnotation(MyAnnotation.class);
        System.out.println(declaredAnnotation);

    }
}

//@MyAnnotation(myName = "hh")
class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @MyAnnotation(myName = "jack")
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}




@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String myName() default "cao";
}
