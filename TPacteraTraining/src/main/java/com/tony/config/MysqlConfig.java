package com.tony.config;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.mysql.jdbc.Connection;
import com.tony.dao.EmployeeDao;
@Configuration
//@ComponentScan
//@Component
@PropertySource("mysql.properties")
public class MysqlConfig {
	@Autowired
    Environment env;
	
	@Bean
	public Connection connection(){
		try {
			System.out.println("begin connect");
			return (Connection) DriverManager.getConnection(env.getProperty("url"), env.getProperty("name"), env.getProperty("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Bean
	public EmployeeDao employeeDao(){
		return new EmployeeDao();
	}
	
	public void speak(){
		System.out.println("MysqlConfig speak");
	}
}
