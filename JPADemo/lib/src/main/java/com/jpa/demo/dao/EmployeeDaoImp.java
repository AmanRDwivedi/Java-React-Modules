package com.jpa.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.demo.entity.Employee;

public class EmployeeDaoImp implements IEmployeeDao {

	@Override
	public Employee addEmployee(Employee emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(emp);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		return emp;
		
		
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployeeName(int empId, String newName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployeeSalary(int empId, double newSalary) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployeeDepartment(int empId, int deptId) {
		// TODO Auto-generated method stub
		return null;
	}

}
