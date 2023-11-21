package com.hexaware.exception.exception;
import java.io.*; 

public class Student {
	void studentDetails()
	{
	try
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	System.out.println("please enter student name");
	String sname=br.readLine();
	System.out.println("ur name is:"+sname);
	}
	catch(IOException e)
	{
	System.out.println("we are getting Exception"+e);
	}
	}
	public static void main(String[] args)
	{
	Student s1=new Student(); s1.studentDetails();
	}
	}
