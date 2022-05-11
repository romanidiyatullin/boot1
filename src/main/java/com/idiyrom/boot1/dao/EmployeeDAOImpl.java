package com.idiyrom.boot1.dao;

import com.idiyrom.boot1.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    @Autowired
    EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployees() {
        Query query = entityManager.createQuery("from Employee");
        return query.getResultList();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return entityManager.find(Employee.class,id);
    }

    @Override
    public void mergeEmployee(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        Query query = entityManager.createQuery("delete from Employee " +
                "where id =:employeeId");
        query.setParameter("employeeId",id);
        query.executeUpdate();
    }
}
