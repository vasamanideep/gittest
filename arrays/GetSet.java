package com.java.arrays;

import java.util.ArrayList;

public class GetSet {

	public static void main(String[] args) {
ArrayList<String> a1=new ArrayList<String>();

a1.add("mango");
a1.add("grapes");
a1.add("mango1");
a1.add("banana");
a1.add("apple");
System.out.println("returning element:"+a1.get(2));
a1.set(2,"manideep");
for(String fruit:a1)
System.out.println(fruit);

	}

}
