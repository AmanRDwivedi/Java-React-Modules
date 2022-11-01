package SpringCore;

public class Employee {
	
	Address address;
	private int empId;
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
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + "]";
	}


}
