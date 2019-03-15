package com.project1.Sample;

public class Methodoverload
{
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	
	public int add(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}
	public double add(double var1,double var2)
	{
		return var1+var2;
	}
	public static void main(String arg[])
	{
		Methodoverload obj=new Methodoverload();
		
		System.out.println("two integer:"+obj.add(10, 20));
		System.out.println("three integer:"+obj.add(20,30,40));
		System.out.println("two double:"+obj.add(543.55,234.55));
				
	}
} 
