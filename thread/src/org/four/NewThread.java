package org.four;

class NewThread implements Runnable {
	Thread t;

	public NewThread(String n) {
		t = new Thread(this, n);
		System.out.println(" " + t.getState());
		System.out.println("Thread Name : " + t.getName());
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread  " + t.getName() + " :" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Child" + t.getName() + " is exiting");
	}
}