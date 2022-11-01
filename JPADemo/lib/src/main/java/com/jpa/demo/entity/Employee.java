package com.jpa.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id       //to hibernate for PK
	@GeneratedValue
	//System will generate it automatically 
	// keep in check while adding	
	private int eid;
	//to change column name
	@Column(name = "name")
	private String ename;
	//default name
	private double salary;
	
	//to implement has a relationship
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_log_fk")
	private Login login;
	
	//to implement has a relationship
		@OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name = "emp_emp_fk")
	private List<Address> address;
	
	
	
	
	public Employee(String ename, Login login, List<Address> address) {
		super();
		this.ename = ename;
		this.login = login;
		this.address = address;
	}
	public List<Address> getAddress() {
			return address;
		}
		public void setAddress(List<Address> address) {
			this.address = address;
		}
	public Employee() {}
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
    
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public Employee(String ename, double salary, Login login) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.login = login;
	}
	public Employee(String ename, double salary, Login login, List<Address> address) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.login = login;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", login=" + login + ", address="
				+ address + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}




}
