package pers.chh3213.team.service;

import java.util.Iterator;

import pers.chh3213.team.domain.*;
/**
 *
* NameListService.java
* @Description 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。

* @author chh3213
* @version 1.0 将data数据写入的方式太粗暴
* @date 2022年1月2日上午9:44:19
 */
public class NameListService {

	private Employee[] employees;
	public NameListService() {
		employees = new Employee[Data.EMPLOYEES.length];
		Equipment[] equipments = new Equipment[Data.EQUIPMENTS.length];
		for (int i = 0; i < equipments.length; i++) {
			String type =  Data.EQUIPMENTS[i][0];
			switch (type) {
			case "21": {
				equipments[i]= new PC(Data.EQUIPMENTS[i][1], Data.EQUIPMENTS[i][2]);
				break;
			}
			case "22":{
				equipments[i]= new NoteBook(Data.EQUIPMENTS[i][1],Double.parseDouble(Data.EQUIPMENTS[i][2]));
				break;
			}
			case "23":{
				equipments[i]= new Printer(Data.EQUIPMENTS[i][1],Data.EQUIPMENTS[i][2]);
				break;
			}
			default:
				equipments[i]=null;
				break;
			}
		}
		for (int i = 0; i < employees.length; i++) {
			String type =  Data.EMPLOYEES[i][0];
			switch (type) {
			case "10": {
				employees[i]= new Employee(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2],Integer.parseInt(Data.EMPLOYEES[i][3]),Double.parseDouble(Data.EMPLOYEES[i][4]));
				break;
			}
			case "11":{
				employees[i]= new Programmer(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2],Integer.parseInt(Data.EMPLOYEES[i][3]),Double.parseDouble(Data.EMPLOYEES[i][4]),equipments[i]);
				break;
			}
			case "12":{
				employees[i]= new Designer(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2],Integer.parseInt(Data.EMPLOYEES[i][3]),Double.parseDouble(Data.EMPLOYEES[i][4]),equipments[i],Double.parseDouble(Data.EMPLOYEES[i][5]));
				break;
			}
			case "13":{
				employees[i]= new Architect(Integer.parseInt(Data.EMPLOYEES[i][1]),Data.EMPLOYEES[i][2],Integer.parseInt(Data.EMPLOYEES[i][3]),Double.parseDouble(Data.EMPLOYEES[i][4]),equipments[i],Double.parseDouble(Data.EMPLOYEES[i][5]),Integer.parseInt(Data.EMPLOYEES[i][6]));
				break;
			}

			default:
				break;
			}
		}

	}
	public Employee[] getAllEmployees() {
		return employees;
	}
	public Employee getEmployee(int id) throws TeamException {
		if(id<Data.EMPLOYEES.length &&id>=0&& employees[id]!=null)return employees[id];
		else{
			throw new TeamException("找不到指定的员工");
		}

	}
	public static void main(String[] args) {
		NameListService nameListService = new NameListService();
		Employee[] e = nameListService.getAllEmployees();
		for (int i = 0; i < e.length; i++) {
//			System.out.println(e[i].getClass());
			System.out.println(e[i].getId());
//			if(e[i] instanceof Architect) {
////				System.out.println("hha");
//				Architect architect = (Architect)e[i];
//				System.out.println(architect.getStatus());
//			}
		}

	}
}
