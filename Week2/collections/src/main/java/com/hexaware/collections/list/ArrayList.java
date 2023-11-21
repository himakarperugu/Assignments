package com.hexaware.collections.list;
import java.util.*; 

public class ArrayList {
	public static void main(String[] args)
	{
	//creation of ArrayList
	ArrayList al=new ArrayList();
	System.out.println("initial size of the arraylist:"+al.size());
	//adding elements to the ArrayList
	al.add("a");
	al.add("A");
	al.add("a"); 
	al.add(null);
	al.add(10); 
	al.add(1,"simon");
	//print the ArrayList elements 
	System.out.println(al); 
	System.out.println("ArrayList size:"+al.size());
	//remove the elements of ArrayList
	al.remove("a");
	System.out.println("ArrayList size:"+al.size()); 
	System.out.println(al);
	}

	}

}
