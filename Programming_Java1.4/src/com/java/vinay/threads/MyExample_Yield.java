package com.java.vinay.threads;

public class MyExample_Yield
{

	public static void main(String[] args)
	{
		Thread producer = new Producer();
		Thread consumer = new Consumer();

		producer.setPriority(Thread.MIN_PRIORITY); // Min Priority
		consumer.setPriority(Thread.MAX_PRIORITY); // Max Priority

		producer.start();
		consumer.start();
	}

}

class Producer extends Thread
{

	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("I am Producer : Produced Item " + i);
			Thread.yield();
		}
	}
}

class Consumer extends Thread
{

	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("I am Consumer : Consumed Item " + i);
			Thread.yield();
		}
	}
}

/* Important Comments :-
	Created two threads named producer and consumer for no specific reason. Producer is set to minimum priority and
	consumer is set to maximum priority. I will run below code with/without commenting the line Thread.yield(). 
	- Without  yield(), though the output changes sometimes, but usually first all consumer lines are printed and then all producer lines.
	- With using yield() method, both prints one line at a time and pass the chance to another thread, almost all the time.
*/