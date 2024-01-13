package driver;

import store.AbsProduct;
import store.Deliverable;
import store.LimitedProduct;
import store.NormalProduct;
import store.SpecialProduct;

public class Driver {

	public static void main(String[] args) {
		AbsProduct[] prods = makeProductList();
		System.out.println("---商品リスト---");
		displayProductList(prods);
		
		Deliverable[] delvs = getDeliverable(prods);
		
		System.out.println("---配送可能商品---");
		displayDelivList(delvs);
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
	
	public static Deliverable[] getDeliverable(AbsProduct[] prod) {
		Deliverable[] delvs = new Deliverable[prod.length]; // nullで初期化される
		int idx = 0;
		for(int i = 0; i < prod.length; i++) {
			if(prod[i] instanceof Deliverable) {
				delvs[idx] = (Deliverable)prod[i];
				idx++;
			}
		}
		return delvs;
	}
	
	public static void displayDelivList(Deliverable[] delvs) {
		for(int i = 0; i < delvs.length; i++) {
			if(delvs[i] == null) {
				break;
			}
			delvs[i].displayDeliv();
		}
	}
}
