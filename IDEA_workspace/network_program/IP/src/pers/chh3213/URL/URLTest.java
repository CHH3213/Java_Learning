package pers.chh3213.URL;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : network_program
 * @Package : pers.chh3213.URL
 * @ClassName : URLTest.java
 * @createTime : 2022/1/22 13:16
 * @Email :
 * @Description :
 */
public class URLTest {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://mp.csdn.net/#");
            System.out.println("getProtocol() :"+url.getProtocol());
            System.out.println("getHost() :"+url.getHost());
            System.out.println("getPort() :"+url.getPort());
            System.out.println("getPath() :"+url.getPath());
            System.out.println("getFile() :"+url.getFile());
            System.out.println("getQuery() :"+url.getQuery());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
