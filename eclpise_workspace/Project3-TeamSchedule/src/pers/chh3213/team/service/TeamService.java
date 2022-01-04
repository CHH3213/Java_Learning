package pers.chh3213.team.service;

import pers.chh3213.team.domain.*;
/**
 *
* TeamService.java
* @Description 关于开发团队成员的管理：添加、删除等。
* @author chh3213
* @version
* @date 2022年1月2日上午9:45:41
 */
public class TeamService {
	private int counter=1;//为静态变量，用来为开发团队新增成员自动生成团队中的唯一ID
	private final int MAX_MEMBER = 5;
	private Programmer[] team = new Programmer[MAX_MEMBER];
	private int total = 0;//记录团队成员的实际人数
    //返回team中所有程序员构成的数组
	public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];

        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
		return team;
	}
	public void addMember(Employee e) throws  TeamException{
		int  p_sum=0;
		int a_sum=0;
		int d_sum=0;
		if(total==MAX_MEMBER)throw new TeamException("成员已满，无法添加");
		for (Programmer programmer : team) {
			if (programmer==e)throw new TeamException("	该员工已在本开发团队中");
			if (programmer instanceof Architect) {
				a_sum++;
//				System.out.println("hha");
			}
			else if(programmer instanceof Designer){
				d_sum++;
//				System.out.println(d_sum);
			}
			else if(programmer instanceof Programmer) {
				p_sum++;
//				System.out.println(p_sum);
			}
		}
//		System.out.println(a_sum);
		if(e instanceof Architect) {
			if(a_sum<1&&total<=MAX_MEMBER) {
//				System.out.println("haha");
				Architect architect =(Architect)e;
				if(architect.getStatus()==Status.VOCATION)throw new TeamException("该员正在休假，无法添加");
				else if(architect.getStatus()==Status.BUSY)throw new TeamException("该员工已是某团队成员");
				architect.setStatus(Status.BUSY);
				architect.setMemberid(counter++);
				team[total++] = architect;
			}
			else {
				throw new TeamException("团队中只能有1名架构师");
			}
		}
		else if(e instanceof Designer) {
			if(d_sum<2&&total<=MAX_MEMBER) {
				Designer designer =(Designer)e;
				if(designer.getStatus()==Status.VOCATION)throw new TeamException("该员正在休假，无法添加");
				else if(designer.getStatus()==Status.BUSY)throw new TeamException("该员工已是某团队成员");
				designer.setStatus(Status.BUSY);
				designer.setMemberid(counter++);
				team[total++] = designer;
			}
			else {
				throw new TeamException("团队中至多只能有二名设计师");
			}
		}
		else if (e instanceof Programmer) {
			if (p_sum<3&&total<=MAX_MEMBER) {
				Programmer programmer = (Programmer)e;
				if(programmer.getStatus()==Status.VOCATION)throw new TeamException("该员正在休假，无法添加");
				else if(programmer.getStatus()==Status.BUSY)throw new TeamException("该员工已是某团队成员");
				programmer.setStatus(Status.BUSY);
				programmer.setMemberid(counter++);
				team[total++] = programmer;
			}
			else {
				throw new TeamException("团队中至多只能有三名程序员");
			}
		}
		else {
			throw new TeamException("该成员不是开发人员，无法添加");
		}

	}
	public void removeMember(int memberid) throws TeamException{
		if(memberid>MAX_MEMBER ||memberid<1 )throw new TeamException("找不到指定memberId的员工，删除失败");

		for (int i = 0; i < total; i++) {
			if(team[i].getMemberid()==memberid) {
				team[i].setStatus(Status.FREE);
				for (int j = i; j < total-1; j++) {
					team[j]=team[j+1];
				}
				team[total-1]=null;
				total--;
				return;
			}
		}

		throw new TeamException("找不到指定memberId的员工，删除失败");

	}
}
