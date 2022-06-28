package com.practise.Q13;

public class Contact extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Contact number is 9515679407");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
