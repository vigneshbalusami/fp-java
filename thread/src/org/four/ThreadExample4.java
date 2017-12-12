package org.four;

public class ThreadExample4 {
	public static void main(String args[]) throws InterruptedException {
		NewThread ob1 = new NewThread("One");
		System.out.println("Now...." + ob1.t.getState());
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");
		System.out.println("Thread One status" + (ob1.t.isAlive() ? "   Alive" : "   No"));
		System.out.println("Thread Two status" + (ob2.t.isAlive() ? "   Alive" : "   No"));
		System.out.println("Thread Three status" + (ob3.t.isAlive() ? "   Alive" : "   No"));
		try {
			Thread.sleep(1000);
			System.out.println("Thread One is going to sleep");
			ob1.t.suspend();
			System.out.println("Now...." + ob1.t.getState());
			System.out.println("Thread One is going to resume the process");
			ob1.t.resume();
			System.out.println("Now...." + ob1.t.getState());
			System.out.println("Waiting for End");
			Thread.sleep(1000);
			ob1.t.join();
			System.out.println("One status  " + ob1.t.getState());
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Thread One status" + (ob1.t.isAlive() ? "   Alive" : "   No"));
		System.out.println("Thread Two status" + (ob2.t.isAlive() ? "   Alive" : "   No"));
		System.out.println("Thread Three status" + (ob3.t.isAlive() ? "   Alive" : "   No"));
	}
}