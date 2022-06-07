package com.java.linkedlist;
import java.util.*;
public class LinkedHashMap1 {


	public static void main(String[] args) {
		LinkedHashMap<Integer,String>hm=new LinkedHashMap<Integer,String>();
	hm.put(100, "amith");
	hm.put(200, "vijay");
	hm.put(111,"rahul");
	for(Map.Entry m:hm.entrySet()) {
		System.out.println(m.getKey()+" " +m.getValue());
		
	}
		
		
		
	}

}
