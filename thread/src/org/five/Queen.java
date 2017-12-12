package org.five;

class Queen
{
	int n;
	synchronized int get()
	{
		System.out.println("i got : "+this.n);
		return this.n;
	}
	synchronized void put(int n)
	{
		this.n=n;
		System.out.println("i set : "+this.n);
	}
}
