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
@PropertySource("classpath:mysql.properties")
public class MysqlConfig {
	@Autowired
    Environment env;
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Bean
	public Connection connection(){
		Connection conn=null;
		try {
			conn= (Connection) DriverManager.getConnection(env.getProperty("url"), env.getProperty("name"), env.getProperty("password"));
			System.out.println("MysqlConfig connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	@Bean
	public EmployeeDao employeeDao(){
		return new EmployeeDao();
	}
	
	public void speak(){
		System.out.println("MysqlConfig speak");
	}
}
