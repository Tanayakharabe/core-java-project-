package com.abstraction;


abstract class Appliance{
	abstract void start();
	
}

class WashingMachine extends Appliance{
	void start() {
		System.out.println("washing machine is a very helpfull appliance");
	}
}
public class abstractionassesment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Appliance a = new WashingMachine ();
 a.start();
	}

}
