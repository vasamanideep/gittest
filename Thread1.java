package com.practise.Q11;

public class Thread1 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("vasa");
		}else {
			System.out.println("Thread1");
		}
	}
}


