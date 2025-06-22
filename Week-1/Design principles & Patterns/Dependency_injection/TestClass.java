package dependency;

public class TestClass {
	 public static void main(String[] args) {
	        // Create repository
	        CustomerRepository repository = new CustomerRepositoryImpl();
	        // Inject repository into service
	        CustomerService service = new CustomerService(repository);
	        // Use service
	        service.displayCustomer(1);
	        service.displayCustomer(3);
	        service.displayCustomer(5); // Not found
	    }
}
