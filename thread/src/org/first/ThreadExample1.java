package org.first;

public class ThreadExample1
{
public static void main(String args[]) throws InterruptedException
{
NewThread nn=new NewThread();
System.out.println("Main Thread");
try{
	for(int i=5;i>0;i--)
	{
		System.out.println("Main Thread :"+i);
		Thread.sleep(1000);
	}
}
catch(InterruptedException e)
{
System.out.println("Main Thread Interrupted");
}
System.out.println("Main is exiting");
}
}