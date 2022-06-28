package com.practise.Q4;

public class Programs {
	static Object id;
	String name;
	static String fullname;

	Programs(int id, String name, String fullname) {
		this.id = id;
		this.name = name;
		this.fullname = fullname;
	}

	public static void main(String[] args) {

		Programs p = new Programs(1940, "guptha", "vasa manideep");
		System.out.println(p.hashCode());
		System.out.println(id.toString());
		System.out.println(p.name.equals(fullname));

	}

}
