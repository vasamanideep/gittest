package com.practise.Q8;

import java.util.TreeSet;

public class Question8 {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		try {

			ts.add(3);
			ts.add(4);
			ts.add("manideep");
			ts.add(0.8);
			ts.add('7');

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ts);

	}

}