package com.java.vinay.threads;

public class MyExample_Thread1 extends Thread
{

	MyExample_Thread1(String threadName)
	{
		super(threadName);
	}

	public void run()
	{
		System.out.println("Start :: In Run Method");
		for (int i = 0; i <= 5; i++)
		{
			System.out.println(this.getName() + " :: " + i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException exc)
			{
				System.err.println(exc);
			}
		}
		System.out.println("Close :: In Run Method");
	}

	public static void main(String[] args)
	{
		System.out.println("Start :: In Main Method");
		MyExample_Thread1 obj1 = new MyExample_Thread1("Thread-1");
		MyExample_Thread1 obj2 = new MyExample_Thread1("Thread-2");
		obj1.start();
		obj2.start();
		new MyExample_Thread1("Thread-3").start();
		System.out.println("Close :: In Main Method");

	}
}
