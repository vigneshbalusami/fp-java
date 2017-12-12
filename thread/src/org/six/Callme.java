package org.six;

class Callme {
	void call(String m) {
		try {
			System.out.print("\n[" + m);
			System.out.print("]");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
	}
}