package com.geek.threads;

public class MainThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello");
		// System.out.println(5/0); -> not a ggod way to identify main thread
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at com.geek.threads.MainThreadDemo.main(MainThreadDemo.java:8)
		
		// returns current running thread
		
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getName()+" is running.");
		System.out.println("priority : "+ t1.getPriority());
		// Minimum priority is 1, max is 10, normal is 5.
		// high priority - more chances given by scheduler.
		
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000); // 1000 milli seconds - 1 second
		}
	}

}
