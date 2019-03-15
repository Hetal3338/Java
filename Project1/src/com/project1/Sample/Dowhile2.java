package com.project1.Sample;
import java.util.Scanner;

public class Dowhile2
{
	public static void main(String arg[])
	{
		int num1,num2,result=0;
		char oper, choise;
		
		Scanner scanner=new Scanner(System.in);
		do
		{
			System.out.println("Enter the first value:");
			num1=scanner.nextInt();
			System.out.println("Enter the secound value:");
			num2=scanner.nextInt();
			
			System.out.println("Choise the operation: 1.Addition 2.substraction 3.Multipilaction 4.division");
			oper=scanner.next().charAt(0);
			
			if(oper=='1')
				result=num1+num2;
			
			if (oper=='2')
				result=num1-num2;
					
			if(oper=='3')
				result=num1*num2;
			
			if(oper=='4')
				result=num1%num2;
			
			System.out.println("Result:"+result);
					
			System.out.println("Do you want to continue (Y/N):");
			choise=scanner.next().charAt(0);
		}
		while(choise=='Y');

		
	}
}
