package driver;

import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		SpecialProduct sp = new SpecialProduct();
		sp.setName("特化キーボード");
		sp.setPrice(3600);
		sp.setOrgPrice(4500);
		sp.display();//super class
		sp.displayOrgPrice();//sub class
	}

}