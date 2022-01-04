package pers.chh3213.team.domain;

public class Architect extends Designer{
	private int stock;//表示公司奖励的股票数量
	public Architect(int id,String name,int age,double salary,Equipment equipment,double bonus,int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}