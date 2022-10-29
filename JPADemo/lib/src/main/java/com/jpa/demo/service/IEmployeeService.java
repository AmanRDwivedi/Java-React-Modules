package com.jpa.demo.service;

import java.util.List;

import com.jpa.demo.entity.Employee;

public interface IEmployeeService {

	//Abstract Methods
	
		Employee addEmployee(Employee emp);
		Employee deleteEmployeeById(int empId);
		Employee getEmployeeById(int empId);
		Employee getEmployeeByName(String name);
		List<Employee> getAllEmployees();
		Employee updateEmployee(int empId, Employee emp);
		Employee updateEmployeeName(int empId, String newName);
		Employee updateEmployeeSalary(int empId, double newSalary);
		Employee updateEmployeeDepartment(int empId, int deptId);
		
	}
