package com.thread;

public class TestSleepMethod1 extends Thread {

	public void run() {

		for (int i = 1; i <=5; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		TestSleepMethod1 method1 = new TestSleepMethod1();
		TestSleepMethod1 method2 = new TestSleepMethod1();
		TestSleepMethod1 method3 = new TestSleepMethod1();
		method1.setDaemon(true);
		method1.start();
		System.out.println(method1.getId());
		System.out.println(method1.getName());
		System.out.println(method1.getPriority());
		/*try {
			method1.join();
		} catch (Exception e) {
			System.out.println(e);
		}*/
		
		
		method2.start();
		method3.start();
	}

}
