package com.java.vinay.loops;

public class MyLoopsExample1
{

	public static void main(String[] args)
	{

		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				// System.out.print(i + " ");
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println();
		System.out.print("*****************************");
		System.out.println();
		System.out.println();

		int j = 1;
		while (j <= 10)
		{
			System.out.print(j + " ");
			j++;
		}

		System.out.println();
		System.out.println();
		System.out.print("*****************************");
		System.out.println();
		System.out.println();

		int k = 1;
		do
		{
			System.out.print(k + " ");
			k++;
		}
		while (k <= 10);

	}

}
