package com.java.linkedlist;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> vec=new Vector<String>();
		vec.add("tiger");
		vec.add("cat");
		vec.add("dog");
		vec.add("horse");
		vec.addElement("lion");
		vec.addElement("elephant");
		vec.addElement("rat");
		System.out.println("Elements are:"+vec);
		
	}

}
