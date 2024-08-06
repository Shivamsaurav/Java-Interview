package com.geek.threads;

public class MultipleThreadDemo3 {
	public static void main(String[] args) throws InterruptedException {
		Task3 task = new Task3();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		
		t1.start();
		t2.start();
		t3.start();	
		
		// Main thread should complete at last.
		t1.join();
		t2.join();
		t3.join();		
		System.out.println("Counter : "+task.counter);
		System.out.println("Main ends");	
	}

}

class Task3 implements Runnable{

	int counter = 0;
	public void run() {		
		for(int i=1;i<=10000;i++) {
			counter++; // read/update/write 
		}		
		System.out.println("Child ends");
	}
}

/*
 * output here will be different every time.
 * 
 * Child ends
 * Child ends
 * Child ends
 * Counter : 19622
 * Main ends
 */