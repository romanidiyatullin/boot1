package com.idiyrom.boot1.controller;

import com.idiyrom.boot1.entity.Employee;
import com.idiyrom.boot1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller1 {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/api/all")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/api/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return  employeeService.getEmployeeById(id);
    }

    @PostMapping("/api/add")
    public void mergeEmployee(@RequestBody Employee employee){
        employeeService.mergeEmployee(employee);
    }

    @DeleteMapping("/api/delete/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
