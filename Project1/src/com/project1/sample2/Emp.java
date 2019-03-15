package com.project1.sample2;

public class Emp
{
	int empid;
	String empname;
	int salary;
	static int totalsalary;

	public Emp(int eid,String ename,int sal)
	{
		empid=eid;
		empname=ename;
		salary=sal;
		totalsalary=totalsalary+salary;
	}
	public void displaydetail()
	{
		System.out.println("employee id:"+empid);
		System.out.println("employee name:"+empname);
		System.out.println("employee salary:"+salary);
	}
	public static void displaytotalsalary()
	{
		System.out.println("total salary:"+totalsalary);
	}	
}		
		
		
		
		
		
		
		
		
		
		
	