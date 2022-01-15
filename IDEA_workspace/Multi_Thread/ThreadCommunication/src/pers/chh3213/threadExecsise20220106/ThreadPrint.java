package pers.chh3213.threadExecsise20220106;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.threadExecsise20220106
 * @FileName : ThreadPrint.java
 * @createTime : 2022/1/6 下午8:14
 * @Email :
 * @Description :
 */
public class ThreadPrint extends Thread {
    int k = 1;
    public void run() {
        int i = k;
            while (i < 50) {
                System.out.println(Thread.currentThread().getName() + "-----" + i);
                i += 2;
            }
            System.out.println(Thread.currentThread().getName() + " end!");

    }
    public static void main(String[] args) {
        ThreadPrint t1 = new ThreadPrint();
        ThreadPrint t2 = new ThreadPrint();
        t1.k = 1;
        t2.k = 2;
        t1.start();
        t2.start();
    }
}
