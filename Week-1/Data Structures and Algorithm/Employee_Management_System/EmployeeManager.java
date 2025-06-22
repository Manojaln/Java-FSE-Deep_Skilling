package data;

public class EmployeeManager {
	private Employee[] employees;
    private int count;

    public EmployeeManager(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    // Add employee
    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Added: " + emp);
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    // Search by employeeId
    public Employee searchEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].empId == empId) {
                return employees[i];
            }
        }
        return null;
    }

    // Delete employee by ID
    public void deleteEmployee(int empId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].empId == empId) {
                // Shift elements left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Deleted employee with ID: " + empId);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Display all employees
    public void displayEmployees() {
        if (count == 0) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("Employee List:");
            for (int i = 0; i < count; i++) {
                System.out.println(employees[i]);
            }
        }
    }
}
