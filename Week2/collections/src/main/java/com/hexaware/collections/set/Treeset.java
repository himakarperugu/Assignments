package com.hexaware.collections.set;
import java.util.*; 

public class Treeset {
	
	public static void main(String[] args)
	{
	TreeSet t=new TreeSet(); 
	t.add(50);
	t.add(20);
	t.add(40);
	t.add(10);
	t.add(30); 
	System.out.println(t); 
	SortedSet s1=t.headSet(50);
	System.out.println(s1);
	SortedSet s2=t.tailSet(30); 
	System.out.println(s2); 
	SortedSet s3=t.subSet(20,50); 
	System.out.println(s3); 
	}
	}


