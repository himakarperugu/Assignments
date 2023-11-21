package com.hexaware.scannerclass;
import java.util.*; 

public class ScannerClass {


	String ename; 
	int eid; 
	double esal; 
	int eage; 
	void details()
	{
	Scanner s=new Scanner(System.in); 
	System.out.println("enter emp name"); 
	String ename=s.next(); 
	this.ename=ename; 
	System.out.println("enter emp id"); 
	int eid=s.nextInt();
	this.eid=eid; 
	System.out.println("enter emp sal"); 
	double esal=s.nextDouble(); 
	this.esal=esal; 
	System.out.println("enter age");
	int eage=s.nextInt(); 
	this.eage=eage;
	}
	void display()
	{
	System.out.println("************emp details***********"); 
	System.out.println(ename);
	System.out.println(eid); 
	System.out.println(esal); 
	System.out.println(eage);
	}
	void status()
	{
	if (eage>40)
	{
	System.out.println("not elgible");
	}
	else
	{
	System.out.println("elgible");
	}
	}
	public final strictfp synchronized static void main(String[] args)
	{
	ScannerClass t=new ScannerClass(); t.details();
	t.display();
	t.status();

	}

	}

}
