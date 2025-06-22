package data;
import java.util.*;
public class InventoryManager {
	private Map<Integer , Product> inventory= new HashMap<>();
	//Adding product
	 public void addProduct(Product product) {
	        if (inventory.containsKey(product.getPrdtId())) {
	            System.out.println("Product already exists!");
	        } else {
	            inventory.put(product.getPrdtId(), product);
	            System.out.println("Product added: " + product);
	        }
	    }
	 //Updating product details
	    public void updateProduct(int productId, int quantity, double price) {
	        Product product = inventory.get(productId);
	        if (product != null) {
	            product.setQuantity(quantity);
	            product.setPrice(price);
	            System.out.println("Product updated: " + product);
	        } else {
	            System.out.println("Product not found.");
	        }
	    }
	    //Delete product
	    public void deleteProduct(int productId) {
	        Product removed = inventory.remove(productId);
	        if (removed != null) {
	            System.out.println("Product deleted: " + removed);
	        } else {
	            System.out.println("Product not found.");
	        }
	    }
	    //Displaying product
	    public void displayInventory() {
	        System.out.println("\nInventory:");
	        for (Product p : inventory.values()) {
	            System.out.println(p);
	        }
	    }

}
