package com.learning.thread;

import java.lang.invoke.VolatileCallSite;

public class OddEvenNumber_Interthread_Communication {

	public static void main(String[] args) throws InterruptedException {
		OddEvenNumbers oe = new OddEvenNumbers();
		// creating a thread th1
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					oe.displayOddNumber();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});

		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					oe.displayEvenNumber();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});
		th1.start();
		th2.start();
	}
}

class OddEvenNumbers extends Thread {
	
	// this is shared resource which is having number variable
	int number = 1;

	public void displayOddNumber() throws InterruptedException {

		synchronized (this) {

			while (number < 20) {

				if (number % 2 == 0) {
					wait();
				}
				this.sleep(500);
				System.out.print(number + " ");
				number= number + 1;
				notify();
			}

		}
	}

	public void displayEvenNumber() throws InterruptedException {

		synchronized (this) {

			while (number < 20) {

				if (number % 2 == 1) {
					wait();
				}
				this.sleep(500);
				System.out.print(number + " ");
				number = number + 1;
				notify();
			}

		}
	}
}
