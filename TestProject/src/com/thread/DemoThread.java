package com.thread;

public class DemoThread {

	public static void main(String[] args) {

		TestThread testThread = new TestThread();
		Thread t1 = new Thread(testThread);

		t1.start();
	}

}
