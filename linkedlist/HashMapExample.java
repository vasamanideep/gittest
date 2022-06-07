package com.java.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put("mango",1);//put elements in map
		map.put("cherry", 2);
		map.put("grapes",3);
		map.put("apple",4);
		System.out.println("iterating Hashmap");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
	}

}

