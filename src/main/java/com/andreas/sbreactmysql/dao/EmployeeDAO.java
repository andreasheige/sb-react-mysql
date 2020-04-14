package com.andreas.sbreactmysql.dao;

import java.util.List;

import com.andreas.sbreactmysql.modal.Employee;

public interface EmployeeDAO {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}