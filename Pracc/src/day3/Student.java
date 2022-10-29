package day3;

import java.time.LocalDate;

public class Student extends Person{
	private int rollNo;

public Student() {
}

public Student(int rollNo) {
	super();
	this.rollNo = rollNo;
}

public Student(int rollNo, String fName, String lName, LocalDate dob) {
	super(fName, lName, dob);
	this.rollNo = rollNo;
			
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

@Override
public String toString() {
	return "Student [rollNo=" +getRollNo() + ", Name=" + getfName() + ", Name="
			+ getlName() + ", Dob" + getDob() + "]";
}





}
