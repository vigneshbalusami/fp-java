package org.first;
import java.io.*;
import java.lang.*;
class NewThread implements Runnable
{
Thread t;
public NewThread()
{
t=new Thread(this,"Child Thread");
System.out.println("Thread Name : "+t);
t.start();
}
public void run()
{
	try{
	for(int i=5;i>0;i--)
	{
		System.out.println("Child Thread :"+i);
		Thread.sleep(500);
	}
	}
	catch(InterruptedException e)
	{
		System.out.println("Child Thread Interrupted");
	}
System.out.println("Child is exiting");
}
}