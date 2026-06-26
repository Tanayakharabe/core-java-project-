package com.abstraction;

abstract class Payment {
	abstract void pay();

}

class UPIPayment extends Payment {
	void pay(){
		System.out.println("payment successfulllllllll");
	}
	
 
}

public class abstractionassesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Payment p =  new UPIPayment ();
p.pay();

	}

}
