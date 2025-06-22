package data;

public class MainEmpTes {
	public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);  // array with fixed size 5
        manager.addEmployee(new Employee(101, "Manoj", "Developer", 50000));
        manager.addEmployee(new Employee(102, "Anjali", "Tester", 40000));
        manager.addEmployee(new Employee(103, "Suresh", "Manager", 75000));
        System.out.println();
        manager.displayEmployees();
        System.out.println();

        Employee found = manager.searchEmployee(102);
        System.out.println(found != null ? "Found: " + found : "Not Found");

        manager.deleteEmployee(102);
        System.out.println();

        manager.displayEmployees();
    }
}
