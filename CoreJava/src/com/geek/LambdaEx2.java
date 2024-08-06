package com.geek;

public class LambdaEx2 {
	
	public static void main(String[] args) {
		// Function without name
		
		Greeting g = (String name)-> {
			return "Hello "+name+" Happy Birthday !!!!";
		};
		
		System.out.println(g.wish("Arun"));
		
	}

}

@FunctionalInterface
interface Greeting{
	String wish(String name);
}

// this is not a functional interface as it has 2 abstract methods.
interface Greeting2 extends Greeting{
	String w(String s);
}
/*
class GreetingImpl implements Greeting{

	public String wish(String name) {
		
		return "Hello "+name+" Happy Birthday !!!!";
	}
	
}
*/