package com.practise.Q13;

public class Name extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Person name is pavankalyan");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
