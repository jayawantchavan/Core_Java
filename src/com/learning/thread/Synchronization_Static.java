package com.learning.thread;

class Tabless {
	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread111 extends Thread {
	public void run() {
		Tabless.printTable(1);
	}
}

class MyThread222 extends Thread {
	public void run() {
		Tabless.printTable(10);
	}
}

class MyThread3 extends Thread {
	public void run() {
		Tabless.printTable(100);
	}
}

class MyThread4 extends Thread {
	public void run() {
		Tabless.printTable(1000);
	}
}

public class Synchronization_Static {
	public static void main(String t[]) {
		MyThread111 t1 = new MyThread111();
		MyThread222 t2 = new MyThread222();
		MyThread3 t3 = new MyThread3();
		MyThread4 t4 = new MyThread4();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}