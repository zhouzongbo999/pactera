package com.tony.model;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.tony.service.IPeopleService;
import com.tony.service.PeopleService;

@ComponentScan
public class FactorySmall {
	@Bean
	public IPeopleService peopleService(){
		return new PeopleService();
	}
//	@Bean
//	public IEmployeeService employeeService(){
//		return new EmployeeService();
//	}
}
