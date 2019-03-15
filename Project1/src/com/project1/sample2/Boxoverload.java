package com.project1.sample2;

public class Boxoverload 
{
	double width,height,depth;
	public Boxoverload()
	{
		width=10.0;
		height=15.0;
		depth=20.0;
	}
	public Boxoverload(double val)
	{
		width=height=depth=(val>0)?val:1;
	}
	public Boxoverload(double w,double h,double d)
	{
		width=(w>0)?w:1;
		height=(h>0)?h:1;
		depth=(d>0)?d:1;
	}
	public double volume()
	{
		return width*height*depth;
	}
}
