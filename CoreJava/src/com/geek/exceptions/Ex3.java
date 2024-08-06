package com.geek.exceptions;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=5;
		
		System.out.println("Welcome");
		try {
			int arr[] = {1,2,3,4,5};
			
			System.out.println(arr[10]);
			int result = x/(y*2-x);
			
			System.out.println("Result "+result);
		}
		catch (Exception e) {
			System.out.println("Exception occured...");
		}
		
		
		System.out.println("END");
	}

}
