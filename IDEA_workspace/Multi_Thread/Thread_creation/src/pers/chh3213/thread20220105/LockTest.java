package pers.chh3213.thread20220105;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.thread20220105
 * @ClassName : LockTest.java
 * @createTime : 2022/1/5 12:51
 * @Email :
 * @Description :解决线程安全问题的方式三：lock锁---》JDK5.0新增
 */
import java.util.concurrent.locks.ReentrantLock;


class Windows implements Runnable{

    private int tick = 100;
    //1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while(true){
            try{
                //调用锁定方法：lock()
                lock.lock();
                if(tick > 0){

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick--);
                }else{
                    break;
                }
            }finally {
                //3.调用解锁方法：unlock()
                lock.unlock();
            }
        }
    }
}

public class LockTest {
    public static void main(String[] args) {
        Windows w = new Windows();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
