package pers.chh3213.thread;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.thread
 * @FileName : Thread
 * @createTime : 2022/1/4 下午9:29
 * @Email :
 * @Description : 使用继承的方式
 */
public class ThreadExtend {
    public static void main(String[] args) {
        thread01 t1 = new thread01();//也可以使用Thread类的匿名子类的方式
        t1.start();
        thread02 t2 = new thread02();
        t2.start();
    }
}
class thread01 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}class thread02 extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1)
                System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
