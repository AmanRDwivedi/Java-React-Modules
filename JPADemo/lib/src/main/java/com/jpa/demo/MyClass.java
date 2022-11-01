package com.jpa.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jpa.demo.entity.Address;
import com.jpa.demo.entity.Employee;
import com.jpa.demo.entity.Login;
import com.jpa.demo.service.EmployeeServiceImp;
import com.jpa.demo.service.IEmployeeService;

public class MyClass {
	
	public static void main(String[] args) {
		IEmployeeService empService = new EmployeeServiceImp();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select any one of the below option:");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Get employee by Id");
		System.out.println("4. Get all employees");
		System.out.println("5. Update Employee");
		System.out.println("6. Update employee name");
		System.out.println("7. Get employee by name");
		
		
		int optionSelected = sc.nextInt();

		switch (optionSelected) {
		case 1:
			//System.out.println("Enter Employee Id");
		//	int empId = sc.nextInt();
			
			System.out.println("Enter Employee Name");
			String name =  sc.next();
			
			System.out.println("Enter Employee Salary");
			double salary =  sc.nextDouble();
			
			System.out.println("Enter Employee Email add");
			String email =  sc.next();
			
			System.out.println("Enter Employee password");
			String pass =  sc.next();
			//login obj
			/*
			Login login = new Login(email,pass);
			
			Employee emp = new Employee(name, salary,login);
			
			Employee newEmp =empService.addEmployee(emp); 
			System.out.println(newEmp);
			
			System.out.println("Enter number of addresses to be added");
			int numAddr = sc.nextInt();
			List<Address> addrList = new ArrayList<>();
			for(int i=0; i<numAddr;i++) {
				
				System.out.println("Enter city name: ");
				String city = sc.next();

				System.out.println("Enter state name: ");
				String state = sc.next();
				// Create address obj
				Address addr = new Address(city, state);
				// add addr obj to addressList 
				addrList.add(addr);
				
				// Create emp object using login and address details
				Employee emp = new Employee(name, salary, login, addrList);
				
				// Call service addEmployee() method to add emp to db
				Employee newEmp = empService.addEmployee(emp);
				System.out.println("New Employee: " + newEmp);
				break;
			}
			
			break;
			*/
			

			// Get Address details
			System.out.println("Enter number of addresses to be added");
			int numAddr = sc.nextInt();
			List<Address> addrList = new ArrayList<>();
			for(int i=0; i<numAddr;i++) {
				
				System.out.println("Enter city name: ");
				String city = sc.next();

				System.out.println("Enter state name: ");
				String state = sc.next();
				// Create address obj
				Address addr = new Address(city, state);
				// add addr obj to addressList 
				addrList.add(addr);
			}
			
			// Create login object using email & password
			Login login = new Login(email, pass);
			// Create emp object using login and address details
			Employee emp = new Employee(name, salary, login, addrList);
			
			// Call service addEmployee() method to add emp to db
			Employee newEmp = empService.addEmployee(emp);
			System.out.println("New Employee: " + newEmp);
			break;
		case 2:
			break;
		case 3:
			System.out.println("Enter employee id: ");
			int empid = sc.nextInt();
			Employee emp1 = empService.getEmployeeById(empid);
			System.out.println(emp1);
			break;
			
		case 4:
			List<Employee> employees=empService.getAllEmployees();
			for(Employee employee: employees) {
				System.out.println(employee);
			}
		case 5:
			System.out.println("Enter employee id: ");
			int id = sc.nextInt();
			System.out.println("Enter employee Name : ");
			String eName = sc.next();
			System.out.println("Enter employee Sala: ");
			Double sal = sc.nextDouble();
			Employee emp2 =  new Employee(id, eName, sal);
			
			Employee ude = empService.updateEmployee(id, emp2);
			
			System.out.println(ude);
			break;
			
		case 6:
			break;
		case 7:
			
			break;
		default:
			System.out.println("Enter any value between 1 to 6");
		}
		sc.close();
	}

}
		
		
		
		
	