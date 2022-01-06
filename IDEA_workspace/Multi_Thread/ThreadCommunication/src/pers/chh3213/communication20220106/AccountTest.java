package pers.chh3213.communication20220106;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.communication20220106
 * @FileName : Account.java
 * @createTime : 2022/1/6 上午9:46
 * @Email :
 * @Description :模拟银行取钱的问题
 */
public class Account {
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
    

}

class XiaoMing extends Account implements Runnable{
    XiaoMing(String name,double balance){
        super(name,balance);
    }
    @Override
    public synchronized void run(){
        if(super.getBalance()>0){

        }
    }
}
