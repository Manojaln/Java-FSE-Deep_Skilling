package com.data;

public class MainTest {
	 public static void main(String[] args) {
	      Product[] products = {
	            new Product(101, "Laptop", "Electronics"),
	          new Product(102, "Phone", "Electronics"),
	          new Product(103, "Table", "Furniture"),
	          new Product(104, "Shirt", "Clothing"),
	           new Product(105, "Shoes", "Footwear")
	        };

	        String searchKey = "Table";
	        // Search using linear search algorithm 
	        System.out.println("Linear Search:");
	        Product result1 = LinearSearch.lineraSearch(products, searchKey);
	        System.out.println(result1 != null ? "Found: " + result1 : "Not Found");
	     // Search using binary search algorithm 
	        System.out.println("\n Binary Search:");
	        Product result2 = BinarySearch.binarySearch(products, searchKey);
	        System.out.println(result2 != null ? "Found: " + result2 : "Not Found");
	    }
}
 