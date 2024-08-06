package com.geek.threads;

public class MultipleThreadDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Main thread started .....");
		Task2 task = new Task2();
		
		// New Thread
		Thread t1 = new Thread(task); // new thread created and assigned.
		t1.start(); // Runnable State
		// CANT predict the output ....
		for(int i=1;i<=1000;i++) {
			System.out.println("Main : "+i);
		}
		System.out.println("Main thread ends ....");
		
		
		// Every time new o/p.
	}

}

 class Task2 implements Runnable{
	public void run() {
		System.out.println("Child thread started running .....");
		
		for(int i=1;i<=1000;i++) {
			System.out.println("Child : "+i);
		}
	}
	 
 }