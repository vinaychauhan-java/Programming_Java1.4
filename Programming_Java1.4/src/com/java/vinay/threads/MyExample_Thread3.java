package com.java.vinay.threads;

public class MyExample_Thread3 implements Runnable
{

	public void run()
	{
		System.out.println("Start :: In Run Method");
		for (int i = 0; i <= 5; i++)
		{
			System.out.println(Thread.currentThread() + " :: " + i);
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
		Thread obj1 = new Thread(new MyExample_Thread3());
		Thread obj2 = new Thread(new MyExample_Thread3());
		obj1.setName("Thread-1");
		obj1.start();
		obj2.setName("Thread-2");
		obj2.start();
		System.out.println("Close :: In Main Method");

	}
}
