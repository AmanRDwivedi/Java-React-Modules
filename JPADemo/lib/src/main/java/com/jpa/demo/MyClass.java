package com.jpa.demo;

import java.util.List;
import java.util.Scanner;

import com.jpa.demo.entity.Employee;
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
			System.out.println("Enter Employee Id");
			int empId = sc.nextInt();
			
			System.out.println("Enter Employee Name");
			String name =  sc.next();
			
			System.out.println("Enter Employee Salary");
			double salary =  sc.nextDouble();
			
			Employee emp = new Employee(empId, name, salary);
			
			Employee newEmp =empService.addEmployee(emp); 
			System.out.println(newEmp);
			
			
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
		
		
		
		
	