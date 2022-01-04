package pers.chh3213.team.domain;

import pers.chh3213.team.service.Status;

public class Programmer extends Employee{
	private int memberid;//用来记录成员加入开发团队后在团队中的ID
	private Status status=Status.FREE;
	private Equipment equipment;
	public Programmer(int id,String name,int age,double salary,Equipment equipment) {
		// TODO Auto-generated constructor stub
		super(id, name, age, salary);
		this.equipment = equipment;
//		this.memberid = id;

	}
	public Equipment getEquipment() {
		return equipment;
	}
	public int getMemberid() {
		return memberid;
	}
	public Status getStatus() {
		return status;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}
	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}
