package com.geek.exceptions;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		
		System.out.println("Elcome to HDFC ATM.");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the amount to withdraw");
		int amount =  scanner.nextInt();
		
		if(amount%100 != 0) {
			try {
				throw new InvalidInputException();
			} 
			catch (InvalidInputException e) {
				
				System.out.println("Invalid input...");
			}
			// we cannot place this catch block above otherwise other catch won't be reachable
			// as parent Exception class will cater all exceptions.
			catch(Exception e) {
				System.out.println("Exception occured");
			}
			
		}
		else {
			System.out.println("Transaction success!!!");
		}
		scanner.close();
	}
} 

class InvalidInputException extends Exception{
	
}
