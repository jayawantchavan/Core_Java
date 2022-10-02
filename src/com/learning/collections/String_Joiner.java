package com.learning.collections;

import java.util.StringJoiner;

public class String_Joiner {

	public static void main(String[] args) {

		StringJoiner joiner = new StringJoiner(",", "{", "}");
		joiner.add("Shital");
		joiner.add("Jayawant");
		joiner.add("Chavan");
		System.out.println(joiner);
	}

}
