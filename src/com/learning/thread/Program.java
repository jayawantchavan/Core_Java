package com.learning.thread;

public class Program {

	public static void main(String[] args) throws InterruptedException {

		usingThreadClass();
		Thread.sleep(10000);
		usingRunnableInterfaceThread();
		
	}

	public static void usingThreadClass() throws InterruptedException {
		UsingThreadClass thread = new UsingThreadClass();
		thread.start();
		thread.sleep(10000);
		System.out.println("Finishing Execution of Thread using Thread Class Interface");
	}
	
	public static void usingRunnableInterfaceThread() throws InterruptedException {
		UsingRunnableInterface customThreadObj = new UsingRunnableInterface();
		Thread thread = new Thread(customThreadObj); 
		thread.start();
		thread.sleep(5000);
		System.out.println("Finishing Execution of Thread using Runnable Interface");
	}
}
