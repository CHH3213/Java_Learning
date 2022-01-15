package src.pers.chh3213.threadExecsise20220108.newTortoiseHare;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : src.pers.chh3213.threadExecsise20220108
 * @FileName : TortoiseHareTest.java
 * @createTime : 2022/1/8 上午8:56
 * @Email :
 * @Description :编写龟兔赛跑多线程程序，设赛跑长度为 100 米，每跑完10 米输出一次结果。
 * 改进上题的龟兔赛跑程序，通过改变优先级，并减掉休眠时间，使得乌龟以迅雷不及掩耳的速度跑完 100 米。
 *
 */
public class TortoiseHareTest {
    public static void main(String[] args) {
        Animal tortoise = new Animal("tortoise",5);
        Animal hare = new Animal("hare",10);
        Thread t1 = new Thread(tortoise);
        Thread t2 = new Thread(hare);
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}

class Animal implements Runnable{
    private String name;
    private int speed;
    private int i=1;
    public Animal(String name,int speed ){
        this.name = name;
        this.speed=speed;
    }
    public synchronized void Begin(){
        Thread.currentThread().setName(name);
        while(i*speed<=100) {
//            this.notify();
            if((i * speed) % 10 == 0) {
                try {
                    Thread.sleep((int) (10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(Thread.currentThread().getName().equals("hare")&&(i * speed) % 10 == 0){
                try {
                    Thread.sleep((int) (1));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("=======================");
                System.out.println("Hare have a rest");
                System.out.println("------------------------");
            }
                System.out.println(Thread.currentThread().getName() + "已跑完：" + i * speed + "米");
            i++;
//            try {
//                this.wait();
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
        }

    }
    public void run(){
        Begin();
    }

}