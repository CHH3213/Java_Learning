package src.pers.chh3213.threadExecsise20220108.newTortoiseHare;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : src.pers.chh3213.threadExecsise20220108.newTortoiseHare
 * @FileName : Test.java
 * @createTime : 2022/1/8 上午9:28
 * @Email :
 * @Description :
 */
public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Rabbit(),"兔子");//兔子线程
        t1.setPriority(10);//设置级别
        t1.start();//启动线程

        Thread t2 = new Thread(new Tortoise(),"乌龟");//乌龟线程
        t2.setPriority(1);//设置级别
        t2.start();//启动线程
    }
}
class Tortoise implements Runnable{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 1; i <=100; i++) {
            try {
                //每隔10毫秒跑一次，全程一直跑
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName()+"跑了"+i+"米");
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
class Rabbit implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 1; i <=100; i++) {
                //每隔10毫秒跑一次
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName()+"跑了"+i+"米");
                //兔子跑到10米的时候,谦让乌龟一下，接着跑
                if(i==10){
                    System.out.println("==============兔子跑到10米的时候,谦让乌龟一下，接着跑=============");
                    //让步，进入就绪状态
                    Thread.yield();
                }
                //兔子跑到50米的时候，再让龟1毫秒,接着跑
                if(i==50){
                    System.out.println("==============兔子跑到50米的时候，再让龟1毫秒,接着跑=============");
                    //休眠，进入阻塞状态
                    Thread.sleep(1);
                }
                //兔子跑到80米的时候，睡了50毫秒，接着跑
                if(i==80){
                    System.out.println("==============兔子跑到80米的时候，睡了10毫秒，接着跑=============");
                    Thread.sleep(50);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}