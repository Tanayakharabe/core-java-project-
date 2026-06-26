package com.polymorphism;


class AreaCalculator {
	
	public void area(int side) {
		System.out.println(4*side);
	}
	public void area(int length,int breadth) {
		System.out.println(length*breadth);
	}
}
public class polymorphismassement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCalculator a = new AreaCalculator();
		a.area(6);
		a.area(4, 4);

	}

}
