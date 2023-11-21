package com.hexaware.OOPs.Inheritance;

public class C {

	    void Clang(){
	    System.out.println("C language here..");
	    }
	}
	class Python extends C{
	    void Pythonlang(){
	    System.out.println("Python Language here..");
	    }
	}
	class main{
		public static void main(String args[]){
		Python p=new Python();
	    	p.Pythonlang();
	    	p.Clang();
	}
	}
	

