package com.example.restcrud.service;

import com.example.restcrud.dao.EmployeeDao;
import com.example.restcrud.exception.EmployeeNotFoundException;
import com.example.restcrud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao dao;

    public List<Employee> getAll() {
        return dao.getAll();
    }

    public void update(Employee emp) throws EmployeeNotFoundException {
        dao.updateEmployee(emp);
    }

    public void delete(int id) throws EmployeeNotFoundException {
        dao.deleteEmployee(id);
    }
}
