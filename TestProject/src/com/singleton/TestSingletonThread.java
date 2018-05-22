package com.singleton;

public class TestSingletonThread {

	public static void main(String[] args) throws InterruptedException {
		
		 //Thread 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
            	LazySingleton instance1 = LazySingleton.getInstance();
                System.out.println("Instance 1 hash:" + System.identityHashCode(instance1));
            }
        });

        //Thread 2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
            	LazySingleton instance2 = LazySingleton.getInstance();
                System.out.println("Instance 2 hash:" + System.identityHashCode(instance2));
            }
        });
        
        /*//Thread 1
        Thread t9 = new Thread(new Runnable() {
            @Override
            public void run() {
            	LazySingleton instance9 = LazySingleton.getInstance();
                System.out.println("Instance 9 hash:" + System.identityHashCode(instance9));
            }
        });

        //Thread 2
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
            	LazySingleton instance3 = LazySingleton.getInstance();
                System.out.println("Instance 3 hash:" + System.identityHashCode(instance3));
            }
        });
        
        //Thread 1
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
            	LazySingleton instance4 = LazySingleton.getInstance();
                System.out.println("Instance 4 hash:" + System.identityHashCode(instance4));
            }
        });

        //Thread 2
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
            	LazySingleton instance5 = LazySingleton.getInstance();
                System.out.println("Instance 5 hash:" + System.identityHashCode(instance5));
            }
        });
        
        //Thread 1
        Thread t7 = new Thread(new Runnable() {
            @Override
            public void run() {
            	LazySingleton instance7 = LazySingleton.getInstance();
                System.out.println("Instance 7 hash:" + System.identityHashCode(instance7));
            }
        });

        //Thread 2
        Thread t8 = new Thread(new Runnable() {
            @Override
            public void run() {
            	LazySingleton instance8 = LazySingleton.getInstance();
                System.out.println("Instance 8 hash:" + System.identityHashCode(instance8));
            }
        });
        
        Thread t6 = new Thread(new Runnable() {
            @Override
            public void run() {
            	LazySingleton instance6 = LazySingleton.getInstance();
                System.out.println("Instance 6 hash:" + System.identityHashCode(instance6));
            }
        });*/

        //start both the threads
        t1.start();
        //Thread.sleep(1000);
        t2.start();
        /*t3.start();
        //Thread.sleep(1000);
        t4.start();
        t5.start();
        t6.start();
        //Thread.sleep(1000);
        t7.start();
        t8.start();
        //Thread.sleep(1000);
        t9.start();*/

	}

}
