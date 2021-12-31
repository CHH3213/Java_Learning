//package pers.chh3213.classLearn20211231;
//
//interface Playable {
//	void play();
//}
//interface Bounceable {
//	void play();
//}
//interface Rollable extends Playable, Bounceable {
//	Ball ball= new Ball("PingPang"); //省略了 public static final
//}
//public class Ball implements Rollable {
//	private String name;
//	public String getName() {
//		return name;
//	}
//	public Ball(String name) {
//		this.name= name;
//	}
//	public void play() {
//		ball = new Ball("Football"); //The final field Rollable.ball cannot be assigned
//		System.out.println(ball.getName());
//	}
//}
