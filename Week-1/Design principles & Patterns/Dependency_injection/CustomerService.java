package dependency;

public class CustomerService {
	private CustomerRepository repository;
    // Constructor Injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }
    public void displayCustomer(int id) {
        String customer = repository.findCustomerById(id);
        System.out.println("Customer Details: " + customer);
    }
}
