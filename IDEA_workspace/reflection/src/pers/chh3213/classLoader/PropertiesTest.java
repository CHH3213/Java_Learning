package pers.chh3213.classLoader;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : reflection
 * @Package : pers.chh3213.classLoader
 * @ClassName : PropertiesTest.java
 * @createTime : 2022/1/23 9:31
 * @Email :
 * @Description :
 */
public class PropertiesTest {
    @Test
    public void test01() throws Exception{
        Properties properties = new Properties();
        //读取配置文件的方式一,此时文件路径默认在当前的module下
        //FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
        //FileInputStream fileInputStream = new FileInputStream("src/jdbc1.properties");
        //properties.load(fileInputStream);

        //读取配置文件的方式2，此时文件路径默认识别为当前module下的src
        ClassLoader classLoader = ClassLoadingTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc1.properties");
        properties.load(resourceAsStream);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("user=:"+user+";passward:"+password);
    }
}
