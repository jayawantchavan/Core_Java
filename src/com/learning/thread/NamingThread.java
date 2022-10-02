package com.learning.thread;

public class NamingThread extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		NamingThread t1 = new NamingThread();
		NamingThread t2 = new NamingThread();
		System.out.println("Name of t1:" + t1.getName());
		System.out.println("Name of t2:" + t2.getName());

		t1.start();
		t2.start();

		t1.setName("Sonoo Jaiswal");
		System.out.println("After changing name of t1:" + t1.getName());
	}
}