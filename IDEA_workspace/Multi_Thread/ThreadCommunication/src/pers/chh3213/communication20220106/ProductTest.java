package pers.chh3213.communication20220106;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.communication20220106
 * @FileName : ProductTest.java
 * @createTime : 2022/1/6 上午9:15
 * @Email :
 * @Description :经典例题：生产者/消费者问题
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk(0);
        Customer customer1 =new Customer(clerk);
        Customer customer2 =new Customer(clerk);
        Productor productor = new Productor(clerk);
        Thread thread1 = new Thread(customer1);
        Thread thread3 = new Thread(customer2);
        Thread thread2 = new Thread(productor);
        thread2.setName("生产者");
        thread1.setName("消费者1");
        thread3.setName("消费者2");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Clerk{
    private int product = 0;
    Clerk(int product){
        this.product=product;
    }
    public synchronized void toProduct(){
        if(product>=20){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        else{
            product++;
            System.out.println(Thread.currentThread().getName()+"生产第"+product+"个产品");
            notifyAll();
        }
    }
    public synchronized void getProduct(){
        if(product<=0){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        else{
            product--;
            System.out.println(Thread.currentThread().getName()+"拿走了第"+product+"个产品");
            notifyAll();
        }
    }
}


class  Productor implements Runnable{
    private Clerk clerk;
    Productor(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"开始生产产品");
        while (true) {
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            clerk.toProduct();
        }

    }
}class  Customer implements Runnable{
    private Clerk clerk;
    Customer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"开始取走产品");
        while (true) {
            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            clerk.getProduct();
        }
    }

}
