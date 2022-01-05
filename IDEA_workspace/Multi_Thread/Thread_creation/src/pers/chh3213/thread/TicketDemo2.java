package pers.chh3213.thread;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.thread
 * @FileName : TicketDemo2.java
 * @createTime : 2022/1/4 下午10:27
 * @Email :
 * @Description :模拟火车站售票程序，开启三个窗口售票。使用继承threa类的方式
 */
public class TicketDemo2 {
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
    private int tick=100;
    private static Object obj = new Object();
    @Override
    public  void run(){
        while (true) {
//            synchronized (Ticket2.class) { //方式 1
            synchronized (obj) {//方式 2
//            synchronized (this) {//错误，因为此时this表示的是t1,t2,t3三个对象
                if (tick > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                    System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick--);
                } else break;
            }
        }
    }
}
