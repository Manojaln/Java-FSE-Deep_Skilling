package com.data;
import java.util.*;
public class BinarySearch {
	 public static Product binarySearch(Product[] products, String keyName) {
		 // here I tell java to compare with the product name as it will throw error (ClassCastException )if not mentioned 
	        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
	        // lb is lower bound index and up is upper bound index
	     int lb = 0, ub = products.length - 1;
	       while (lb <= ub) {
	            int mid = (lb + ub) / 2;
	            int cmp = keyName.compareToIgnoreCase(products[mid].productName);
	            if (cmp == 0) return products[mid];
	            else if (cmp < 0) ub = mid - 1;
	            else lb = mid + 1;
	        }
	        	return null;
	    }
}
