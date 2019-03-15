package com.project1.Sample;

public class Constructor
{
	public Constructor()
	{
		System.out.println("============I am in constructor===========");
	}
	public Constructor(int var1)
	{
		System.out.println("============I am in constructor===========");
	}
	public static void main(String arg[])
	{
		System.out.println("===========I am in main method===========");
	
		Constructor obj=new Constructor();
		
		System.out.println("===========I am again in main method===========");
		
		Constructor obj1=new Constructor(10);
		
		System.out.println("===========I am again in main method===========");
	}	
}
