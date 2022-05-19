package org.cts.test.login;

class kumar {
//in this constructor chaining the execution starts with default constructor next line  this keyword this(100);
//this (100); it takes to the integer parameter constructor there seeing another this keyword it refers to the string
//it takes to the string parameter constructor the string parameter execute first next integer parameter will execute atlast only the 
//default parameter will execute	

		
	//3
	public kumar() {
		// TODO Auto-generated constructor stub
		this(100);
	System.out.println("Default constructor");
	}
//1
	 kumar(String c){
	System.out.println(c);
	System.out.println();
	}
	//2
	kumar(int id){
	this("mutbgu");
	System.out.println(id);
	System.out.println();
	}
	 public static void main (String args[]){
	kumar e=new kumar();
	 }
}



	 