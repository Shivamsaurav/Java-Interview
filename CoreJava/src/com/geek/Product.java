package com.geek;

public class Product {

	private int productId;
	private String productName;
	private float price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("Product's display called->");
		System.out.println("Product id : "+getProductId());
		System.out.println("Product id : "+getProductName());
		System.out.println("Product id : "+getPrice());
		System.out.println("_________________________________");
	}
}
