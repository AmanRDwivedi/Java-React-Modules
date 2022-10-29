package com.jpa.demo.service;

import java.util.List;

import com.jpa.demo.dao.EmployeeDaoImp;
import com.jpa.demo.entity.Employee;

public class EmployeeServiceImp implements IEmployeeService{
	
	EmployeeDaoImp empDao = new EmployeeDaoImp();

	@Override
	public Employee addEmployee(Employee emp) {
		System.out.println("from ServiceImp" +emp);
		
		return	empDao.addEmployee(emp);
		
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		return	empDao.deleteEmployeeById(empId);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return	empDao.getEmployeeById(empId);
	}

	@Override
	public Employee getEmployeeByName(String name) {
		return	empDao.getEmployeeByName(name);	}

	@Override
	public List<Employee> getAllEmployees() {
		return	empDao.getAllEmployees();
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		return	empDao.updateEmployee(empId, emp);
	}

	@Override
	public Employee updateEmployeeName(int empId, String newName) {
		return	empDao.updateEmployeeName(empId, newName);
	}

	@Override
	public Employee updateEmployeeSalary(int empId, double newSalary) {
			return	empDao.updateEmployeeSalary(empId, newSalary);
	}

	@Override
	public Employee updateEmployeeDepartment(int empId, int deptId) {
		Employee emp =	empDao.updateEmployeeDepartment(empId, deptId);
			return emp;
	}
	

}
