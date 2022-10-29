package day3;

import java.time.LocalDate;

public class Employee extends Person{
	private int empId;
	private double sal;
	
	public Employee() {
		}

	public Employee(int empId, double sal) {
		super();
		this.empId = empId;
		this.sal = sal;
	}

	public Employee(int empId, double sal, String fName, String lName, LocalDate dob) {
		super(fName, lName, dob);
		
	}
	
	
	
	

	public Employee(int empId, double sal, String fName, String lName, LocalDate dob, Address address) {
		super(fName, lName, dob, address);
		this.sal = sal;
		this.empId = empId;
	}
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", sal=" + sal + ", getfName()=" + getfName() + ", getlName()=" + getlName()
				+ ", getDob()=" + getDob() + ", getAddress()=" + getAddress() + "]";
	}
	

	
	
	

}
