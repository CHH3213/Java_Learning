package pers.chh3213.exercise;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.exercise
 * @ClassName : ReflectTest.java
 * @createTime : 2022/1/23 21:18
 * @Email :
 * @Description :
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception{
        Class<PrivateTest> clazz = PrivateTest.class;
        PrivateTest privateTest = clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        System.out.println(name);
        name.setAccessible(true);
        name.set(privateTest,"kitty");
        String name2 =(String) name.get(privateTest);
        System.out.println(name2);
        Method getName = clazz.getDeclaredMethod("getName");
        getName.setAccessible(true);
        Object invoke = getName.invoke(privateTest);
        System.out.println(invoke);

    }
}
class PrivateTest{
    private final String name="hellokitty";

    public String getName() {
        return name;
    }

}
