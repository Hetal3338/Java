package com.project1.sample2;

public class Usercallback implements Callback
{

	@Override
	public void callback(int var1)
	{
	System.out.println("callback:"+var1);
	}
	public static void main(String arg[])
	{
	Usercallback obj=new Usercallback();
	obj.callback(100);
	}
}