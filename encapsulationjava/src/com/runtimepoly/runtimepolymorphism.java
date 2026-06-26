package com.runtimepoly;


// runtime polymorphism
//method overriding
class Women {
	public void work () {
		System.out.println("women is working");
	}
}

class Teacher extends Women{
	public void work(){
		System.out.println("teacher is teaching ");
	}
}

public class runtimepolymorphism {
	public static void main (String[]args ) {
		Women w = new Women();
		w.work();
	}

}
