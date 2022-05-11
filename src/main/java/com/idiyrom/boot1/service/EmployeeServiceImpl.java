package com.idiyrom.boot1.service;

import com.idiyrom.boot1.dao.EmployeeDAO;
import com.idiyrom.boot1.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    @Transactional
    public void mergeEmployee(Employee employee) {
        employeeDAO.mergeEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
}
