package pers.chh3213.classLearn20220101exercise;
interface Sound {
	public void print();
}

public class CellPhone {
	public void alarmClock(Bell bell) {
		bell.print();
	}
	class Bell implements Sound{
		public void print() {};
	}
	public static void main(String[] args) {
		CellPhone phone = new CellPhone();
		phone.alarmClock(phone.new Bell() {
			public void print() {
				System.out.println("getup");
			}
		});
	}
}
