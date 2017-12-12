package org.second;

public class ThreadExample2 {
	public static void main(String args[]) throws InterruptedException {
		NewThread n = new NewThread();
		// n.start();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread :" + i);
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main is exiting");
	}
}