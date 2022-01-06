package pers.chh3213.communication20220106;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.communication20220106
 * @FileName : AccountTest.java
 * @createTime : 2022/1/6 上午9:46
 * @Email :
 * @Description :模拟银行取钱的问题
 */
class Account {
    private String name;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    Account(){

    }
    Account(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
    public String toString(){
        return "Account[name="+name+",balance="+balance+"]";
    }
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 :
                name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(balance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(balance) !=
                Double.doubleToLongBits(other.balance))
            return false;
        return true;
    }
}


class XiaoMing implements Runnable{
    private Account account;
    private double withdraw;
    XiaoMing(Account account,double amt){
        this.account =account;
        this.withdraw = amt;
    }
    @Override
    public  void run(){
        synchronized (account) {//锁别加错
            if (account.getBalance() > withdraw) {
                System.out.println(Thread.currentThread().getName() + "取款成功，金额为：+" + withdraw);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setBalance(account.getBalance() - withdraw);
            } else {
                System.out.println("取款失败,当前余额为：" + account.getBalance());
            }
        }
    }
}

class WithDrawThread extends Thread {
    Account account;
    // 要取款的额度
    double withDraw;
    public WithDrawThread(String name, Account account, double amt) {
        super(name);
        this.account = account;
        this.withDraw = amt;
    }
    public void run() {
        synchronized (account) {
            if (account.getBalance() > withDraw) {
                System.out.println(Thread.currentThread().getName() + ":取款成功，取现的金额为：" + withDraw);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setBalance(account.getBalance() - withDraw);
            } else {
                System.out.println("取现额度超过账户余额，取款失败");
            }
            System.out.println("现在账户的余额为：" + account.getBalance());
        }
    }
}

public  class AccountTest {
    public static void main(String[] args) {
        Account account = new Account("1111",10000);
        XiaoMing xiaoMing = new XiaoMing(account,8000);
        XiaoMing xiaoMingWife = new XiaoMing(account,8000);
        Thread t1 = new Thread(xiaoMing);
        Thread t2 = new Thread(xiaoMingWife);
        t1.setName("小明");
        t2.setName("小明's wife");
        t1.start();
        t2.start();
    }
}
