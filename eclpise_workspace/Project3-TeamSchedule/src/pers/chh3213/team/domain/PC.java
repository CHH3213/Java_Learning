package pers.chh3213.team.domain;

public class PC implements Equipment{
	private String model;
	private String display;
	public PC(String model,String display) {
		this.model = model;
		this.display = display;
	}
	public String getDisplay() {
		return display;
	}
	public String getModel() {
		return model;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String getDescription() {
		String description = model+"("+display+")";
		return description;
	}

}