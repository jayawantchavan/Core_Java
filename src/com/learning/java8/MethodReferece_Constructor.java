package com.learning.java8;

interface Sayabless {

	void say();

}

// Classname::new
public class MethodReferece_Constructor {

	MethodReferece_Constructor() {
		System.out.println("Inside Method refernce by construtor");
	}

	public static void main(String[] args) {
				
	    // Referring instance method  
		Sayabless sayable = MethodReferece_Constructor::new;
		sayable.say();

	}
}
