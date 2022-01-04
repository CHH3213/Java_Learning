package pers.chh3213.team.domain;
import pers.chh3213.team.service.*;
import pers.chh3213.team.view.*;

/**
 *
* Employee.java
* @Description Employee类及其子类的设计
* @author chh3213
* @version 1.0
* @date 2022年1月2日上午9:15:07
 */
public class Employee {
	private int id;
	private String name;
	private int age;
	private double salary;
	public Employee(int id,String name,int age,double salary) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.id = id;
		this.name =name;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}





