package com.java.vinay.arrays;


public class MyArrayExample2
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30,40,50};
		for (int i=0;i<5;i++){
			System.out.print(a[i]+" ");
		}

		System.out.println();System.out.println();
		System.out.print("*****************************");
		System.out.println();System.out.println();
		
		String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
		for (int i=0;i<5;i++){
			System.out.print(days[i]+" ");
		}
		
		System.out.println();System.out.println();
		System.out.print("*****************************");
		System.out.println();System.out.println();
		
		String[][] values = {{"1","2","3"},{"11","22","33"}};
		for (int i=0;i<2;i++){
			for (int j=0;j<3;j++){
				System.out.print(values[i][j]);	
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.println();System.out.println();
		System.out.print("*****************************");
		System.out.println();System.out.println();		
	
	}
}
