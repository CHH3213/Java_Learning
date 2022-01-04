package pers.chh3213.team.domain;

public class NoteBook implements Equipment{
	private String model;
	private double price;
	public NoteBook(String model,double price) {
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		String description = model+"("+price+")";
		return description;
	}

}
