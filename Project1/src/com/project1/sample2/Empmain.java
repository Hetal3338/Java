package com.project1.sample2;

public class Empmain
{
	public static void main(String arg[])
	{
		Emp obj1=new Emp(1001,"hetal",56000);
		Emp obj2=new Emp(1002,"yog",50000);
		
		obj1.displaydetail();
		obj2.displaydetail();
		
		Emp.displaytotalsalary();
		
	}
}
