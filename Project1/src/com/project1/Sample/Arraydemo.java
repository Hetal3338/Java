package com.project1.Sample;

import java.util.Scanner;

public class Arraydemo
{
	public static void main(String arg[])
	{
		int marks[]=new int[5];
		int total=0;
		
		Scanner scanner=new Scanner(System.in);
		
		for(int index=0;index<marks.length;index++)
		{
		System.out.println("Enter the value:");
		marks[index]=scanner.nextInt();
		total=total+marks[index];
		}
		System.out.println("The element which are entered");
		for(int index=0;index<marks.length;index++)
		{
			System.out.println("marks["+index+"]="+marks[index]);
		}
			System.out.println("total marks:"+total);
	}
}
