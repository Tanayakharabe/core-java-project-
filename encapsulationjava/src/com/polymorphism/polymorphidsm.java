package com.polymorphism;

//compile time polymorphism
// method overloading
class Calculator {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add (int a,int b, int c) {
		System.out.println(a+b+c);
	}
}
public class polymorphidsm {
 public static void main (String[]args) {
	 Calculator c = new Calculator();
			 c.add(30,20);
			 c.add(30,20,30);
			 
			
	 
 }
}
