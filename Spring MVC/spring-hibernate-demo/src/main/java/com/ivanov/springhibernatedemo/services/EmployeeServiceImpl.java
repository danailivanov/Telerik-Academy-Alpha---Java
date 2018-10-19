package com.ivanov.springhibernatedemo.services;

import com.ivanov.springhibernatedemo.data.EmployeeRepository;
import com.ivanov.springhibernatedemo.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements  EmployeeService {
    private EmployeeRepository repository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employee getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Employee> getAll() {
        return repository.getAll();
    }
}
