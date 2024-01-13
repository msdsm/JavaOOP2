package driver;

import store.Product;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		Product[] prods = {
			new Product("マウス", 2000),
			new SpecialProduct("特化キーボード", 3600, 4500)//アップキャスト、暗黙的
		};
		
		for(int i = 0; i < prods.length; i++) {
			prods[i].display(); //i=1でダイナミックバインディング
		}
	}

}