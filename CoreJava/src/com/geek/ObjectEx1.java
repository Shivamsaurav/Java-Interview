package com.geek;

public class ObjectEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product();
		
		// Error as its a private field. p1.productId = 10.
		// We use getter setter.
		
		p1.setProductId(101);
		p1.setProductName("Lenovo Laptop");
		p1.setPrice(50000);
		display(p1);
		System.out.println("--------");
		
		
		Product p2 = new Product();
		p2.setProductId(102);
		p2.setProductName("Shoes");
		p2.setPrice(2000);
		display(p2);
		System.out.println("--------");
		
	}
	
	static void display(Product p) {
		System.out.println("Id is "+p.getProductId());
		System.out.println("Name is "+p.getProductName());
		System.out.println("Price is "+p.getPrice());
	}

}
