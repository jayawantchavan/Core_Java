package com.learning.thread;

public class PriorityOfThread extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		NamingThread t1 = new NamingThread();
		NamingThread t2 = new NamingThread();
		System.out.println("priority of t1: " + t1.getPriority());
		System.out.println("priority of t2: " + t2.getPriority());

		t1.start();
		t2.start();

		t1.setPriority(MAX_PRIORITY);
		
		// 	t2.setPriority(17);   // IllegalArgument Exception as number greater than 10
		System.out.println("after changing priority of t1: " + t1.getPriority());
		System.out.println("after changing priority of t2: " + t2.getPriority());

	}
}