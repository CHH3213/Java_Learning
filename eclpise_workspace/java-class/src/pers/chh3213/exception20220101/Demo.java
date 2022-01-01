package pers.chh3213.exception20220101;

class Exc0 extends Exception {
}

class Exc1 extends Exc0 {
}

class Demo {
	public static void main(String[] args) {
		try {
			throw new Exc1();
		}catch (Exc0 e) {
			System.out.println("Exc0");
		}
		 catch (Exception e) {
				System.out.println("Exception");
			} 
	}
}
