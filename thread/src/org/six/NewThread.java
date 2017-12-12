package org.six;

class NewThread implements Runnable {
	Thread t;
	Callme ca;
	String msg;

	public NewThread(Callme c, String n, String m) {
		msg = m;
		this.ca = c;
		t = new Thread(this, n);
		t.start();
	}

	public void run() {
		try {
			Thread.sleep(1000);
			synchronized (ca) {
				ca.call(msg);
			}
		} catch (InterruptedException e) {
			System.out.println("Child Thread Interrupted");
		}
	}
}
