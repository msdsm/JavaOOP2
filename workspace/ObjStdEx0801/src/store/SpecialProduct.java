package store;

public class SpecialProduct extends AbsProduct implements Deliverable{
	
	private int orgPrice;
	
	public SpecialProduct(String name, int price, int orgPrice) {
		super(name, price);
		this.orgPrice = orgPrice;
	}
	
	@Override
	public void display() {
		System.out.println(super.getNameAndPrice() + "(定価 : " + this.orgPrice + "円)");
	}
	
	@Override
	public void displayDeliv() {
		System.out.println("【*特別送料300円*】" + super.getNameAndPrice());
	}
}
