package com.learning.cloning.DeepCloning;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import com.learning.cloning.DeepCloning.Employee;

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		deepCopy();
	}
	
	// Shallow copy /cloning -> for inner referenced field -> reference get copy and so still both object will have same ref.
	// e1.date.hashCode() & e2.date.hashCode() will same
	public static void deepCopy() throws CloneNotSupportedException {
		
		Employee e5 = new Employee(1, "Jay", "IT", new Date());
		System.out.println(e5);
		System.out.println(e5.getBirthDate());
		System.out.println(e5.getBirthDate().hashCode());
		
		// Deep Copy will be there
		Employee e6 = (Employee) e5.clone();
		e6.getBirthDate().setDate(12);
		System.out.println(e6.toString());
		System.out.println("e5 BirthDate "+e5.getBirthDate());
		System.out.println("e6 BirthDate "+e6.getBirthDate());
		System.out.println(e6.getBirthDate().hashCode());
	}

	public static void objectCreation() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, NoSuchMethodException, SecurityException {
		// Ways to create object
		// By New
		Employee e1 = new Employee(1, "Jay", "IT", new Date());
		System.out.println(e1);

		// By clone
		Employee e2 = (Employee) e1.clone();
		System.out.println(e2.toString());

		// By New instance method of class
		Employee e3 = Employee.class.newInstance();
		System.out.println(e3);

		// By New instance method of constructor
		Constructor<Employee> constructor = Employee.class.getConstructor();
		Employee e4 = constructor.newInstance();
		System.out.println(e4);

	}
}
