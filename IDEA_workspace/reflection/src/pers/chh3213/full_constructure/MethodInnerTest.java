package pers.chh3213.full_constructure;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.full_constructure
 * @ClassName : MethodInnerTest.java
 * @createTime : 2022/1/23 11:48
 * @Email :
 * @Description :
 */
public class MethodInnerTest {
    @Test
    public void test01(){
        Class<Person> clazz = Person.class;
        for (Method declaredMethod : clazz.getDeclaredMethods()) {
            //1.获取方法声明的注解
            System.out.println("========注解========");
            for (Annotation annotation : declaredMethod.getAnnotations()) {
                System.out.println(annotation);
            }
            //2.权限修饰符
            System.out.println("=======权限修饰符===========");
            System.out.println(Modifier.toString(declaredMethod.getModifiers()) + "\t");
            //3.返回值类型
            System.out.println("=========返回值类型=======");
            System.out.println(declaredMethod.getReturnType().getName());
            //4.方法名
            System.out.println("==========方法名======");
            System.out.println(declaredMethod.getName());
            //5.形参列表
            System.out.println("======形参列表==============");
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            if(!(parameterTypes.length==0&&parameterTypes==null)){
                for (int i =0;i<parameterTypes.length;i++) {
                    System.out.println(parameterTypes[i].getName()+"args_"+i);
                }
            }
            //6.抛出的异常
            System.out.println("抛出的异常");
            Class[] exceptionTypes = declaredMethod.getExceptionTypes();
            if(exceptionTypes.length>0){
                for(int i=0;i<exceptionTypes.length;i++){
                    System.out.println(exceptionTypes[i].getName());
                }
            }

        }

    }
}
