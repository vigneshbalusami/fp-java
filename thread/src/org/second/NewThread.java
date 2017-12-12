package org.second;

class NewThread extends Thread {
	public NewThread() {
		super("Child Thread");
		System.out.println("Child Thread");
		//start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread :" + i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Child is exiting");
	}
}