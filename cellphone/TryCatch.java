package com.cellphone;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int d=10/2;//infinity
			System.out.println("1");
		}
		catch(Exception e) {
			System.out.println("e");
			System.out.println("3");
		}
		finally {
			System.out.println("im executed");
		}
		System.out.println("m");
		
	}

}
