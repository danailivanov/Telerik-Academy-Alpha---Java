package com.ivanov.springhibernatedemo.services;

import com.ivanov.springhibernatedemo.models.Employee;

import java.util.List;

public interface EmployeeService {

    Employee getById(int id);
    List<Employee> getAll();
}
