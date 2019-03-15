package com.project1.Sample;

public class Boxmain 
{

	public static void main(String[] args) 
	{
		Box objbox=new Box();
		objbox.setwidth(-10); //Irrelevant value so it consider 1.
		objbox.setHeight(15);
		objbox.setDepth(10);
		double volume;
		volume=objbox.getwidth()*objbox.getHeight()*objbox.getDepth();
		
		System.out.println("volume of the box="+volume);
				

	}

}
