package com.java.linkedlist;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(1,"amith");
		map.put(2, "sai");
		map.put(3, "mallika");
		map.put(4, "teja");
		map.put(5, "sri");
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
