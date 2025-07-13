package com.example.restcrud.controller;

import com.example.restcrud.exception.EmployeeNotFoundException;
import com.example.restcrud.model.Employee;
import com.example.restcrud.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @PutMapping
    public void updateEmployee(@RequestBody @Valid Employee employee) throws EmployeeNotFoundException {
        service.update(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) throws EmployeeNotFoundException {
        service.delete(id);
    }
}
