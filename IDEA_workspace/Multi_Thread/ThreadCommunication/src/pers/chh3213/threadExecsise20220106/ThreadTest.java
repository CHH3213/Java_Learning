package pers.chh3213.threadExecsise20220106;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.threadExecsise20220106
 * @FileName : ThreadTest.java
 * @createTime : 2022/1/6 下午8:05
 * @Email :
 * @Description :
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread t = new Thread(t1);
        t.start();
        try {

            t.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        int j =t1.i;
        System.out.println(j);

    }
}

class Thread1 implements Runnable{
    int i;

    @Override
    public void run() {
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        i=100;
    }
}
