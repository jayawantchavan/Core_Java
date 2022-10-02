package com.learning.thread;

public class ThreadGroupDemo implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadGroupDemo runnable = new ThreadGroupDemo();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1, runnable, "one");
		t1.start();
		Thread t2 = new Thread(tg1, runnable, "two");
		t2.start();
		Thread t3 = new Thread(tg1, runnable, "three");
		t3.start();
		System.out.println("Thread Group Name: " + tg1.getName());
		System.out.println("Thread group threds count: " + tg1.activeCount());
		tg1.list();

		Thread[] grp = new Thread[tg1.activeCount()];

		// number of threads kept in this array 
		int existingThreads = tg1.enumerate(grp);
		System.out.println();
		
		// To destroy all the threds in the group
		tg1.destroy();
	}
}