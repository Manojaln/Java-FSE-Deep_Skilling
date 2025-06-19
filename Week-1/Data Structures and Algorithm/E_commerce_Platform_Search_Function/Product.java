package com.data;

public class Product {
	int productId;
	String productName;
	String category;
	/* here i directly generated the parameterized constructor and tostring method 
	as I use Eclipse IDE it's easy to generate these kind of methods*/
	
	public Product(int productId, String productName, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category + "]";
	}
	
	
}
