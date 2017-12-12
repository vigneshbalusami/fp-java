package org.third;

public class ThreadExample3 {
	public static void main(String args[]) throws InterruptedException {
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");
		NewThread ob4 = new NewThread("Four");
		/*
		 * NewThread ob5=new NewThread("Five"); NewThread ob6=new
		 * NewThread("Six"); NewThread ob7=new NewThread("Seven"); NewThread
		 * ob8=new NewThread("Eight"); NewThread ob9=new NewThread("Nine");
		 * NewThread ob10=new NewThread("Ten");
		 */
		try {
			System.out.println("Waiting for End");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
	}
}