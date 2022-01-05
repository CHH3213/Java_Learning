package pers.chh3213.thread20220105;

import java.security.PublicKey;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.thread20220105
 * @ClassName : TicketSync2.java
 * @createTime : 2022/1/5 9:45
 * @Email :
 * @Description :同步方法处理继承Thread类的线程安全问题
 */
public class TicketSync2 {
    public static void main(String[] args) {
        Ticket2 t1 = new Ticket2();
        Ticket2 t2 = new Ticket2();
        Ticket2 t3 = new Ticket2();
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Ticket2 extends Thread{
    private static int tick=100;
    private static Object obj = new Object();
    @Override
    public  void run(){
        while (true) {
            if(tick<=0)break;
            buy();
        }
    }
    public static synchronized void buy(){
//    public  synchronized void buy(){//此种解决方法错误
            if (tick > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick--);
            }
    }
}
