package pers.chh3213.classLearn20211230;

public abstract class Employee {
	private String name;
	private int number;
	private MyDate birthday;
	public abstract double earnings();
	public MyDate getBirthday() {
		return birthday;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public Employee(String name,int number,MyDate birthday) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.number = number;
		this.birthday=birthday;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return name+" "+number+" "+birthday.toDateString();
	}
}

class MyDate{
	private int year;
	private int month;
	private int day;
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public MyDate(int year,int month, int day) {
		// TODO Auto-generated constructor stub
		this.year=year;
		this.month=month;
		this.day=day;

	}
	public String toDateString() {
		return year+"年"+month+"月"+day+"日";
	}
}

class SalariedEmployee extends Employee{
	private double monthlySalary;
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public SalariedEmployee(String name,int number,MyDate birthday,double monthlySalary) {
		super(name,number,birthday);
		this.monthlySalary = monthlySalary;
	}
	public  double earnings() {
		return monthlySalary;
	}
	public String toString() {
		return "SalariedEmployee "+super.toString();
	}
}
class HourlyEmployee extends Employee{
	private double wage;
	private double hour;
	public double getHour() {
		return hour;
	}
	public double getWage() {
		return wage;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}

	public HourlyEmployee(String name,int number,MyDate birthday,double wage,double hour) {
		super(name,number,birthday);
		this.wage=wage;
		this.hour=hour;
	}
	public  double earnings() {
		return wage*hour;
	}
	public String toString() {
		return "HourlyEmployee "+super.toString();
	}
}
