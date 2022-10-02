package com.learning.program;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any number");
		long number = sc.nextLong();
		long originalNum = number;
		long sumOfCube = 0L	;

		while (number !=0) {
			long digit = number % 10;
			sumOfCube = (digit * digit * digit) + sumOfCube;
			number = number / 10;
		}
		if (originalNum == sumOfCube) {
			System.out.println("Given Number is armstrong");
		} else {
			System.out.println("Given Number is not armstrong");
		}

	}

}
