package com.geek.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		
		Product p1 = new Product(101, "Tshirt", 800, 4.5f);
		Product p2 = new Product(102, "Jeans", 2000, 4.4f);
		Product p3 = new Product(103, "Mobile", 10000, 3.1f);
		Product p4 = new Product(104, "Shoes", 3000, 4.7f);
		Product p5 = new Product(105, "Mouse", 1000, 4.2f);
		
		ArrayList<Product> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		
		Stream<Product> stream1 = list.stream(); // returns a stream
		Predicate<Product> p = (pr)->pr.getPrice()<10000;
		Stream<Product> stream2 = stream1.filter(p);
		List<Product> filteredData = stream2.toList();
		
		for(Product product: filteredData) {
			System.out.println(product);
		}
		
		System.out.println("------------------------");
		
		// can be written in a single line
		// Streams don't modify the original collection
		List<Product> filteredData2 = list.stream().filter(prd->prd.getPrice()<10000).toList();
		for(Product product: filteredData2) {
			System.out.println(product);
		}

	}

}
