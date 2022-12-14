package com.jpa.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
		
		// Get emp by id
		Employee emp= em.find(Employee.class, empId);
		
		em.close();
		emf.close();
		
		return emp;
	}

	@Override
	public Employee getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
		Query query = em.createQuery("select e from Employee e"); // JPQL
		List<Employee> empList= query.getResultList();
		
		em.close();
		emf.close();
		
		return empList;
	}

	@Override
	public Employee updateEmployee(int empId, Employee emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em= emf.createEntityManager();
		//Query query = em.createQuery("select e from Employee e"); // JPQL
		
		// to get empId
		Employee dbEmp = em.find(Employee.class, empId);
				
	
		//update
		dbEmp .setEname(emp.getEname());
		dbEmp.setSalary(emp.getSalary());
		
		em.getTransaction().begin();
		Employee updateEmp =em.merge(dbEmp);
		em.getTransaction().commit();
		
		//close em an emf
		
		em.close();
		emf.close();
		return  dbEmp;
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
