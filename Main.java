package com.practice.Q7;
import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        System.out.println("TreeSet: " + numbers);

        // Using higher()
        System.out.println("Using higher: " + numbers.higher(1));

        // Using lower()
        System.out.println("Using lower: " + numbers.lower(6));

        // Using ceiling()
        System.out.println("Using ceiling: " + numbers.ceiling(5));

        // Using floor()
        System.out.println("Using floor: " + numbers.floor(6));

    }
}