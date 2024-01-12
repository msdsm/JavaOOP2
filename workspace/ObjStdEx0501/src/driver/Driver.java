package driver;

import store.Product;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		Product mouse = new Product("マウス", 2000);
		mouse.display();
		
		SpecialProduct sp = new SpecialProduct("特化キーボード", 3600, 4500);
		sp.display();//Override
	}

}