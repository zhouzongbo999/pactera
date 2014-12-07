package com.tony.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tony.dao.EmployeeDao;
import com.tony.model.Employee;
//@Component
@Service
//@ComponentScan
//@Configuration
public class EmployeeService implements IEmployeeService{
//	EmployeeDao employeeDao=new EmployeeDao();
	@Autowired
	EmployeeDao employeeDao;
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.create(emp);
	}
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeDao.retrieve();
	}
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeDao.retrieveById(id);
	}
	public boolean putEmpoyee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDao.updateEmployee(emp);
	}
	public void speak(){
		System.out.println("EmployeeService speak");
	}
}
