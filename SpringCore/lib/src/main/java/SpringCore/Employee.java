package SpringCore;

import java.util.List;

public class Employee {
	
	Address address;
	private int empId;
	private List<String> cNo;
	
	public Employee(Address address, int empId, String eName) {
		super();
		this.address = address;
		this.empId = empId;
		this.eName = eName;
	}
	private String eName;
	public Employee(int empId, String eName) {
		super();
		this.empId = empId;
		this.eName = eName;
	}
	public Employee() {
		super();
	}
	
	public Employee(int empId, String eName, Address address, List<String> cNo) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.address = address;
		this.cNo = cNo;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getcNo() {
		return cNo;
	}
	public void setcNo(List<String> cNo) {
		this.cNo = cNo;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + "]";
	}


}
