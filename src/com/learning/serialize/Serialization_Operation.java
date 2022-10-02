package com.learning.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Serialization_Operation {

	public static void main(String[] args) {
		serialize();
		deserialize();
	}

	public static void serialize() {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Jay", "IT"));
		list.add(new Employee(2, "Shital", "Civil"));
		list.add(new Employee(3, "Pankaj", "CLOUD"));
		list.add(new Employee(4, "NAMRAT", "ENTC"));

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("src/com/learning/serialize/serializedFile.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

	}
	
	public static void deserialize() {

		List<Employee> list = new ArrayList<Employee>();

		FileInputStream fos = null;
		ObjectInputStream oos = null;

		try {
			fos = new FileInputStream("src/com/learning/serialize/serializedFile.dat");
			oos = new ObjectInputStream(fos);
			list = (List<Employee>)oos.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		list.stream().forEach(x->System.out.println(x+" "));
	}
}
