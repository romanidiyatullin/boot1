package com.idiyrom.boot1.dao;

import com.idiyrom.boot1.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(int id);
    public void mergeEmployee(Employee employee);
    public void deleteEmployee(int id);
}
