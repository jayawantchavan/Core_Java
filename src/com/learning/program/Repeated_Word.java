package com.learning.program;

import java.util.*;
import java.util.Map.Entry;

public class Repeated_Word {

	public static void main(String[] args) {

		String string = "Big black bug bit a big black dog on his big black nose";

		String[] strarr = string.toLowerCase().split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String string2 : strarr) {
             
			if(map.get(string2) != null) {
				map.put(string2, map.get(string2)+1);
			} else {
				map.put(string2, 1);
			}
		}

		Set<Entry<String, Integer>> entry = map.entrySet();
		
		for(Entry<String, Integer> ent: entry) {
			System.out.println(ent.getKey()+ "  "+ent.getValue());
		}
	}

}
