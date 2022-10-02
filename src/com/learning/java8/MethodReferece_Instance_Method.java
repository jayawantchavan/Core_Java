package com.learning.java8;

interface Sayables {

	void say();

}

// instanceName::methodname
public class MethodReferece_Instance_Method {

	public void saySomething() {
		System.out.println("Inside Method refernce by instance method");
	}

	public static void main(String[] args) {
		MethodReferece_Instance_Method obj = new MethodReferece_Instance_Method();
		
	    // Referring instance method  
		Sayables sayable = obj::saySomething;
		sayable.say();

	}
}
