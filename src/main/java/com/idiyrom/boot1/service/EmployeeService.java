package com.idiyrom.boot1.service;

import com.idiyrom.boot1.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public void mergeEmployee(Employee employee);
    public void deleteEmployee(int id);
}
