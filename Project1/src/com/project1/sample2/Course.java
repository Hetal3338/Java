package com.project1.sample2;

public class Course 
{
	int courseid;
	String coursename;
	int fees;

	public Course(int cid,String cname,int fee)
	{
		courseid=cid;
		coursename=cname;
		fees=fee;
	}
	public void displaycoursedetail()
	{
		System.out.println("course id:"+courseid);
		System.out.println("coursename:"+coursename);
		System.out.println("fees:"+fees);
	}
	
	}
	

	
