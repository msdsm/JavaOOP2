package store;

public class Product {
	private static final String STORE_NAME = "速水PC直売店";
	private static final int DEFAULT_CHANGE_AMT = 1000;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Product(String name) {
		this(name, 0);
	}
	
	public static void displayStoreName() {
		System.out.println(STORE_NAME);
	}
	
	public int up(int amt) {
		this.price += amt;
		return this.price;
	}
	
	public int up() {
		return this.up(DEFAULT_CHANGE_AMT);
	}
	
	public int down(int amt) {
		this.price -= amt;
		return this.price;
	}
	
	public int down() {
		return this.down(DEFAULT_CHANGE_AMT);
	}
	
	public void display() {
		System.out.println(this.name + " : " + this.price);
	}
}
