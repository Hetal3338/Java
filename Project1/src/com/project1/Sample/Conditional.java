package com.project1.Sample;

public class Conditional
{
 public static void main(String arg[])
 {
	 int var1,var2,max;
	 var1=10;
	 var2=20;
	 max=(var1>var2)?var1:var2;
	 if(var1>var2)
		 max=var1;
	 else
		 max=var2;
 	
 	System.out.println(max);
}
}