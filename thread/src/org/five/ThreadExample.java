package org.five;

class ThreadExample6
{
	public static void main(String args[])
	{
		Queen q=new Queen();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Ctrl-c to stop");
	}
}