package day3;

import java.time.LocalDate;

public class Person {
	
	private String fName;
	private String lName;
	private LocalDate dob;
	
	private Address address;
	public Person() {
		
	}
	
	
	public Person(String fName, String lName, LocalDate dob) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
	}
	
	public Person(String fName, String lName, LocalDate dob, Address address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.address = address;
	}
	
	
	
	//getter & Setter
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
}
