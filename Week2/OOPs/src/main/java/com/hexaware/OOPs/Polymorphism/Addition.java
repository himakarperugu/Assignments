package com.hexaware.OOPs.Polymorphism;

public class Addition {
		void add(int x,int y){
	    System.out.println(x+y);
	    }
	    void add(double x,double y){
	    System.out.println(x+y);
	    }
	public static void main(String[] args){
		Addition a1=new Addition();
		a1.add(2,3);
	    a1.add(2.0,3.0);
	}
	}



	class Oppof9{
		void camera(){
	    System.out.println("Oppof9 camera");
	    }
	}
	class Oppof21 extends Oppof9{
		void camera(){
	    super.camera();
	    System.out.println("Oppof21 camera");
	    }


	public static void main(String[] args){
		Oppof21 o1=new Oppof21();
		o1.camera();
	}
	}





