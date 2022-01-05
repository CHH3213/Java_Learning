package pers.chh3213.thread;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.thread
 * @FileName : TicketDemo.java
 * @createTime : 2022/1/4 下午10:27
 * @Email :
 * @Description :模拟火车站售票程序，开启三个窗口售票。
 */
public class TicketDemo {
    public static void main(String[] args) {
    Ticket t = new Ticket();
    Thread t1 = new Thread(t);
    Thread t2 = new Thread(t);
    Thread t3 = new Thread(t);
    t1.setName("t1");
    t2.setName("t2");
    t3.setName("t3");
    t1.start();
    t2.start();
    t3.start();
    }
}

class Ticket implements Runnable{
    private int tick=100;
    @Override
    public  void run(){
        while (true) {
            synchronized (this) {
                if (tick > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick--);
                } else break;
            }
        }
    }
}
