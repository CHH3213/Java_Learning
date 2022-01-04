package pers.chh3213.team.service;
/**
 *
* TeamException.java
* @Description 自定义异常类
* @author chh3213
* @version
* @date 2022年1月2日上午9:43:54
* 	成员已满，无法添加
	该成员不是开发人员，无法添加
	该员工已在本开发团队中
	该员工已是某团队成员
	该员正在休假，无法添加
	团队中至多只能有一名架构师
	团队中至多只能有两名设计师
	团队中至多只能有三名程序员

 */
public class TeamException extends Exception{
	static final long serialversionUID = 13465653435L;
	public TeamException(String message) {
		super(message);
	}
}
