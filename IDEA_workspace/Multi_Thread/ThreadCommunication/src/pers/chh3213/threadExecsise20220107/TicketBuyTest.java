package src.pers.chh3213.threadExecsise20220107;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : src.pers.chh3213.threadExecsise20220107
 * @FileName : TicketBuyTest.java
 * @createTime : 2022/1/7 上午9:24
 * @Email :
 * @Description :模拟 3 个人排队买票，每人买 1 张票。售货员只有 1 张五元的钱，
 * 电影票 5 元一张，王大拿拿一张二十元的人民币排在
 * 谢大脚前面买票，谢大脚拿 1 张十元的人民币排在在赵四的
 * 前面买票，赵四拿 1 张五元的人民币排在最后。即最终的卖
 * 票次序是：谢大脚、赵四、王大拿
 */
public class TicketBuyTest {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Man person1 = new Man("王大拿",20,seller);
        Man person2 = new Man("谢大脚",10,seller);
        Man person3 = new Man("赵四",5,seller);
        person1.start();
        person2.start();
        person3.start();

    }
}

class Man extends Thread{
    private String name;
    private int money;
    private static Seller seller;//用static,确保每个人的锁是一致的，且只有一把锁
    private boolean got_ticket=false;
    public Man(String name,int money, Seller seller){
        this.name = name;
        this.money = money;
        this.seller = seller;
    }
    @Override
    public void run(){
        while(!got_ticket){
            Thread.currentThread().setName(name);
            synchronized (seller){
                if(seller.sellTicket(money)){
                    try {
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"买到一张票");
                    got_ticket=true;
                }

            }
        }
    }


}
class Seller{
    private int money = 5;
    private  final int TICKET_PRICE = 5;
    public boolean sellTicket(int customer_money){
        if(money>=(customer_money-TICKET_PRICE)){
            money += TICKET_PRICE;
            System.out.println("卖票！！");
            return true;
        }
        else{
            return false;
        }
    }
}