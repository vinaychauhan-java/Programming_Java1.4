package com.java.vinay.arrays;


public class MyArrayExample1
{

	public static void main(String[] args)
	{
		int[] a = new int [5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		for (int i=0;i<5;i++){
			System.out.print(a[i]+" ");
		}

		System.out.println();System.out.println();
		System.out.print("*****************************");
		System.out.println();System.out.println();
		
		int[][] b = null;
		b = new int[2][2];
		b[0][0] = 10;
		b[0][1] = 20;
		b[1][0] = 30;
		b[1][1] = 40;
		for (int i=0;i<2;i++){
			for (int j=0;j<2;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
