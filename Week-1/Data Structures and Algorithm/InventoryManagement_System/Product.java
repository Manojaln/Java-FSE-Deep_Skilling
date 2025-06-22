package data;

public class Product {
	private int prdtId;
	private String prdName;
	private int quantity;
	private double price;
	public Product(int prdtId, String prdName, int quantity, double price) {
		super();
		this.prdtId = prdtId;
		this.prdName = prdName;
		this.quantity = quantity;
		this.price = price;
	}
	//Generating getter setter in eclipse by rightclick->source->generate getter and setter
	public int getPrdtId() {
		return prdtId;
	}
	public void setPrdtId(int prdtId) {
		this.prdtId = prdtId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//and also generating to string method in eclipse with shortcut
	@Override
	public String toString() {
		return "Product [prdtId=" + prdtId + ", prdName=" + prdName + ", quantity=" + quantity + ", price=" + price
				+ "]";
	}
	
	
}
