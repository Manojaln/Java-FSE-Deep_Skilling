package com.example.restcrud.dao;

import com.example.restcrud.exception.EmployeeNotFoundException;
import com.example.restcrud.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeDao {
    private static final Map<Integer, Employee> employees = new HashMap<>();

    public List<Employee> getAll() {
        return new ArrayList<>(employees.values());
    }

    public void updateEmployee(Employee employee) throws EmployeeNotFoundException {
        if (!employees.containsKey(employee.getId())) {
            throw new EmployeeNotFoundException("Employee not found with id: " + employee.getId());
        }
        employees.put(employee.getId(), employee);
    }

    public void deleteEmployee(int id) throws EmployeeNotFoundException {
        if (!employees.containsKey(id)) {
            throw new EmployeeNotFoundException("Employee not found with id: " + id);
        }
        employees.remove(id);
    }
}
