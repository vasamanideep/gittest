package com.practise.Q11;

public class DaemonMain {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

}
