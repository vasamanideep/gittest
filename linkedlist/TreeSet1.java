package com.java.linkedlist;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {

TreeSet<String> al=new TreeSet<String>();
al.add("ravi");
al.add("manish");
al.add("satish");
al.add("ashok");
Iterator<String> itr=al.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
