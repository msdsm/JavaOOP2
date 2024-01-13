package driver;

import store.AbsProduct;
import store.LimitedProduct;
import store.NormalProduct;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		AbsProduct[] prods = makeProductList();
		displayProductList(prods);
	}
	
	public static AbsProduct[] makeProductList() {
		AbsProduct[] prods = {
				new LimitedProduct("マウス", 2000, 10),
				new SpecialProduct("特化キーボード", 3600, 4500),
				new LimitedProduct("Webカメラ", 3900, 7),
				new NormalProduct("マイク", 2800),
				new SpecialProduct("ディスプレイ", 15000, 20000),
				new NormalProduct("LED証明", 4200)
		};
		return prods;
	}
	
	public static void displayProductList(AbsProduct[] absProd) {
		for(int i = 0; i < absProd.length; i++) {
			absProd[i].display();
		}
		return;
	}
}
