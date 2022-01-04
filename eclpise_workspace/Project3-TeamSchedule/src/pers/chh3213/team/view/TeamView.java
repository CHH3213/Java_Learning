package pers.chh3213.team.view;
import pers.chh3213.team.domain.*;
import pers.chh3213.team.service.*;
/**
 *
* TeamView.java
* @Description 按照设计要求编写TeamView类，逐一实现各个方法，并编译;执行main方法中，测试软件全部功能
* @author chh3213
* @version
* @date 2022年1月2日上午9:57:13
 */
public class TeamView {
	private NameListService listSvc = new NameListService();
	private TeamService teamSvc = new TeamService();

	public void enterMainMenu() {
		while (true) {
			listAllEmployees();//以表格形式列出公司所有成员
			System.out.println("1-团队列表  2-添加团队成员  3-删除团队成员  4-退出  请选择（1-4）：");
			char choice= TSUtility.readMenuSelection();
			switch (choice) {
			case '1': {
				getTeam();
				break;
			}
			case '2':{
				addMember();
				break;
			}
			case '3': {
				deleteMember();
				break;
			}
			case '4':{
				System.out.println("是否退出？(Y/N)：");
				char confirm = TSUtility.readConfirmSelection();
				if(confirm=='Y')System.exit(0);
				else {
					break;
				}
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
	}
	public void listAllEmployees() {//以表格形式列出公司所有成员
		System.out.println("=====================开发团队调度软件===================================================");
		System.out.println("ID     姓名      年龄    工资         职位      状态      奖金        股票     领用设备\r\n");
		Employee[] employees= listSvc.getAllEmployees();
		for (int i = 0; i < employees.length; i++) {

			if (employees[i] instanceof Architect) {
				Architect architect = (Architect)employees[i] ;
				System.out.println(architect.getId()+"\t"+architect.getName()+"\t"+architect.getAge()+"\t"+architect.getSalary()+"\t  "+"架构师\t  "+architect.getStatus()+"\t  "+architect.getBonus()+"\t"+architect.getStock());
			}
			else if (employees[i] instanceof Designer) {
				Designer designer = (Designer)employees[i] ;
				System.out.println(designer.getId()+"\t"+designer.getName()+"\t"+designer.getAge()+"\t"+designer.getSalary()+"\t  "+"设计师\t  "+designer.getStatus()+"\t  "+designer.getBonus()+"\t"+"\t"+designer.getEquipment().getDescription());

			}

			else if (employees[i] instanceof Programmer) {
				Programmer p = (Programmer)employees[i] ;
				System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getAge()+"\t"+p.getSalary()+"\t  "+"程序员\t  "+p.getStatus()+"\t\t\t\t"+p.getEquipment().getDescription());
			}
			else if(employees[i] instanceof Employee) {
				Employee e = (Employee)employees[i] ;
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getAge()+"\t"+e.getSalary()+"\t");
			}
		}
		System.out.println("=======================================================================================");

	}
	private void getTeam() {//显示团队成员列表操作
		Programmer[] programmers =  teamSvc.getTeam();
		if(programmers.length==0)	System.out.println("开发团队目前没有成员！");
		else {
			System.out.println("=========================团队成员列表==========================================");
			System.out.println("TDI/ID  姓名    年龄      工资       职位      奖金          股票");
			for (int i = 0; i < programmers.length; i++) {
				if (programmers[i] instanceof Architect) {
					Architect architect = (Architect)programmers[i] ;
					System.out.println(architect.getMemberid()+"/"+architect.getId()+"\t"+architect.getName()+"\t"+architect.getAge()+"\t"+architect.getSalary()+"\t  "+"架构师\t  "+architect.getBonus()+"\t"+architect.getStock());
				}
				else if (programmers[i] instanceof Designer) {
					Designer designer = (Designer)programmers[i] ;
					System.out.println(designer.getMemberid()+"/"+ designer.getId()+"\t"+designer.getName()+"\t"+designer.getAge()+"\t"+designer.getSalary()+"\t  "+"设计师\t  "+designer.getBonus()+"\t"+"\t");
	
				}
	
				else if (programmers[i] instanceof Programmer) {
					Programmer p = (Programmer)programmers[i] ;
					System.out.println(p.getMemberid()+"/"+ p.getId()+"\t"+p.getName()+"\t"+p.getAge()+"\t"+p.getSalary()+"\t  "+"程序员\t  ");
				}
			}
		}
		System.out.println("==============================================================================");
		
		TSUtility.readReturn();
		


	}
	private void addMember() {//实现添加成员操作
		System.out.println("请输入要添加员工的 ID:");
		int id =TSUtility.readInt();
		try {
		teamSvc.addMember(listSvc.getEmployee(id-1));
		System.out.println("添加成功");
		}
		catch (TeamException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		TSUtility.readReturn();

	}
	private void deleteMember() {//实现删除成员操作
		System.out.println("请输入要删除员工的Team ID:");
		int i =TSUtility.readInt();
		System.out.println("确认是否删除?(Y/N)");
		char confirm =  TSUtility.readConfirmSelection();
		if(confirm=='y'||confirm=='Y') {
			try {
				teamSvc.removeMember(i);
				System.out.println("删除成功");
			} catch (TeamException e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}
			TSUtility.readReturn();
		}

	}
	public static void main(String[] args) {
		TeamView teamView = new TeamView();
		teamView.enterMainMenu();

	}
}
