package com.project1.Sample;

import java.util.Scanner;

public class Scannerdemo
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
	int result,var1,var2;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter first value:");
	var1=scanner.nextInt();
	System.out.println("enter second value:");
	var2=scanner.nextInt();
	
	result=obj.add(var1,var2);
	System.out.println("result:"+result);
	}
}

