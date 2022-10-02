package com.learning.java8;


interface Sayablessss {

	void say();

}

public class LambdaExpression {

	public static void main(String[] args) {
				
		Sayablessss sayable = ()->{System.out.println("inside Lambda");};
		sayable.say();
	}
}
