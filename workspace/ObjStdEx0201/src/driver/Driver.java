package driver;

import store.Product;

public class Driver {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Product.displayStoreName();
		
		Product key = new Product("キーボード");
		System.out.println("getPrice()の結果 : "+key.getPrice());
		
		key.setPrice(2800);
		System.out.println("---再設定後---");
		key.display();
	}

}