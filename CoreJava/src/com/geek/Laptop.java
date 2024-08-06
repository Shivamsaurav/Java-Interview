package com.geek;

public class Laptop extends Product{

	private String ramMemory;
	private String cpu;
	
	public String getRamMemory() {
		return ramMemory;
	}
	public void setRamMemory(String ramMemory) {
		this.ramMemory = ramMemory;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public void display() {
		super.display();
		System.out.println("Laptop's display called->");
		System.out.println("Product Id : "+getProductId());
		System.out.println("Product Name : "+getProductName());
		System.out.println("Product Price : "+getPrice());
		System.out.println("Laptop RAM"+getRamMemory());
		System.out.println("Laptop CPU"+getCpu());
		System.out.println("_________________________________");
	}
	
}
