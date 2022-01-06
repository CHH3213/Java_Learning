package pers.chh3213.communication20220106;


/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.communication20220106
 * @FileName : CommunicationTest.java
 * @createTime : 2022/1/6 上午8:45
 * @Email :
 * @Description :
 */
public class CommunicationTest {
    public static void main(String[] args) {
    Communication communication = new Communication();
    Thread t1 = new Thread(communication);
    Thread t2 = new Thread(communication);
    t1.start();
    t2.start();
    }
}

class Communication implements Runnable{
    int i =1;
    @Override
    public void run(){
        while (true){
            synchronized(this){
                notify();
                if(i<=100){
                    System.out.println(Thread.currentThread().getName() +" : " +i++);
                }else {
                    break;
                }

                try {
                    wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}