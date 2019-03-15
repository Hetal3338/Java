package com.project1.sample2;

public class staticvariable
{
	int num1;
	static int num2;
	public staticvariable()
	{
		num1++;
		num2++;
	}
	public static void main(String arg[])
	{
		staticvariable obj1=new staticvariable();
		staticvariable obj2=new staticvariable();
		staticvariable obj3=new staticvariable();
		staticvariable obj4=new staticvariable();
		staticvariable obj5=new staticvariable();
		staticvariable obj6=new staticvariable();
		
		System.out.println("instance variable:"+obj3.num1);
		System.out.println("static variable:"+obj3.num2);
		
	}
}
