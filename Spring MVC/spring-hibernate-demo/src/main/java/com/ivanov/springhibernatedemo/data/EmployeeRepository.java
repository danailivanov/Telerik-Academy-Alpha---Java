package com.ivanov.springhibernatedemo.data;

import com.ivanov.springhibernatedemo.models.Employee;


import java.util.List;

public interface EmployeeRepository {
    Employee getById(int id);
    List<Employee> getAll();

}
