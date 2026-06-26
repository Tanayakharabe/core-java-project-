package com.runtimepoly;



class Employee {
	public void work () {
		System.out.println("employee is working");
	}
}
class Developer extends Employee{
	public void work(){
		System.out.println("developer develop software");
	}
}


public class runtimepolyassesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee  e = new Employee();
e.work();
	}

}
