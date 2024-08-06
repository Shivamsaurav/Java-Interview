package com.geek.threads;

public class MultipleThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("Main thread started .....");
		Task task = new Task();
		
		// New Thread
		Thread t1 = new Thread(task); // new thread created and assigned.
		t1.start(); // Runnable State
		// CANT predict the output ....
		System.out.println("Main thread ends ....");
		
	}

}


class Task implements Runnable{
	public void run() {
		System.out.println("Child thread started running .....");
		
	}
	
}