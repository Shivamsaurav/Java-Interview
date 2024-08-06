package com.geek;

public class AbstractDemo {

	public static void main(String[] args) {
		
		// Employee is an Abstract class there cannot be instantiated.otherwise it will throw error. 
		// new Employee();
		HREmployee hr = new HREmployee();
		hr.info();
	}
}

abstract class Employee{
	
	abstract void info();
}

class HREmployee extends Employee{

	@Override
	void info() {
		System.out.println("I am HR Employee");
		
	}
	
}