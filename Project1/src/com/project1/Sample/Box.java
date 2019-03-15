package com.project1.Sample;

public class Box
{
	private double width,height,depth;
	 
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	public void setwidth(double w)
	{
		width = (w>0?w:1);
	}
	public double getwidth()
	{
		return width;
	}
}
