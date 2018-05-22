package org.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Display {

	ReentrantLock l = new ReentrantLock();
	
public void wish(String name){
		
	
	//l.lock(); // line 1
	
	try {
		//if(l.tryLock(){
		
		if(l.tryLock(5, TimeUnit.SECONDS)){
			System.out.println("First Task " + Thread.currentThread().getName());
			for(int i =0; i<10;i++){
				System.out.print("Good Morning ");
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					
				}
				System.out.println(name);
			}
			l.unlock(); // line 2
		}else {
			System.out.println("Alternate task : - " + Thread.currentThread().getName());

			for(int i =0; i<10;i++){
				System.out.print("Good Morning ");
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					
				}
				System.out.println(name);
			}
			
		
			
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
		//l.unlock(); // line 2
	}

public void wish(String name, int x){
		
	
	
	
	try {
		//if(l.tryLock(){
		
		if(l.tryLock(5, TimeUnit.SECONDS)){
			System.out.println("First Task " + Thread.currentThread().getName());
			for(int i =0; i<10;i++){
				System.out.print("Good Morning ");
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					
				}
				System.out.println(name);
			}
			l.unlock(); // line 2
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
		//l.unlock(); // line 2
	}
}
