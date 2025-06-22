package data;

public class Employee {
	int empId;
	String empName;
	String position;
	double salary;
	public Employee(int empId, String empName, String position, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.position = position;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", position=" + position + ", salary=" + salary
				+ "]";
	}
	
}
