package pers.chh3213.objectStream;

import org.junit.Test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : File
 * @Package : pers.chh3213.objectStream
 * @ClassName : ObjectStreamTest.java
 * @createTime : 2022/1/20 17:00
 * @Email :
 * @Description :
 */
public class ObjectStreamTest {
    /**
     * //序列化：将对象写入到磁盘或者进行网络传输。
     * //要求对象必须实现序列化
     * @throws IOException
     */
    @Test
    public void test01() throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("data1.txt"));
            Person p = new Person("韩梅梅", 18, "中华大地", new Pet("cat"));
            oos.writeObject(p);
            oos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(oos!=null){
                try{
                    oos.close();

                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * //反序列化：将磁盘中的对象数据源读出。
     * @throws Exception
     */
    @Test
    public void test02() throws Exception{
        File file;
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("data1.txt")));
        Person p = (Person) ois.readObject();
        System.out.println(p.toString());
        ois.close();
    }

}
