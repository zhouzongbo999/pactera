package com.tony.service;


import java.util.List;

import com.tony.model.Employee;
public interface IEmployeeService {
	void addEmployee(Employee emp);
	List<Employee> getEmployees();
	Employee getEmployeeById(String id);
	boolean putEmpoyee(Employee emp);
	void speak();
}
