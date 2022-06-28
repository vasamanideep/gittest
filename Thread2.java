package com.practise.Q11;

public class Thread2 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("mani");
		}else {
			System.out.println("Thread2");
		}
	}
}


