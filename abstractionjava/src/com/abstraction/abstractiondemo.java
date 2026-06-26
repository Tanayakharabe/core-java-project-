package com.abstraction;


// abstraction - use abstract keyword 

abstract class ATM{
	abstract void withdraw (); //concrete method (method without curly braces <body>)
}

class HDFC extends ATM {
	void withdraw () {
		System.out.println("money withdraw successfully");
	}
}
public class abstractiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM a = new HDFC();
		a.withdraw();

	}

}
