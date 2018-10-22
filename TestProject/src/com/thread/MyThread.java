package com.thread;

public class MyThread implements Runnable{

	@Override
	public void run() {
		
		for(int i =1 ; i <= 5 ; i++){
			System.out.println("Child Thread " + i);
			Thread.yield();
		}
		
		
		
	}

}
