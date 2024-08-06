package com.geek;

public class Book extends Product{

	private String genre;
	private String author;
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void display() {
		System.out.println("Book's display called->");
		System.out.println("Product Id : "+getProductId());
		System.out.println("Product Name : "+getProductName());
		System.out.println("Product Price : "+getPrice());
		System.out.println("Book genre"+getGenre());
		System.out.println("Book Author CPU"+getAuthor());
		System.out.println("_________________________________");
	}
	
}
