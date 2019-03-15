package com.project1.sample2;

public class Student 
{
	int studentId;
	String studentName;
	Course courseObj;
	
	public Student(int studentId,String studentName,int courseId,String courseName,int fees)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		courseObj=new Course(courseId,courseName,fees);
	}
	
	public void displayStudentDetail()
	{
		System.out.println("Student ID:"+studentId);
		System.out.println("Student Name:"+studentName);
		courseObj.displaycoursedetail();
	}
	
}
