package com.project1.Sample;

public class Methoddemo
{
	public int add(int var1,int var2)
	{
		int result;
		result=var1+var2;
		return result;
	}
	public static void main(String arg[])
	
	
	
	{
		Methoddemo obj=new Methoddemo();
	int result;
	result=obj.add(101,102);
	System.out.println("result:"+result);
	}
}
