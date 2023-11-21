package com.hexaware.OOPs.Encapsulation;

public class Encapsulation {
		private double balance=1000;
	    public void getbalance(){
	    System.out.println("Initial Amount:"+balance);
	    }
	    private double Deposit=5000;
	    public void deposit(){
	    System.out.println("Deposited Amount:"+Deposit);
	    }
	    public void setbalance(){
	    balance=Deposit+balance;
	    System.out.println("Balance Amount:"+balance);
	    }
	public static void main(String[] args) {
	    Encapsulation a1 = new Encapsulation();
	    a1.getbalance();
	    a1.deposit();
	    a1.setbalance();
	  }
	}
	
}
