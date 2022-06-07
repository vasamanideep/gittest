package com.java.arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayExample2 {

	public static void main(String[] args) {
ArrayList<String> list=new ArrayList<String>();
list.add("mango");
list.add("banana");
list.add("GRAPES");
list.add("apple");
Iterator itr=list.iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}
}
}
