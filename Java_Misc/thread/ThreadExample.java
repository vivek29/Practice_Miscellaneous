package com.practice.thread;

// The procedure for creating threads based on extending the Thread is as follows:

// 1. A class extending the Thread class overrides the run() method from the Thread class to define the code executed by the thread.

// 2. This subclass may call a Thread constructor explicitly in its constructors to initialize the thread, using the super() call.

// 3. The start() method inherited from the Thread class is invoked on the object of the class to make the thread eligible for running.

// Below is a program that illustrates instantiation and running of threads by extending the
// Thread class instead of implementing the Runnable interface. To start the thread you need
// to invoke the start() method on your object.

class XThread extends Thread {

	XThread() {						// default constructor
		}
	XThread(String threadName) {
		super(threadName); // Initialize thread.
		System.out.println(this);
		start();
	}
	public void run() {
		//Display info about this particular thread
		System.out.println(Thread.currentThread().getName());
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new XThread(), "thread1");
		Thread thread2 = new Thread(new XThread(), "thread2");
		//	    The below 2 threads are assigned default names

		Thread thread3 = new XThread();
		Thread thread4 = new XThread();
		Thread thread5 = new XThread("thread5");
		
		//Start the threads
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		try {
	//The sleep() method is invoked on the main thread to cause a one second delay.
			Thread.currentThread().sleep(1000);
		} 
		catch (InterruptedException e) {
		}
		
		//Display info about the main thread
		System.out.println(Thread.currentThread());
	}
}

/*
  
 When creating threads, there are two reasons why implementing the Runnable interface may be
 preferable to extending the Thread class:

1. Extending the Thread class means that the subclass cannot extend any other class, whereas a
 class implementing the Runnable interface has this option.

2. A class might only be interested in being runnable, and therefore, inheriting the full
 overhead of the Thread class would be excessive.
 
 */
