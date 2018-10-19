package com.ivanov.springhibernatedemo.web;

import com.ivanov.springhibernatedemo.models.Employee;
import com.ivanov.springhibernatedemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable("id") String id) {
        return employeeService.getById(Integer.parseInt(id));
    }
    @GetMapping("/")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @ExceptionHandler
    ResponseEntity<EmployeeError> handleException(NumberFormatException e) {
        return new ResponseEntity <>(
                new EmployeeError(
                        HttpStatus.BAD_REQUEST.value(),
                        "Unable to parse employee id."),
                HttpStatus.BAD_REQUEST);
    }
}
