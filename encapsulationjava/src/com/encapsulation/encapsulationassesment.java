package com.encapsulation;

class Employee {
	private String employeename;
	private int salary;
	
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
		
		
	}


public class encapsulationassesment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setEmployeename("TANAYA");
		e.setSalary(35000);
		
		
		System.out.println(" EMPLOYEE NAME:"+ e.getEmployeename());
        System.out.println("SALARY:"+ e.getSalary());
		

	}
}
