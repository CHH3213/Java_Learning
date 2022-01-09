package src.pers.chh3213.threadExecsise20220107;

import java.nio.file.Watchable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : src.pers.chh3213.threadExecsise20220107
 * @FileName : ProductConsumerTest.java
 * @createTime : 2022/1/7 上午11:17
 * @Email :
 * @Description : 编写生产者消费者多线程程序，设有一个最大库存量为 4 的电视机仓库，生产 10 台电视机，一边生产一边销售（消费）。
 */
public class ProductConsumerTest {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(4);
        Product product = new Product(warehouse);
        Sell sell = new Sell(warehouse);
        product.start();
        sell.start();
    }
}

class Warehouse{
    private int  TV_number;
    public Warehouse(int TV_number){
        this.TV_number = TV_number;
    }

    public int getTV_number() {
        return TV_number;
    }

    public synchronized void toSell(){
        if(TV_number<=0){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        notifyAll();
        TV_number--;
        System.out.println("开始销售，当前TV数量："+TV_number);
    }
    public synchronized void toProduce(){
        if(TV_number>=4){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        notifyAll();
        TV_number++;
        System.out.println("开始生产，当前TV数量："+TV_number);
    }

}
class Product extends Thread{
    private  static Warehouse warehouse;
    public Product(Warehouse warehouse){
        this.warehouse = warehouse;
    }
    @Override
    public void run(){
        int i=1;
        while (i<=20){
                    warehouse.toProduce();
                    i++;
                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

        }
}

class Sell extends Thread{
    private  static Warehouse warehouse;
    public Sell(Warehouse warehouse){
        this.warehouse = warehouse;
    }
    @Override
    public void run(){
        int i=1;
        while (i<=20){

                warehouse.toSell();
                i++;
                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        }
}