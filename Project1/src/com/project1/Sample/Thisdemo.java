package com.project1.Sample;

public class Thisdemo
{
	int var1;
	public Thisdemo(int var1)
	{
		this.var1=var1;
	}
	public void display()
	{
		System.out.println(var1);
	}
	public static void main(String arg[])
	{
		Thisdemo obj=new Thisdemo(100);
		obj.display();
	}
}
