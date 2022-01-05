package pers.chh3213.thread;

class MyThread extends Thread{
    public MyThread(){
        super();
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" " +i);
        }
    }

}
public class TestThread{
    public static void main(String[] args) {
        //1.创建线程
        MyThread mt = new MyThread();
        //2.启动线程；并调用当前线程的run（）方法
//        mt.start();
        mt.start();
//        mt.run();
        MyThread mt1 = new MyThread();
        mt1.start();
        //如下操作仍在main线程中执行
        for (int i = 0; i <10 ; i++) {
            System.out.println("main method："+i);
        }

    }
}
