package com.geek;

public class InhertianceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop laptop = new Laptop();
		laptop.setProductId(101);
		laptop.setProductName("Lenovo Laptop");
		laptop.setPrice(50000);
		laptop.setCpu("Intel");
		laptop.setRamMemory("16 GB");
		
		Book book = new Book();
		book.setProductId(102);
		book.setProductName("Harry Potter");
		book.setPrice(500);
		book.setGenre("Fantasy");
		book.setAuthor("J K Rowling");
	}

}
