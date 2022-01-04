
package pers.chh3213.team.service;
/**
 *
* Status.java
* @Description Status类--封装员工的状态
* @author chh3213
* @version
* @date 2022年1月2日上午9:27:23
 */
public class Status {
	private final String NAME;
	private Status(String NAME) {
		this.NAME = NAME;
	}
	public static final Status FREE = new Status("FREE");
	public static final Status VOCATION = new Status("VOCATION");
	public static final Status BUSY = new Status("BUSY");
	public String getNAME() {
		return NAME;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return NAME;
	}
}
