package com.geek.threads;

public class MultipleThreadDemo4 {

	public static void main(String[] args) throws InterruptedException {
		
		Task4 task = new Task4();
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

class Task4 implements Runnable{

	int counter = 0;
	public void run() {		
		for(int i=1;i<=10000;i++) {
			synchronized (this) {
				counter++; // read/update/write
			}
		}		
		System.out.println("Child ends");
	}
}