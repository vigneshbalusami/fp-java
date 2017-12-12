package org.five;

class Producer implements Runnable
{
	Queen q;
	Producer(Queen q)
	{
		this.q=q;
		new Thread(this,"Producer").start();
	}
	public void run()
	{
		int i=0;
			while(true)
				q.put(i++);
	}
}