package com.employee.employeepayroll.service;

import com.employee.employeepayroll.model.Employee;
import com.employee.employeepayroll.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public Optional<Employee> getById(int id) {
        return repository.findById(id);
    }

    public Employee save(Employee emp) {
        return repository.save(emp);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}