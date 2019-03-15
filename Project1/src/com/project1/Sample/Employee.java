package com.project1.Sample;

public class Employee 
{
	
	int employeeId;
	String employeeName;
	int salary;
	
	public static void main(String arg[])
	{ 
		
		Employee obj=new Employee();
		
		obj.employeeId=1001;
		obj.employeeName="Hetal";
		obj.salary=4500;
		
		System.out.println("Employee Id:"+obj.employeeId);
		System.out.println("Employee Name:"+obj.employeeName);
		System.out.println("Salary:"+obj.salary);
	}

}
