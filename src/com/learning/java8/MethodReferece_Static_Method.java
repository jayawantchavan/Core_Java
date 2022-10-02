package com.learning.java8;

interface Sayable {

	void say();

}

// Classname::methodname
public class MethodReferece_Static_Method {

	public static void saySomething() {
		System.out.println("Inside Method refernce by static method");
	}

	public static void main(String[] args) {
		
	    // Referring static method  
		Sayable sayable = MethodReferece_Static_Method::saySomething;
		sayable.say();

	}
}
