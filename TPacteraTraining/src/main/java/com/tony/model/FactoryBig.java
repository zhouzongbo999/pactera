package com.tony.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tony.service.IPeopleService;

//@Component
public class FactoryBig {
	@Autowired
	private IPeopleService peopleService;
//	@Autowired
//	private IEmployeeService employeeService;
	public void speak(){
		peopleService.speak();
//		employeeService.speak();
	}
}
