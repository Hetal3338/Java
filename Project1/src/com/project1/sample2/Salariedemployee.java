package com.project1.sample2;
public class Salariedemployee extends Employeee
{
	int salary;
	public Salariedemployee() 
	{
		empid=1001;
		empname="hetal";
		salary=45000;
	}
	public void display()
	{
		System.out.println("salary:"+salary);
	}
	public static void main(String arg[])
	{
	Salariedemployee obj=new Salariedemployee();
	obj.displayempdetail();
	obj.display();
	}
}