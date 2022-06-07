package com.java.linkedlist;

public class Comparable {

	public static void main(String[] args) {
		int rollno;  
		String name;  
		int age;  


	private int rollno;		void Student(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
		}  
		  
		public int compareTo(Student st){  
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  
	}

}
