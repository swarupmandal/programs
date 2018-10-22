package com.thread;

public class ThreadMain {

	public static void main(String[] args) {
	
		MyThread thread1 = new MyThread();
		Thread thread = new Thread(thread1);
		thread.start();
		
		for(int i = 1 ; i <= 5; i++){
			System.out.println("Main Thread " + i);
		}
		
		
	}	
}
