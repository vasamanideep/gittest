package com.practise.Q11;

public class Thread3 extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("deep");
		} else {
			System.out.println("Thread3");
		}
	}
}
