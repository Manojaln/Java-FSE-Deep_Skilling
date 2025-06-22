package dependency;
import java.util.*;
public class CustomerRepositoryImpl implements CustomerRepository{

    private Map<Integer, String> customerData = new HashMap<>();
    public CustomerRepositoryImpl() {
        // Sample data
        customerData.put(1, "Manoj V");
        customerData.put(2, "Priya R");
        customerData.put(3, "Kumar S");
    }

    @Override
    public String findCustomerById(int id) {
        return customerData.getOrDefault(id, "Customer Not Found");
    }
}
