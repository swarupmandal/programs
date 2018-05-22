package org.thread;

import java.util.Iterator;
import java.util.List;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		/*System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		MyThread myThread = new MyThread();
		myThread.start();
		
		System.out.println(myThread.getThreadGroup().getParent().getName());*/
		
		
		
		/*ThreadGroup g1 = new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());
		
		ThreadGroup g2 = new ThreadGroup(g1, "Second Group");
		System.out.println(g2.getParent().getName());
		System.out.println(g2.getName());
		
		
		System.out.println(g2.getMaxPriority());*/
		
		
		/*ThreadGroup gorup1 = new ThreadGroup("gorup1");
		Thread tg1 =new Thread(gorup1, "tg1");
		Thread tg2 =new Thread(gorup1, "tg2");
		
		gorup1.setMaxPriority(2);
		
		Thread tg3 =new Thread(gorup1, "tg3");
		
		System.out.println("TG1 Prio " + tg1.getPriority());
		System.out.println("TG2 Prio " + tg2.getPriority());
		System.out.println("TG3 Prio " + tg3.getPriority());
		
		gorup1.list();*/
		
		/*ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[system.activeCount()];
		system.enumerate(t);
		for(Thread thread : t){
			System.out.println(thread.getName());
		}*/
		Display d = new Display();
		
		MyThread t1 = new MyThread(d, "dhoni");
		MyThread t2 = new MyThread(d, "Yubraj");
		
		t1.start();
		t2.start();
		
		
		
		
	}
	
	

}
