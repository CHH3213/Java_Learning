package src.pers.chh3213.threadExecsise20220107;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : src.pers.chh3213.threadExecsise20220107
 * @FileName : Pra.java
 * @createTime : 2022/1/7 上午10:45
 * @Email :
 * @Description :
 */
/**
 * 模拟3个人排除买票，每人买1张票。
 * 售货员只有1张五元的钱，电影票5元一张，
 * 王大拿拿一张二十元的人民币排在谢大脚前面买票，
 * 谢大脚拿1张十元的人民币排在在赵四的前面买票，
 * 赵四拿1张五元的人民币排在最后。
 * 即最终的卖票次序是：谢大脚、赵四、王大拿
 *
 * @author zmx
 * @create 2021-10-17-14:59
 */
class Clerk{

    private int clerkMoney = 5;//店员的本金
    private final int PRICE = 5;//电影票的价格

    public boolean sell(int money){

        if (clerkMoney >= (money - PRICE)) {//判断店员的钱是否能够找零
            clerkMoney += PRICE;
            return true;
        } else {
            return false;
        }
    }
}

class Person extends Thread{

    private static Clerk clerk;//用static,确保每个人的锁是一致的，且只有一把锁
    private int money;//每个人的钱
    private int ticket = 0;//确定票数目，如果有票就跳出循环

    public Person(int money,Clerk clerk){
        this.money = money;
        this.clerk = clerk;
    }

    @Override
    public void run() {

        while(ticket == 0){

            synchronized(clerk) {

                if (clerk.sell(money)) {

                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "买到一张票！");
                    ticket++;
                }
            }
        }
    }
}

public class Pra{
    public static void main(String[] args){

        Clerk clerk = new Clerk();

        Person p1 = new Person(20,clerk);
        Person p2 = new Person(10,clerk);
        Person p3 = new Person(5,clerk);

        p1.setName("王大拿");
        p2.setName("谢大脚");
        p3.setName("赵四");

        p1.start();
        p2.start();
        p3.start();
    }
}