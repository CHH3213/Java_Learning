package pers.chh3213.date_learn.data_learn20220109;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : AdvancedCode
 * @Package : pers.chh3213.date_learn.data_learn20220109
 * @FileName : DateTest.java
 * @createTime : 2022/1/9 下午4:12
 * @Email :
 * @Description :
 */
public class DateTest {
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        System.out.println(time);
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        Date date1 = new Date(date.getTime());
        System.out.println(date1.getTime());
        System.out.println(date1.toString());
    }

    @Test
    public void test2(){
        Date date = new Date(); // 产生一个Date实例
        // 产生一个formater格式化的实例
        SimpleDateFormat formater = new SimpleDateFormat();
        System.out.println(formater.format(date));// 打印输出默认的格式
        SimpleDateFormat formater2 = new SimpleDateFormat("yyyy年MM月dd日 EEE HH:mm:ss");
        System.out.println(formater2.format(date));
        System.out.println(date);
        try {
        // 实例化一个指定的格式对象
            Date date2 = formater2.parse("2008年08月08日 星期一 08:08:08");
        // 将指定的日期解析后格式化按指定的格式输出
            System.out.println(date2.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        Calendar calendar = Calendar.getInstance();
        // 从一个 Calendar 对象中获取 Date 对象
        Date date = calendar.getTime();
        // 使用给定的 Date 设置此 Calendar 的时间
        date = new Date(234234235235L);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        System.out.println("当前时间日设置为8后,时间是:" + calendar.getTime());
        calendar.add(Calendar.HOUR, 2);
        System.out.println("当前时间加2小时后,时间是:" + calendar.getTime());
        calendar.add(Calendar.MONTH, -2);
        System.out.println("当前日期减2个月后,时间是:" + calendar.getTime());
    }
}
