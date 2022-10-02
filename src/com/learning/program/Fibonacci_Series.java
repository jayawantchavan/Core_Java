package com.learning.program;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any possitive number to Start Fibonacci Series");
		long number = sc.nextLong();
		System.out.println("Enter Limit for Fibonacci");
		long level = sc.nextLong();
		long first = number;
		long second = first;
		System.out.print(first+ " ");
		System.out.print(second+ " ");
		while (level > 2) {
			long third = first + second;
			System.out.print(third+ " ");
			first =  second;
			second = third;
			level--;
		}

	}

}
