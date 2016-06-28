package com.java.vinay.threads;

public class MyExample_Thread2 implements Runnable
{

	public void run()
	{
		System.out.println("Start :: In Run Method");
		for (int i = 0; i <= 5; i++)
		{
			System.out.println(Thread.currentThread() + " :: " + i);
			try
			{
				Thread.sleep(2000);
				
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
		Thread obj1 = new Thread(new MyExample_Thread2());
		obj1.setName("Thread-1");
		obj1.start();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i <= 10; i++)
		{
			// System.out.println(Thread.currentThread() + " :: " + i);
			long processTime = System.currentTimeMillis();
			try
			{
				long elapsedTime = processTime - startTime;
				System.out.println("Elapsed Time : " + elapsedTime);
				Thread.sleep(1000);
				if (elapsedTime > 4000)
				{
					obj1.stop();
				}
			}
			catch (InterruptedException exc)
			{
				System.err.println(exc);
			}
		}
		System.out.println("Close :: In Main Method");
	}
}
