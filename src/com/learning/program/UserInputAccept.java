package com.learning.program;

import java.util.Scanner;

public class UserInputAccept {

	public static void main(String[] args) {

		// Basic to accept Name and Age
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your Age: ");
		int age = sc.nextInt();
		System.out.println("Name is : "+name+", Age is :"+age);
		
		System.out.print("Enter Numbe either 1 or 0 ");
		int number = sc.nextInt();
		if(number==1) {
			System.out.println(0);
		} else if(number==0){
			System.out.println(1);
		}
	}

}
