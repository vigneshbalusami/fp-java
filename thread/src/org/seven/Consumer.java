package org.seven;

class Consumer implements Runnable {
	Queen q;

	Consumer(Queen q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}

	public void run() {
		while (true)
			q.get();
	}
}