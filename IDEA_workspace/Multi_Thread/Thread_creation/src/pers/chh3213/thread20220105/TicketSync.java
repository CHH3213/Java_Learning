package pers.chh3213.thread20220105;


/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.thread20220105
 * @ClassName : TicketSync.java
 * @createTime : 2022/1/5 9:35
 * @Email :
 * @Description : 同步方法处理实现Runnable的线程安全问题
 */
public class TicketSync {
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

class Ticket implements Runnable {
    private int tick = 100;

    @Override
    public void run() {
        while (true) {
            if(tick<=0)break;
            buy();
        }
    }

    public synchronized void buy() { //同步监视器:this
//        synchronized (this){
        if (tick > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick--);
    }
//}
}
