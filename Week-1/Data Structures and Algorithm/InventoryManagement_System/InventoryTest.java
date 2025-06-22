package data;

public class InventoryTest {
	 public static void main(String[] args) {
	        InventoryManager manager = new InventoryManager();
	        // Add products
	        manager.addProduct(new Product(101, "Laptop", 10, 75000));
	        manager.addProduct(new Product(102, "Keyboard", 50, 500));
	        manager.addProduct(new Product(103, "Mouse", 40, 300));
	        manager.displayInventory();
	        // Update a product
	        manager.updateProduct(102, 45, 480);
	        // Delete a product
	        manager.deleteProduct(103);
	       manager.displayInventory();
	    }
}
