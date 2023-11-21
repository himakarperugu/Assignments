package com.hexaware.OOPs.Abstraction;

	abstract class Database
	{
		public abstract void Connect();
	    public abstract void disconnect();
	}

	class Oracle extends Database{
		public void Connect(){
	    	System.out.println("Oracle database Connected");
	    }
	    public void disconnect(){
	    	System.out.println("Oracle database Disconnected");
	    }
	}


	class Main {
	  public static void main(String[] args) {
	    Oracle o1 = new Oracle(); 
	    o1.Connect();
	    o1.disconnect();
	    
	  }
	}

	

}
