package com.java.q1;

public class Association {

	public static void main(String[] args) {
		Company1 cmp = new Company1("Techouts");
		Employee emp = new Employee("mani", "2032", 5);
		Employee2 emp2 = new Employee2("guptha", "2030", 6);

		System.out.println(cmp.getCompanyName() + " " + emp.getName() + " " + emp.getYear() + " " + emp.getRating());
		System.out.println(cmp.getCompanyName() + " " + emp2.getName() + " " + emp2.getYear() + " " + emp2.getRating());

	}

}
