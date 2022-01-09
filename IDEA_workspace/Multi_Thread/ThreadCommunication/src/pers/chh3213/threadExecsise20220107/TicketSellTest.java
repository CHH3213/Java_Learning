package src.pers.chh3213.threadExecsise20220107;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : chh3213
 * @version : 1.0
 * @Project : Multi_Thread
 * @Package : pers.chh3213.threadExecsise20220107
 * @FileName : TicketSellTest.java
 * @createTime : 2022/1/7 上午8:52
 * @Email :
 * @Description :实现一个由 A、B、C 三个窗口同时销售 100 张票的系统，
 * 要求打印出每个窗口打印的售票情况，并且每个窗口不得连
 * 续售票。
 */
public class TicketSellTest {
    public static void main(String[] args) {
    	TicketSystem t = new TicketSystem();
    	Thread t1 = new Thread(t);
    	Thread t2 = new Thread(t);
    	Thread t3 = new Thread(t);
    	t1.setName("A");
    	t2.setName("B");
		t3.setName("C");
		t1.start();
		t2.start();
		t3.start();
	}
}

class TicketSystem implements Runnable{
	private int ticket = 100;
	public void run(){
			while(ticket>0){
				synchronized(this){
					notify();
					System.out.println(Thread.currentThread().getName()+" 售卖第 " + ticket + " 张票");
					ticket--;
				try{
					wait();
				}catch(InterruptedException e){
					System.out.println("出现异常");

				}
			}
		}
	}
}
