package pers.chh3213.thread20220105;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.thread20220105
 * @ClassName : BankAccountTest.java
 * @createTime : 2022/1/5 13:04
 * @Email :
 * @Description :使用lock的方式
 */
public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0);
        Customer customer = new Customer(bankAccount);
        Thread t1 = new Thread(customer);
        Thread t2 = new Thread(customer);
        t1.setName("账户1");
        t2.setName("账户2");
        t1.start();
        t2.start();
    }
}

/**
 * lock形式
 */
/*class BankAccount{
    private int money;
    private ReentrantLock lock = new ReentrantLock();
    BankAccount(int money){
        this.money= money;
    }
    public void deposit(int mon){
        lock.lock();
        try {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.money=this.money+mon;
            System.out.println(Thread.currentThread().getName()+"当前账户余额：" + money);
        } finally {
            lock.unlock();
        }
    }
}*/
/**
 * 同步代码块
 */
class BankAccount{
    private int money ;
    BankAccount(int money){
        this.money=money;
    }
    public void deposit(int mon){
        synchronized (this){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            money+=mon;
            System.out.println(Thread.currentThread().getName()+"当前账户余额：" + money);
        }
    }
}


/**
 * 同步方法：
 */
/*class BankAccount{
    private int money ;
    BankAccount(int money){
        this.money=money;
    }
    public synchronized void deposit(int mon){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        money+=mon;
        System.out.println(Thread.currentThread().getName()+"当前账户余额：" + money);

    }
}*/
class Customer implements Runnable{
    private BankAccount bankAccount;
    Customer(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        int i=0;
        while (i<3) {
            bankAccount.deposit(1000);
            i++;
        }
    }

}
