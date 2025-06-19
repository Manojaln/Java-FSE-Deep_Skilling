package com.data;

public class LinearSearch {
	public static Product lineraSearch(Product[] products, String keyName) {
		for(Product product:  products) {
			if(product.productName.equalsIgnoreCase(keyName)) {
				return product;
			}
		}
		return null;
	}
	
}	
 