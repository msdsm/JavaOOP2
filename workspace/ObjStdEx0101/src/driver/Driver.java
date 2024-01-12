package driver;

import store.Product;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Product.displayStoreName();
		
		Product key = new Product("キーボード", 4500);
		Product mouse = new Product("マウス", 2000);
		
		key.down();
		mouse.up(500);
		
		key.display();
		mouse.display();
	}

}
