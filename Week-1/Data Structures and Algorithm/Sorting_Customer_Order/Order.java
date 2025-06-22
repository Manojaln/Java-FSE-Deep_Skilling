package sortdata;

public class Order {
	int orderId;
	String customerName;
	double tp;
	//Generating parameterized constructor
	public Order(int orderId, String customerName, double tp) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.tp = tp;
	}
	//Generating to string method
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", tp=" + tp + "]";
	}
	
}
