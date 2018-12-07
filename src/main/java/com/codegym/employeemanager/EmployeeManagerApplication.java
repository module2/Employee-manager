package com.codegym.employeemanager;

import com.codegym.employeemanager.service.EmployeeService;
import com.codegym.employeemanager.service.GroupEmployeeService;
import com.codegym.employeemanager.service.impl.EmployeeServiceImpl;
import com.codegym.employeemanager.service.impl.GroupEmployeeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeManagerApplication {

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}

	@Bean
	public GroupEmployeeService groupEmployeeService() {
		return new GroupEmployeeServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagerApplication.class, args);
	}
}
