package org.seven;

import java.io.*;
import java.lang.*;

class Queen {
	int n;
	boolean status = false;

	synchronized int get() {
		if (!status) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Child Thread Interrupted");
			}
		}
		System.out.println("Iyyyyeeee i got : " + this.n);
		status = false;
		notify();
		return this.n;
	}

	synchronized void put(int n) {
		if (status) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Child Thread Interrupted");
			}
		}
		this.n = n;
		status = true;
		notify();
		System.out.println("Hmmmmm i set : " + this.n);
	}
}