package src.pers.chh3213.threadExecsise20220107;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : src.pers.chh3213.threadExecsise20220107
 * @FileName : EatTest.java
 * @createTime : 2022/1/7 下午5:04
 * @Email :
 * @Description :
 */
public class EatTest {
    public static void main(String[] args) {
        Somebody somebody = new Somebody(0,0);
        Eat eat = new Eat(somebody);
        MakeToy makeToy = new MakeToy(somebody);

        Thread t1 = new Thread(eat);
        Thread t2 = new Thread(makeToy);
        t2.start();
        t1.start();

    }
}

class Somebody {
    private int toy_number ;
    private int eat_mantou_number ;
    private boolean eat_flag = false;
    public Somebody(int toy_number,int eat_mantou_number ){
        this.toy_number = toy_number;
        this.eat_mantou_number = eat_mantou_number;

    }
    public synchronized void makeToy(){
        while (toy_number<50) {

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            toy_number++;
            System.out.println("当前共生产玩具：" + toy_number + "个");

            if(toy_number ==20){
                eat_flag = true;
                try {
                    wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
    }

    public synchronized void eat(){
        if(eat_flag) {
            while (eat_mantou_number < 3) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                eat_mantou_number++;
                System.out.println("吃第" + eat_mantou_number + "个馒头");
            }
            notifyAll();
            eat_flag=false;
        }
        eat_mantou_number=0;


    }

}


class Eat implements Runnable{
    private static Somebody somebody;
    public Eat(Somebody somebody){
        this.somebody = somebody;
    }
    @Override
    public void run(){
        somebody.eat();
    }
}class MakeToy implements Runnable{
    private static Somebody somebody;
    public MakeToy(Somebody somebody){
        this.somebody = somebody;
    }
    @Override
    public void run(){
        somebody.makeToy();
    }
}


