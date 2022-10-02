package com.learning.collections;

import java.util.*;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// basicOperation();
		 sortByJava8();
		//classInInterface();
		

	}

	public static void classInInterface(){
		int a = new Test.Testclass(5).getA();
		System.out.println(a);
		
	}
	
	public static void sortByJava8() {
		Employee e1 = new Employee(1, "Jay", "IT", new Date());
		Employee e2 = new Employee(2, "Shital", "CIVIL", new Date());
		Employee e3 = new Employee(7, "Jay", "IT", new Date());
		Employee e4 = new Employee(3, "Shital", "CIVIL", new Date());
		Employee e5 = new Employee(3, "Jay", "IT", new Date());
		Employee e6 = new Employee(4, "Shital", "CIVIL", new Date());
		List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5, e6);
		list.stream().forEach(x->System.out.println(x.toString()));
		System.out.println();
		List<Employee> sortedList = list.stream().sorted(Comparator.comparing(Employee::getId)).distinct().collect(Collectors.toList());
		sortedList.stream().forEachOrdered(x->System.out.println(x.toString()));
		
		// findFirst findAny
		System.out.println(list.stream().findFirst());
		System.out.println(list.stream().findAny());
		
	}

	public static void basicOperation() {
		Employee e1 = new Employee(1, "Jay", "IT", new Date());
		Employee e2 = new Employee(2, "Shital", "CIVIL", new Date());

		List<Employee> list = new LinkedList<>();
		list.add(e2);
		list.add(e1);
		System.out.println(list.get(1));

		TreeMap<String, Employee> map = new TreeMap<String, Employee>();
		// No Null value allowed
		map.put("Jay", e1);
		map.put("First", e2);

		for (Map.Entry<String, Employee> obj : map.entrySet()) {
			System.out.println(obj.getKey());
			System.out.println(obj.getValue());
		}
	}
}

interface Test{

	class Testclass{
		int a;

		public Testclass(int a) {
			this.a = a;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		@Override
		public String toString() {
			return "testclass [a=" + a + "]";
		}
	}
}