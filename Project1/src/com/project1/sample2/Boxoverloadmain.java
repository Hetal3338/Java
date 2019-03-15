package com.project1.sample2;

public class Boxoverloadmain 
{
	public static void main(String arg[])
	{
		Boxoverload defaultBoxobj=new Boxoverload();
		System.out.println("volume of the default box is:"+defaultBoxobj.volume());
		
		Boxoverload squarebox=new Boxoverload();
		System.out.println("volume of square box is:"+squarebox.volume());
		
		Boxoverload userdefinebox=new Boxoverload();
		System.out.println("volume of userdefined box is:"+userdefinebox.volume());
	}

}
