package pers.chh3213.threadExecsise20220106;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.threadExecsise20220106
 * @FileName : TestThread.java
 * @createTime : 2022/1/6 下午5:15
 * @Email :
 * @Description :
 */
public class TestThread {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("t1",10);
        MyThread myThread2 = new MyThread("t2",10);
        MyThread myThread3 = new MyThread("t3",10);
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}

class MyThread extends Thread{
    private String WhoAmI;
    private int delay;
    MyThread(String whoAmI, int delay){
        this.WhoAmI = whoAmI;
        this.delay = delay;
    }
    public void run(){
        synchronized (MyThread.class){
            try{
                MyThread.sleep(delay);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(WhoAmI+" 休眠时间:" +delay);
        }
    }

}
