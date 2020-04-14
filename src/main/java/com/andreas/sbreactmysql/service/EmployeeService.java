package com.andreas.sbreactmysql.service;

import java.util.List;

import com.andreas.sbreactmysql.modal.*;

public interface EmployeeService {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);

}