package com.geek.collections;

public class Product implements Comparable<Product>{

	private int id;
	private String productName;
	private float price;
	private float ratings;
		
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String productName, float price, float ratings) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.ratings = ratings;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + ", ratings=" + ratings + "]";
	}

	@Override
	public int compareTo(Product p) {
		if(this.price < p.price)
			return -1;
		return 1;
	}
	
	
}
