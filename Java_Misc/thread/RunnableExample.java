package com.practice.thread;

// One way to create a thread in java is to implement the Runnable Interface and then
// instantiate an object of the class. We need to override the run() method into our class
// which is the only method that needs to be implemented. The run() method contains the logic
// of the thread.

//The procedure for creating threads based on the Runnable interface is as follows:
// 1. A class implements the Runnable interface, providing the run() method that will be executed by the thread. An object of this class is a Runnable object.

// 2. An object of Thread class is created by passing a Runnable object as argument to the Thread constructor. The Thread object now has a Runnable object that implements the run() method.

// 3. The start() method is invoked on the Thread object created in the previous step. The start() method returns immediately after a thread has been spawned.

// 4. The thread ends when the run() method ends, either by normal completion or by throwing an uncaught exception.

// Below is a program that illustrates instantiation and running of threads using the runnable
// interface instead of extending the Thread class. To start the thread you need to invoke the
// start() method on your object.


class RunnableThread implements Runnable {

	public RunnableThread() {				// default constructor is necessary. 
System.out.println("Hello constructor");
	}										// else run time error
	
	public RunnableThread(String threadName) {
		Thread runner = new Thread(this, threadName); // (1) Create a new thread.
		System.out.println(runner.getName());
		runner.start(); // (2) Start the thread.
	}
	
	public void run() {				// it runs the first
		//Display info about this particular thread
		System.out.println(Thread.currentThread());	// Thread[threadname,5,callfromwhichthread]
	}											// i.e Thread[thread3,5,main]	
}												// and so on.

public class RunnableExample {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new RunnableThread(), "thread1");
		Thread thread2 = new Thread(new RunnableThread(), "thread2");
		RunnableThread thread3 = new RunnableThread("thread3");
		Thread thread4 = new Thread(new RunnableThread(), "thread4");
		//Start the threads
		thread1.start();
		thread2.start();
		thread4.start();
		try {
			//delay for one second
			Thread.currentThread().sleep(1000);			// sleeps the main thread
		} 
		catch (InterruptedException e) {
		}
		//Display info about the main thread
		System.out.println(Thread.currentThread());		// stops for above specified time and
	}													// than gets displayed
}

// This approach of creating a thread by implementing the Runnable Interface must be used
// whenever the class being used to instantiate the thread object is required to extend some
// other class.
