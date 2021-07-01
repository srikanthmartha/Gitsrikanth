package inerfaces;

public class home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phone ph = new samsung();
		System.out.println(ph.processor());
		phone ph1 = new iphone();
		System.out.println(ph1.os());
	}

}
