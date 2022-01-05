package pers.chh3213.thread;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.thread
 * @FileName : ThreadExer.java
 * @createTime : 2022/1/4 下午9:21
 * @Email :
 * @Description :
 */
public class ThreadExer {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread tt1 = new Thread(t1);
        tt1.start();
        Thread2 t2 = new Thread2();
        Thread tt2 = new Thread(t2);
        tt2.start();
    }
}

class Thread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}class Thread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1)
                System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}


