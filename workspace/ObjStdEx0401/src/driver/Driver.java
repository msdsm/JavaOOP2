package driver;

import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		SpecialProduct sp = new SpecialProduct("特化キーボード", 3600, 4500);
		sp.display();//super class
		sp.displayOrgPrice();//sub class
	}

}