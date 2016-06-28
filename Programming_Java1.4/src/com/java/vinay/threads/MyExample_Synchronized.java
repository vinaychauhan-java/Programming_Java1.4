package com.java.vinay.threads;

public class MyExample_Synchronized
{

	public static void main(String args[])
	{
		Share share = new Share();
		MyThread m1 = new MyThread(share, "Thread1");
		MyThread m2 = new MyThread(share, "Thread2");
		MyThread m3 = new MyThread(share, "Thread3");
	}
}

class MyThread extends Thread
{

	Share share;

	MyThread(Share share, String threadName)
	{
		super(threadName);
		this.share = share;
		start();
	}

	public void run()
	{
		share.getData(Thread.currentThread().getName());
	}
}

class Share
{

//	public synchronized void getData(String str)
//	{
//		for (int i = 0; i < 5; i++)
//		{
//			System.out.println("Thread Name : " + str + " : " + i);
//			try
//			{
//				Thread.sleep(1000);
//			}
//			catch (Exception e)
//			{
//			}
//		}
//	}
	
	public void getData(String str)
	{
	
		synchronized (this)
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.println("Thread Name : " + str + " : " + i);
				try
				{
					Thread.sleep(1000);
				}
				catch (Exception e)
				{
				}
			}
		}
	}
}